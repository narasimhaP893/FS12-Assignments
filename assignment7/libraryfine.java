import java.util.Scanner;

public class libraryfine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of days late
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();

        // Calculate and display fine or message
        if (daysLate <= 0) {
            System.out.println("The book is not late! No fine.");
        } else if (daysLate <= 7) {
            double fine = daysLate * 0.5; // 50 paise per day
            System.out.printf("The fine for returning the book %d days late is Rs. %.2f\n", daysLate, fine);
        } else if (daysLate <= 14) {
            System.out.println("The fine for returning the book " + daysLate + " days late is Rs. 1");
        } else if (daysLate <= 21) {
            System.out.println("The fine for returning the book " + daysLate + " days late is Rs. 5");
        } else {
            System.out.println("Your membership will be canceled for returning the book " + daysLate + " days late.");
        }

        scanner.close();
    }
}