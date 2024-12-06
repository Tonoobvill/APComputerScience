 /**
 * @author Timo Fauxnam
 * @version December 6, 2024
 * Class: AP Computer Science A
 * Assignment: 04.06 Writing Text Files / SecretPasscode
 * Purpose: Generate a text file with passcodes
 */
 /**
 * PMR
 *<+s>: Random passcodes worked
 *<-s>: Kept messing up the file generation
 */
import java.io.*;
import java.util.*;

public class SecretPasscode {

    public static void main(String[] args) throws IOException {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // File to store generated passwords
        String fileName = "passwords.txt";
        FileWriter writer = new FileWriter(fileName, true); // Append mode for writing
        List<String> generatedPasswords = new ArrayList<>();

        // Display welcome message
        System.out.println("***************************************************");
        System.out.println("Welcome to a simple password generator.");
        System.out.println("The password will include lowercase, uppercase, & numbers.");

        // Main loop to generate passwords
        boolean continueGenerating = true;

        while (continueGenerating) {
            System.out.print("Enter a password length (6 or more): ");
            int length = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Validate password length
            while (length < 6) {
                System.out.println("Password length too short. Please try again.");
                System.out.print("Enter a password length (6 or more): ");
                length = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            }

            // Generate a random password
            String password = generatePassword(length);
            generatedPasswords.add(password);

            // Write the password to the text file
            writer.write(password + "\n");
            System.out.println("\nA password has been written to the text file.");

            // Ask if the user wants to generate another password
            System.out.print("Would you like to generate another password? Y/N: ");
            char choice = scanner.nextLine().toUpperCase().charAt(0);
            continueGenerating = (choice == 'Y');
        }

        // Close the writer
        writer.close();

        // Display generated passwords
        System.out.println("\nThank you for using the Pass Code Generator.");
        System.out.println("\nHere are your randomly generated codes:");
        displayPasswordsFromFile(fileName);

        scanner.close();
    }

    /**
     * Generates a random password of a specified length.
     * The password includes uppercase letters, lowercase letters, and numbers.
     *
     * @param length Length of the password
     * @return Randomly generated password
     */
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int asciiRange = random.nextInt(3); // Randomly choose between 0, 1, and 2
            char character;

            if (asciiRange == 0) {
                character = (char) (random.nextInt(10) + 48); // Numbers (0-9)
            } else if (asciiRange == 1) {
                character = (char) (random.nextInt(26) + 65); // Uppercase letters (A-Z)
            } else {
                character = (char) (random.nextInt(26) + 97); // Lowercase letters (a-z)
            }

            password.append(character);
        }

        return password.toString();
    }

    /**
     * Reads and displays passwords from the file.
     *
     * @param fileName Name of the file containing passwords
     */
    public static void displayPasswordsFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
