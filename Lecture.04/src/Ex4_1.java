public class Ex4_1 {
    public static void main(String[] args) {

        printAmerican("Monday", 22, "July", 2024);
        printEuropean("Monday", 22, "July", 2024);

    }

    static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);

    }
    static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + ", " + year);

    }



}