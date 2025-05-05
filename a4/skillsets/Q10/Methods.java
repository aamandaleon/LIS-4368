import java.util.Scanner;

class Methods {
    public static void getRequirements() {
        //display operational messages
        System.out.println("Program uses methods to :\nadd, subtract, multiply, divide, and power floating point numbers, rounded to two decimal places.");

        System.out.println("Note: Program checks for non-numeric values, and division by zero.");
        System.out.println(); //blank line
    }
    
    public static void calculateNumbers()
    {
        //initialize variables and create Scanner object
        double num1 = 0.0, num2 = 0.0;
        char operation = ' '; //must include a character-here, space character
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mathematical operation(a=addition, s=subtraction, m=mutltiplication, d=division, e=exponeration):");
        //next() function returns next token 
        //note: white space and comments not tokens-though, seperate tokens
        
        //chain intristic (aka built-in) methods:
        //captures first character from user-entered tokenand converts to lower case
        operation = sc.next().toLowerCase().charAt(0);

        while (operation !='a' && operation !='s' && operation !='m' && operation !='d' && operation !='e')
        {
            System.out.println("\nIncorrect operation. Please enter correct operation: ");
            operation = sc.next().toLowerCase().charAt(0); //captures first character from first token
            //operation = sc.next();
        }

        System.out.println("Please enter first number: ");
        while (!sc.hasNextDouble()) 
        {
            System.out.println("Not valid number!\n");
            sc.next(); //if omitted, will go to infinite loop on invalid input 
            System.out.println("Please try again. Enter first number: ");
        }
        num1 = sc.nextDouble();

        System.out.println("Please enter second number: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Not valid number!\n");
            sc.next();//if omitted, will go to infinite loop on invalid input
            System.out.println("Please try again. Enter second number: ");
        }
        num2 = sc.nextDouble();

        //test operation
        if (operation == 'a')
        {
            Addition(num1, num2);
        }

        else if (operation =='s')
        {
            Subtraction(num1, num2);
        }

        else if (operation == 'm')
        {
            Multiplication(num1, num2);
        }

        else if (operation =='d')
        {
            if (num2 == 0)
            {
                System.out.println("Cannot divide by zero!");
            }
            else 
            {
                Division(num1, num2);
            }
        }

        else if (operation =='e')
        {
            Exponentiation(num1, num2);
        }

        System.out.println(); //blank line
        sc.close(); //close scanner
    }

    //create methematical methods
    public static void Addition(double n1, double n2)
    {
        System.out.print(n1 + " + " + n2 + " = ");
        System.out.printf("%.2f", (n1 + n2));
    }

    public static void Subtraction (double n1, double n2)
    {
        System.out.print(n1 + " - " + n2 + " = ");
        System.out.printf("%.2f", (n1 - n2));
    }

    public static void Multiplication (double n1, double n2) 
    {
        System.out.print(n1 + " * " + n2 + " = ");
        System.out.printf("%.2f", (n1 * n2));
    }

    public static void Division (double n1, double n2) 
    {
        System.out.print(n1 + " / " + n2 + " = ");
        System.out.printf("%.2f", (n1 / n2));
    }

    public static void Exponentiation(double n1, double n2)
    {
        System.out.print(n1 + " to the power of " + n2 + " = ");
        System.out.printf("%.2f", (Math.pow(n1,n2)));
    }
    
}

