import java.util.Scanner;

public class Ex_4 {
    // Main method where the program execution begins
    public static void main(String[] args) {
        // Declare an integer array of size 3
        int[] array = new int[3];

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Loop to get input for the array elements
        for (int i = 0; i < 3; i++) {
            array[i] = getInput(i + 1, scanner);
        }

        // Call method to print the smallest and biggest numbers
        printSmallestAndBiggestNb(array[0], array[1], array[2]);
    }

    // Method to get input from the user
    static int getInput(int cnt, Scanner scanner) {
        int input;

        // Prompt the user for input
        System.out.println("Input " + cnt + "/3: ");
        input = scanner.nextInt();

        return input;
    }

    // Method to print the smallest and biggest numbers among three given numbers
    static void printSmallestAndBiggestNb(int a, int b, int c) {
        // Determine and print the smallest number
        if (a < b && a < c) {
            System.out.println("Smallest: " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest: " + b);
        } else {
            System.out.println("Smallest: " + c);
        }

        // Determine and print the biggest number
        if (a > b && a > c) {
            System.out.println("Biggest: " + a);
        } else if (b > a && b > c) {
            System.out.println("Biggest: " + b);
        } else {
            System.out.println("Biggest: " + c);
        }
    }
}