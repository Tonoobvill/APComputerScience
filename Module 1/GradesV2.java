/**
 * Name: Timo Fauxnam
 * Date: August 27, 2024
 * Class: AP Computer Science A
 * Assignment: 01.12 Pitfalls, Surprises, and Shortcuts / GradesV2
 * Purpose: Calculates the total points and average grade for a series of test scores.
 */

 /**
 * PMR
 *<+s>: Formatting everything was easy when I organized it into sections. It was also easy because it was very similar to other languages I have used.
 *<-s>: I didn't read all of the directions first, so I had to completely redo my program.
 */

 public class GradesV2 {
    public static void main(String[] args) {
        // Local variables
        int numTests = 0;      // Counts number of tests
        int testGrade = 0;     // Individual test grade
        int totalPoints = 0;   // Total points for all tests
        double average = 0.0;  // Average grade
        
        // Test grades to be processed
        int[] grades = {95, 73, 91, 82}; // Initial grades
        
        // Process initial grades
        System.out.println("Processing initial test grades...");
        for (int i = 0; i < grades.length; i++) {
            testGrade = grades[i];
            totalPoints += testGrade;
            numTests++;
            average = (double) totalPoints / numTests;
            
            // Display results
            System.out.printf("Test # %d  Grade: %d   Total Points: %d   Average Grade: %.2f\n", numTests, testGrade, totalPoints, average);
        }

        // Additional test grades
        int[] additionalGrades = {88, 76, 95, 84, 91}; // Additional grades

        // Process additional grades
        System.out.println("Processing additional test grades...");
        for (int i = 0; i < additionalGrades.length; i++) {
            testGrade = additionalGrades[i];
            totalPoints += testGrade;
            numTests++;
            average = (double) totalPoints / numTests;

            // Display results
            System.out.printf("Test # %d  Grade: %d   Total Points: %d   Average Grade: %.2f\n", numTests, testGrade, totalPoints, average);
        }
    }
}
