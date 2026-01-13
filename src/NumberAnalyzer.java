import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        checkEvenOrOdd(number);
        checkPositiveOrNegative(number);
        printMultiplicationTable(number);

        scanner.close();
    }

    // Method to check even or odd
    static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // Method to check positive or negative
    static void checkPositiveOrNegative(int num) {
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }

    // Method to print multiplication table
    static void printMultiplicationTable(int num) {
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
