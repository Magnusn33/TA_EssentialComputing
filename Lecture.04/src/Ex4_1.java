public class Ex4_1 {
    // Main method where the program execution begins
    public static void main(String[] args) {
        // Calling the method to print date in American format
        printAmerican("Monday", 22, "July", 2024);

        // Calling the method to print date in European format
        printEuropean("Monday", 22, "July", 2024);
    }

    // Method to print date in American format
    static void printAmerican(String day, int date, String month, int year) {
        // Printing date in the format: Day, Month Date, Year
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Method to print date in European format
    static void printEuropean(String day, int date, String month, int year) {
        // Printing date in the format: Day Date Month Year
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}