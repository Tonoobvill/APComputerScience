/**
 * Name: Timo Fauxnam
 * Date: January 8, 2025
 * Class: AP Computer Science A
 * Assignment: 05.05 Default Constructors / StudentTesterV3
 * Purpose: This class tests the StudentV3 class
 */
public class StudentTesterV3 {
    public static void main(String[] args) {
        // Create an instance of StudentV3 using the default constructor
        StudentV3 student = new StudentV3();

        // Set the grades
        student.setGrade1(85);
        student.setGrade2(92);

        // Invoke methods and print the results
        double average = student.calculateAverage();
        int difference = student.calculateDifference();

        // Print results in a user-friendly format
        System.out.printf("Grade 1 is %d, Grade 2 is %d, Average is %.2f, Difference is %d\n",
                student.getGrade1(), student.getGrade2(), average, difference);
    }
}