package calc;

import java.util.Scanner;

public class CalculatorDriverClass {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean menu;
        do{
           menu  = menu(calculator,input);
        }while (!menu);
        grabNumberOne(input,calculator);
        grabNumberTwo(input,calculator);
        performOperation(calculator);
        furtherOperationCheck(input, calculator);
        input.close();
    }

    private static void furtherOperationCheck(Scanner input, Calculator calculator) {
        boolean menu;
        System.out.println();
        System.out.println("Do you want to perform another operation ? [y/n]");
        char furtherOperation= input.next().charAt(0);
        if(furtherOperation=='y'){
            do{
                menu  = menu(calculator, input);
            }while (!menu);
        }
    }

    private static void performOperation(Calculator calculator) {
        switch (calculator.getOperator()) {
            case '1':
                System.out.printf("%s + %s = %s%n",calculator.getNumberOne(),calculator.getNumberTwo(),calculator.addition());
                break;

            case '2':
                System.out.printf("%s - %s = %s%n",calculator.getNumberOne(),calculator.getNumberTwo(),calculator.subtraction());
                break;

            case '3':
                System.out.printf("%s * %s = %s%n",calculator.getNumberOne(),calculator.getNumberTwo(),calculator.multiplication());
                break;

            case '4':
                if (calculator.getNumberTwo() == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                System.out.printf("%s / %s = %s%n",calculator.getNumberOne(),calculator.getNumberTwo(),calculator.division());
                break;

            case '5':
                System.out.printf("%s %s %s = %s%n",calculator.getNumberOne(),"%",calculator.getNumberTwo(),calculator.modulus());
                break;

            case '6':
                System.out.println("\t\tExisting the system ");
               return;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

    private static void grabNumberTwo(Scanner input, Calculator calculator) {
        System.out.println("Enter Second Number: ");
        while (!input.hasNextDouble()) {
            System.out.println("Character not allowed, please enter a number only.");
            input.next();
        }
        calculator.setNumberTwo(input.nextDouble());
    }

    private static void grabNumberOne(Scanner input, Calculator calculator) {
        System.out.println("Enter First Number: ");
        while (!input.hasNextDouble()) {
            System.out.println("Character not allowed, please enter a number only.");
            input.next();
        }
         calculator.setNumberOne(input.nextDouble());

    }

    private static boolean menu(Calculator calculator, Scanner input) {
        // Code for clearing the console screen , when running the application, won't work on IDE console
        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("\t\tPlease select appropriate number for your required calculation\t\t");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        char operator= input.next().charAt(0);

        if (operator == '1' || operator == '2' || operator == '3' || operator == '4' || operator == '5'|| operator=='6') {
           calculator.setOperator(operator);
            return true;
        } else {
            System.out.println("Please enter a valid operation.");
            return false;
        }
    }


}