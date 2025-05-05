import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Developer: Amanda Leon.");
        System.out.println(
                "Program determines whether user-entered value is a vowel, consonant, special character, or integer.");
        System.out.println("Program displays chracter\'s ASCII value.");

        System.out.println("\nReferences:\n"
                + "ASCII Background: https://en.wikipedia.org/wiki/ASCII\n"
                + "ASCII Character Table: https://www.ascii-code.com/\n"
                + "Lookup Tables: https://www.lookuptables.com/");

        System.out.println();// blank line
    }

    public static void determineChar() {
        // initialize variables
        char ch = ' ';
        char chTest = ' '; // ch cast to lower-case
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter character: ");
        ch = sc.next().charAt(0); // capture first character from first token
        chTest = Character.toLowerCase(ch);

        // test for alpha characters
        if ((chTest == 'a' || chTest == 'e' || chTest == 'i' || chTest == 'o' || chTest == 'u' || chTest == 'y')) {
            System.out.println(ch + "is a vowel. ASCII value: " + (int) ch); // cast char to int
        }
        // test for numeric characters
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is an integer. ASCII value: " + (int) ch);
        }
        // test for consonants
        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant. ASCII value: " + (int) ch);
        }
        // special character
        else {
            System.out.println(ch + " is a special character. ASCII value: " + (int) ch);
        }
        sc.close(); // close scanner
    }
}
