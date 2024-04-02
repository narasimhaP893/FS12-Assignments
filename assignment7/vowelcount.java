import java.util.Scanner;

public class vowelcount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive check

        int vowelCount = 0;
        boolean hasVowel = false;

        // Iterate through characters and check for vowels
        for (char character : inputString.toCharArray()) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelCount++;
                hasVowel = true;
            }
        }

        // Display results
        if (hasVowel) {
            System.out.println("The string contains " + vowelCount + " vowel(s).");
        } else {
            System.out.println("The string does not contain any vowels.");
        }

        scanner.close();
    }
}