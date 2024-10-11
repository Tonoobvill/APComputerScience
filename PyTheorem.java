/**
 * @author Timo Fauxnam
 * @version October 11, 2024
 * Class: AP Computer Science A
 * Assignment: 02.03 Java's Math Class / PyTheorem
 * Purpose: Calculate the hypotenuse of two triangles
 */

 /**
 * PMR
 *<+s>: Calculates the hypotenuse based off random numbers
 *<-s>: No real issues
 */
import java.util.Random;

public class PyTheorem {

    public static void main(String[] args) {
        // Random shape
        Random rand = new Random();

        // Random values for triangles
        int side1_1 = rand.nextInt(18) + 5; // Triangle 1
        int side2_1 = rand.nextInt(18) + 5; 
        int side1_2 = rand.nextInt(18) + 5; // Triangle 2
        int side2_2 = rand.nextInt(18) + 5; 

        // Calculate hypotenuse
        double hypotenuse1 = Math.sqrt(Math.pow(side1_1, 2) + Math.pow(side2_1, 2));
        double hypotenuse2 = Math.sqrt(Math.pow(side1_2, 2) + Math.pow(side2_2, 2));

        // Print output
        System.out.println("Triangle 1     Side 1: " + side1_1 + "     Side 2: " + side2_1 + "     Hypotenuse: " + hypotenuse1);
        System.out.println("Triangle 2     Side 1: " + side1_2 + "     Side 2: " + side2_2 + "     Hypotenuse: " + hypotenuse2);
    }
}
