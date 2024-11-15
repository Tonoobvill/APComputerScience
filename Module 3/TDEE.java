 /**
 * @author Timo Fauxnam
 * @version November 15, 2024
 * Class: AP Computer Science A
 * Assignment: 03.07 Logical Operator / TDEE
 * Purpose: Calculate TDEE
 */
 /**
 * PMR
 *<+s>: Uses the 03.05 Project for BMI
 *<-s>: Had math errors for a while
 */
import java.util.Scanner;

public class TDEE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user details
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your BMR: ");
        double bmr = scanner.nextDouble();

        System.out.print("Please enter your gender (M/F): ");
        String gender = scanner.next().trim().toLowerCase();  // Convert gender input to lowercase

        // Display activity levels menu
        System.out.println("\nSelect Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");

        // Collect activity level input
        System.out.print("\nEnter the letter corresponding to your activity level: ");
        String activityLevel = scanner.next().trim().toLowerCase();  // Convert to lowercase

        // Determine activity factor based on gender and selected activity level
        double activityFactor = 1.0;  // Default for Resting

        switch (activityLevel) {
            case "a":
                activityFactor = 1.0;
                break;
            case "b":
                activityFactor = 1.3;
                break;
            case "c":
                activityFactor = (gender.equals("m")) ? 1.6 : 1.5;
                break;
            case "d":
                activityFactor = (gender.equals("m")) ? 1.7 : 1.6;
                break;
            case "e":
                activityFactor = (gender.equals("m")) ? 2.1 : 1.9;
                break;
            case "f":
                activityFactor = (gender.equals("m")) ? 2.4 : 2.2;
                break;
            default:
                System.out.println("Invalid input. Please restart the program and choose a valid option.");
        }

        // Calculate TDEE
        double tdee = bmr * activityFactor;

        // Display results
        System.out.println("\nYour results:");
        System.out.printf("Name: %s     Gender: %s\n", name, gender.equals("m") ? "M" : "F");
        System.out.printf("BMR: %.1f calories     Activity Factor: %.1f\n", bmr, activityFactor);
        System.out.printf("TDEE: %.1f calories\n", tdee);

        scanner.close();
    }
}
