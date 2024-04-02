import java.util.Scanner;

public class bonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        // Get year employee joined
        System.out.print("Enter the year the employee joined: ");
        int joiningYear = scanner.nextInt();

        // Calculate years of service
        int yearsOfService = currentYear - joiningYear;

        // Determine bonus based on years of service
        int bonus = 0;
        if (yearsOfService > 5) {
            bonus = 5000;
        } else if (yearsOfService >= 3) {
            bonus = 3000;
        } else {
            System.out.println("The employee has served less than 3 years. No bonus awarded.");
        }

        // Print bonus amount (if applicable)
        if (bonus > 0) {
            System.out.println("The employee is awarded a bonus of Rs." + bonus);
        }

        scanner.close();
    }
}