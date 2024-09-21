public class Ex5_1 {
    // Main method where the program execution begins
    public static void main(String[] args) {
        // Calling the method to check if a number is positive and a single digit
        checkPositiveSingleDigitNumber(7);
    }

    // Method to check if the given number is a positive single digit number
    static void checkPositiveSingleDigitNumber(int x) {
        // Checking if the number is greater than 0 and less than 10
        if (x > 0 && x < 10) {
            // Printing the result if the condition is met
            System.out.println("positive single digit number.");
        }
    }
}