import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Author: Amanda Leon");
        System.out.println("Program Requirements:");
        System.out.println("1. Program swaps two user-entered floating-point values.");
        System.out.println("2. Create at least two user defined methods: getRequirements() and numberSwaps().");
        System.out.println("3. Must perform data validation: numbers must be floats ");
        System.out.println("4. Print numbers before/after swapping.");
    }

    public static void numberSwap() {
        Scanner sc = new Scanner(System.in);
        float num1 = 0.0f;
        float num2 = 0.0f;
        float temp = 0.0f;

        // prompt user
        System.out.println("Enter num1: ");
        // check input
        while (!sc.hasNextFloat()) {
            System.out.println(("Invalid input!\n"));
            sc.next();
            System.out.println("Please try again. Enter num1:");
        }
        num1 = sc.nextFloat();

        System.out.println("\nEnter num2");
        // check input
        while (!sc.hasNextFloat()) {
            System.out.println("Invalid input!\n");
            sc.next();
            System.out.println("Please try again. Enter num2");
        }
        num2 = sc.nextFloat();

        System.out.println("\nBefore Swap:");
        System.out.println("num 1 = " + num1);
        System.out.println("num 2 = " + num2);

        // swap
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num2);

        sc.close(); // close scanner
    }
}
