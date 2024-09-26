package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Calculator Begins!!");
        Scanner reader = new Scanner(System.in);
        int op, flag = 0;
        double num, exp;

        do {
            logger.info("Displaying operation menu to the user.");
            System.out.println("\nOperation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Percentile function");
            System.out.println("4. Multiply");
            System.out.println("5. Square Root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural Logarithm (base e)");
            System.out.println("8. Power function");
            System.out.println("9. Exit\n");
            System.out.print("Enter your choice (number): ");
            op = reader.nextInt();
            logger.info("User selected option: " + op);

            if (op == 9) {
                logger.info("User chose to exit.");
                flag = 1;
            }
            else {
                switch (op) {
                    case 1:  // Addition
                        logger.info("User selected addition operation.");
                        System.out.println("\nAdd two numbers!!");
                        System.out.print("Enter number 1: \n");
                        num = reader.nextDouble();
                        System.out.print("Enter number 2: \n");
                        exp = reader.nextDouble();
                        logger.info("Inputs for addition: " + num + ", " + exp);
                        add(num, exp);
                        break;

                    case 2: // Subtraction
                        logger.info("User selected subtraction operation.");
                        System.out.println("Subtract two numbers!!");
                        System.out.print("Enter number 1: \n");
                        num = reader.nextDouble();
                        System.out.print("Enter number 2: \n");
                        exp = reader.nextDouble();
                        logger.info("Inputs for subtraction: " + num + ", " + exp);
                        subt(num, exp);
                        break;

                    case 3: // Percentile function
                        logger.info("User selected percentile operation.");
                        System.out.println("Percentile two numbers!!\n");
                        System.out.print("Enter number 1: \n");
                        num = reader.nextDouble();
                        System.out.print("Enter number 2: \n");
                        exp = reader.nextDouble();
                        logger.info("Inputs for percentile operation: " + num + ", " + exp);
                        per(num, exp);
                        break;

                    case 4: // Multiply
                        logger.info("User selected multiplication operation.");
                        System.out.println("Multiply two numbers!!\n");
                        System.out.print("Enter number 1: \n");
                        num = reader.nextDouble();
                        System.out.print("Enter number 2: \n");
                        exp = reader.nextDouble();
                        logger.info("Inputs for multiplication: " + num + ", " + exp);
                        mul(num, exp);
                        break;

                    case 5: // Square Root
                        logger.info("User selected square root operation.");
                        System.out.println("Square Root of a number!!\n");
                        System.out.print("Enter number: \n");
                        num = reader.nextDouble();
                        logger.info("Input for square root: " + num);
                        sqrt(num);
                        break;

                    case 6: // Factorial
                        logger.info("User selected factorial operation.");
                        System.out.println("Factorial of a number!!\n");
                        System.out.print("Enter a non-negative integer: \n");
                        int n = reader.nextInt();
                        logger.info("Input for factorial: " + n);
                        factorial(n);
                        break;

                    case 7: // Natural Logarithm
                        logger.info("User selected natural logarithm operation.");
                        System.out.println("Natural Logarithm (base e) of a number!!\n");
                        System.out.print("Enter number: \n");
                        num = reader.nextDouble();
                        logger.info("Input for natural logarithm: " + num);
                        ln(num);
                        break;

                    case 8: // Power function
                        logger.info("User selected power function operation.");
                        System.out.println("Power function (base^exponent)!!\n");
                        System.out.print("Enter base: \n");
                        num = reader.nextDouble();
                        System.out.print("Enter exponent: \n");
                        exp = reader.nextDouble();
                        logger.info("Inputs for power function: base = " + num + ", exponent = " + exp);
                        power(num, exp);
                        break;

                    default:
                        logger.warn("Invalid input received. Exiting.");
                        System.out.println("Exiting due to invalid input!!");
                        flag = 1;
                }
            }
        } while (flag == 0);
    }

    public static double add(double num, double exp) {
        double result = num + exp;
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing addition for " + num + " and " + exp + ". Result: " + result);
        return result;
    }

    public static double subt(double num, double exp) {
        double result = num - exp;
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing subtraction for " + num + " and " + exp + ". Result: " + result);
        return result;
    }

    public static double mul(double num, double exp) {
        double result = num * exp;
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing multiplication for " + num + " and " + exp + ". Result: " + result);
        return result;
    }

    public static double per(double num, double exp) {
        double result = num % exp;
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing percentile operation for " + num + " and " + exp + ". Result: " + result);
        return result;
    }

    public static double sqrt(double num) {
        double result = Math.sqrt(num);
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing square root for " + num + ". Result: " + result);
        return result;
    }

    public static long factorial(int n) {
        if (n < 0) {
            logger.error("Invalid input for factorial: " + n + ". Factorial of a negative number doesn't exist.");
            System.out.println("Invalid input! Factorial of a negative number doesn't exist.\n");
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing factorial for " + n + ". Result: " + result);
        return result;
    }

    public static double ln(double num) {
        if (num <= 0) {
            logger.error("Invalid input for natural logarithm: " + num + ". Natural logarithm is undefined for zero or negative numbers.");
            System.out.println("Invalid input! Natural logarithm is undefined for zero or negative numbers.\n");
            return Double.NaN;
        }
        double result = Math.log(num);
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing natural logarithm for " + num + ". Result: " + result);
        return result;
    }

    public static double power(double base, double exp) {
        double result = Math.pow(base, exp);
        System.out.println("\nThe Result is " + result + "\n");
        logger.info("Executing power function for " + base + " and " + exp + ". Result: " + result);
        return result;
    }
}
