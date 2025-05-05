package Q13;

import java.io.File; //provides input/output streams used to write/read data to input/output sources 
import java.io.IOException; //handles input/output exceptions 
import java.io.FileNotFoundException; //checked expemtion indicates attempt to access file that does not exist/cannot be found
import java.io.PrintWriter; //more versatile than FileWriter, also prvides methods for printing formatted output
import java.io.FileReader; //both FileReader/BufferedReader used to read file line by line
import java.io.BufferedReader;
import java.util.Scanner; //capture user input from console;

public class Methods 
{
    public static void getRequirements() 
    {
        //display operational messages 
        System.out.println("Author: Amanda Leon");
        System.out.println("Program Requirements:");
        System.out.println("Program captures user input, writes to and reads from the same file, and counts number of words in file.");
        System.out.println("Hint: use hasNext() method to read number of words (tokens).");

        System.out.println(); //blank line 
    }

    public static File fileWrite()
    {
        Scanner sc = new Scanner(System.in);
        File file = new File("filecountwords.txt");

        try (PrintWriter writer = new PrintWriter(file))
        {
            System.out.println("Write text to file (type 'exit' to quit): ");
            String input;

            while (!(input = sc.nextLine()).equalsIgnoreCase("exit"))
            {
                writer.println(input);
            }
        }
        catch (IOException e) 
        {
            System.err.println("Error writing to file: " + e.getMessage());
            file = null; //set to null indicates failure 
        }
        //finally block ensures code always executed after try/catch  blocks, regardless if exception thrown or caught
        finally 
        {
            sc.close();
        }
        return file;
    }

    public static void fileRead(File myFile)
    {
        //reads text from a chracter-based input stream, buffering character-based input stream, buffering character sfor efficient reading.
        //improves performance by reducing the number of disk access operators

        //declare object variab;es here to be seen by both try and finally blocks
        BufferedReader br = null;
        Scanner sc = null;

        try
        {
            FileReader fr = new FileReader(myFile);
            br = new BufferedReader(fr);
            sc = new Scanner(myFile);

            System.out.println("\nReading from file: " + myFile.getAbsolutePath());

            //print file contents 
            String line;
            while ((line = br.readLine()) != null)
            {
                //print each line
                System.out.println(line);
            }

            //count number of tokens
            int count = 0;
            while (sc.hasNext())
            {
                sc.next();
                count++;
            }

            System.out.println("\nNumber of tokens: " + count);
            //close Scanner object 
        }

        catch (FileNotFoundException e)
        {
            //System.err.println("File not found: " + e.getMessage()); only for testing
            System.err.println("File not found!");
        }
        catch (IOException e)
        {
            //e.printStackTrace(); only for testing
            //System.out.println("Error reading file: " + e.getMessage()); only for testing 
            System.out.println("Error reading file.");
        }
        finally
        {
            //ensure BufferedReader and Scanner objectsclosed to prevent resource leaks 
            if (br != null || sc != null)
            {
                try
                {
                    br.close();
                    sc.close();
                }
                catch (IOException e)
                {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
    
}