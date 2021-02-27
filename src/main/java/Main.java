import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("Welcome to the bestest calculator");
        System.out.println("Enter a math command:");
        Scanner scanner = new Scanner(System.in);
        loop: while (true) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s");
            final String command = tokens[0];
            Calculator calculator = new Calculator();
            int num1;
            int num2;
            int result;
            switch (command) {
                case "add":
                    num1 = Integer.parseInt(tokens[1]);
                    num2 = Integer.parseInt(tokens[2]);
                    result = calculator.add(num1, num2);
                    System.out.println("= " + result);
                    break;
                case "subtract":
                    num1 = Integer.parseInt(tokens[1]);
                    num2 = Integer.parseInt(tokens[2]);
                    result = calculator.subtract(num1, num2);
                    System.out.println("= " + result);
                    break;
                case "multiply":
                    num1 = Integer.parseInt(tokens[1]);
                    num2 = Integer.parseInt(tokens[2]);
                    result = calculator.multiply(num1, num2);
                    System.out.println("= " + result);
                    break;
                case "divide":
                    num1 = Integer.parseInt(tokens[1]);
                    num2 = Integer.parseInt(tokens[2]);
                    result = calculator.divide(num1, num2);
                    System.out.println("= " + result);
                    break;
                case "fibonacciNumberFinder":
                    num1 = Integer.parseInt(tokens[1]);
                    result = calculator.fibonacciNumberFinder(num1);
                    System.out.println("= " + result);
                    break;
                case "intToBinaryNumber":
                    num1 = Integer.parseInt(tokens[1]);
                    System.out.println("= " + calculator.intToBinaryNumber(num1));
                    break;
                case "quit":
                    break loop;
                default:
                    System.out.println("No such command.");
                    break;
            }

        }
    }
}
