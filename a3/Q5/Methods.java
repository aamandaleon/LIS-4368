
import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Developer: Amanda Leon.");
        System.out.println(
                "Program determines total number of characters in line of text,\nas well as the number of times specific charcater is used.");
        System.out.println("Program displays chracter\'s ASCII value.");

        System.out.println("\nReferences:\n"
                + "ASCII Background: https://en.wikipedia.org/wiki/ASCII\n"
                + "ASCII Character Table: https://www.ascii-code.com/\n"
                + "Lookup Tables: https://www.lookuptables.com/");

        System.out.println();// blank line
    }

    public static void characterInfo() {
        // initialize variables
        String str = "";
        char ch = ' ';
        int len = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter line of text: ");
        str = sc.nextLine(); // read user input
        len = str.length();

        System.out.println("Please enter character to check: ");
        ch = sc.next().charAt(0);

        // loop through input
        for (int i = 0; i < len; i++) {
            if (ch == str.charAt(i)) {
                ++num; // go to next character
            }
        }

        System.out.println("\nNumber of characters in line of text: " + len);
        System.out.println("The character " + ch + " appears " + num + " time(s) in the line of text.");
        System.out.println("ASCII value: " + (int) ch); // cast char to int
        sc.close(); // close scanner
    }
}
