import java.util.Scanner;

public class Methods {
    public static void getRequirements()
    {
        System.out.println("Author: Amanda Leon");
        System.out.println("Program Requirements:");
        System.out.println("1. Create a string array (str1), based on users\' number of perffered programming languages.");
        System.out.println("2. Create a second string array (str2), based upon the length of str1 array.");
        System.out.println("3. Copy str1 array elements into str2.");
        System.out.println("4. Print elements of both arrays using Java\'s *enhanced* for loop.\n");
        System.out.println(); //blank line 
    }

    //value-returning method(static requires no object)
    public static String[] createArray()
    {
        Scanner sc = new Scanner(System.in);
        int arraySize = 0;

        //prompt user for favorite programming languages 
        //hasNext(); Returns true if scanner object has token input
        System.out.print("How many programmming languages do you have (min 1)?");
        while (!sc.hasNextInt()) 
        {
            System.out.println("Invalid input!\n");
            sc.next(); //important if ommitted, will fo into infinite loop on invalid input!
            System.out.print("Please try again. Enter valid input (min 1): ");
        }
        arraySize = sc.nextInt(); //valid input 

        while (arraySize < 1)
        {
            //include data validation
            System.out.print("\nList must be greater than 0. Please enter number of faborite programming languages: ");
            while (!sc.hasNextInt())
            {
                System.out.print("\nMust enter valid data: ");
                sc.next();
                System.out.print("Please try again. Enter valid input (min 1): ");
            }
            arraySize = sc.nextInt(); //valid int greater then 0 
        }

        //java style String[] myArray
        //C++ style String myArray[]
        String yourArray[] = new String[arraySize];
        return yourArray;
    }

    //nonvalue-returning methods accepts int array arg (static requires no object)
    public static void copyArray(String [] str1)
    {
        Scanner sc = new Scanner(System.in);
        //populate array 
        System.out.println("Please enter your " + str1.length + " favorite programming languages:");
        for (int i = 0; i < str1.length; i++)
        {
            str1[i] = sc.nextLine();
        }

        //set array size of 
        String str2[] = new String[str1.length];

        //copy all elements of one array into another 
        //enhanced for loop, needs counter 
        int myCounter = 0;
        for (String myIterator: str1)
        {
            str2[myCounter++] = myIterator;
        }
        System.out.println(); //vertical space 

        //print arrays using enhanced for loop
        System.out.println("Printing str1 array:");
        for (String myIterator: str1)
        {
            System.out.println(myIterator);
        }

        System.out.println("\nPrinting str2 array:");
        for (String myIterator: str2)
        {
            System.out.println(myIterator);
        }
        
        //print vertical space 
        System.out.println();

        sc.close(); //close scanner
    }
}
