 /**
 * @author Timo Fauxnam
 * @version November 11, 2024
 * Class: AP Computer Science A
 * Assignment: 03.05 Condition Statements: if-else-if / BMI
 * Purpose: Calculate BMI
 */
 /**
 * PMR
 *<+s>: Got it right second try
 *<-s>: Forgot to put the "&&" next to the "else if"
 */
import java.util.Scanner;

public class BMI {
    // Constants for conversion from English to Metric
    private static final double POUNDS_TO_KG = 0.453592;
    private static final double INCHES_TO_METERS = 0.0254;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get users name
        System.out.print("Enter your name (first last): ");
        String name = scanner.nextLine();

        // Get weight in pounds
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        double weightPounds = scanner.nextDouble();

        // Get height in feet and inches
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        int heightFeet = scanner.nextInt();
        int heightInches = scanner.nextInt();

        // Height to inches, then to meters
        int totalHeightInches = (heightFeet * 12) + heightInches;
        double heightMeters = totalHeightInches * INCHES_TO_METERS;

        // Pounds to kilograms
        double weightKg = weightPounds * POUNDS_TO_KG;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Weight status
        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal or Healthy Weight";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Print
        System.out.println("\nBody Mass Index Calculator");
        System.out.println("===========================");
        System.out.println("Name: " + name);
        System.out.printf("Height (m): %.1f%n", heightMeters);
        System.out.printf("Weight (kg): %.1f%n", weightKg);
        System.out.printf("BMI: %.1f%n", bmi);
        System.out.println("Category: " + weightStatus);

        // Close the scanner
        scanner.close();
    }
}
