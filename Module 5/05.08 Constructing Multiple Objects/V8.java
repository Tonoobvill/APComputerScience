/**
 * Name: Timo Fauxnam
 * Date: January 14, 2025
 * Class: AP Computer Science A
 * Assignment: 05.08 Constructing Multiple Objects / V8Tester.java
 */
public class V8 {
    // Private instance variables
    private String name;
    private int grade1;
    private int grade2;

    // Default constructor
    public V8() {
        this.name = "Unknown";
        this.grade1 = 0;
        this.grade2 = 0;
    }

    // Overloaded constructor
    public V8(String name, int grade1, int grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    // Method to calculate average
    public double calculateAverage() {
        return (grade1 + grade2) / 2.0;
    }

    // Method to calculate difference
    public int calculateDifference() {
        return Math.abs(grade1 - grade2);
    }

    // Overloaded method to update grades
    public void updateGrades(int grade1, int grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public void updateGrades(int newGrade) {
        this.grade1 = newGrade;
        this.grade2 = newGrade;
    }

    // Method to display object information
    @Override
    public String toString() {
        return name + "\t" + grade1 + "\t" + grade2 + "\t" + calculateAverage() + "\t" + calculateDifference();
    }
}