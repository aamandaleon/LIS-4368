import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Developer: Amanda Leon \nProgram loops through array of floats");
        System.out.println("Use following values: 1.0, 2.1, 3,2, 4.3, 5.4");
        System.out.println("Use the following loop structures: for, enhnaced for, while, do..while.");
        System.out.println("\nNote: Pretest loops: for, enhanced for, while. Posttest loop: do..while.\n");
    }

    public static void arrayLoops() {
        // create float array
        float myFloats[] = { 1.0f, 2.1f, 3.2f, 4.3f, 5.4f };

        System.out.println("for loop:");
        for (int i = 0; i < myFloats.length; i++) {
            System.out.println(myFloats[i]);
        }

        // enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for (float test : myFloats) {
            System.out.println(test);
        }

        System.out.println("\nwhile loop:");
        int i = 0;
        while (i < myFloats.length) {
            System.out.println(myFloats[i]);
            i++;
        }

        i = 0; // reassign 0 to test variable
        System.out.println("\ndo..while loop:");
        do {
            System.out.println(myFloats[i]);
            i++;
        } while (i < myFloats.length);
    }
}
