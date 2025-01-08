/**
 * Name: Timo Fauxnam
 * Date: January 8, 2025
 * Class: AP Computer Science A
 * Assignment: 05.05 Default Constructors / StudentV3
 * Purpose: Calculate grades and display output in the required format
 */
/**
 * PMR
 * <+s>: Outputs grades, average, and difference in a table
 * <-s>: Formatting issues
 */
public class StudentV3 {
    private int grade1;
    private int grade2;

    // Default constructor
    public StudentV3() {
        this.grade1 = 0;
        this.grade2 = 0;
    }

    // Parameterized constructor (optional if needed later)
    public StudentV3(int grade1, int grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    // Method to calculate the average of the two grades
    public double calculateAverage() {
        return (grade1 + grade2) / 2.0;
    }

    // Method to calculate the difference between the two grades
    public int calculateDifference() {
        return Math.abs(grade1 - grade2);
    }

    // Getter and Setter methods (optional but useful)
    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }
}