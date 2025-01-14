/**
 * Name: Timo Fauxnam
 * Date: January 14, 2025
 * Class: AP Computer Science A
 * Assignment: 05.08 Constructing Multiple Objects / V8Tester.java
 * Purpose: Calculate grades and display output in the required format
 */
/**
 * PMR
 * <+s>: Calculates and displays grades, averages, and differences in a table format
 * <-s>: None
 */
public class V8Tester {
    public static void main(String[] args) {
        // Create objects using both constructors
        V8 student1 = new V8(); // Default constructor
        V8 student2 = new V8("Alisa", 90, 92); // Overloaded constructor
        V8 student3 = new V8("Jessica", 92, 84); // Overloaded constructor

        // Update student1 information
        student1.setName("John");
        student1.setGrade1(85);
        student1.setGrade2(90);

        // Use overloaded method
        student3.updateGrades(88);

        // Print results in a user-friendly format
        System.out.println("Student\tGrade 1\tGrade 2\tAverage\tDifference");
        System.out.println("=================================================");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
