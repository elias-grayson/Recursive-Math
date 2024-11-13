/* Elias Grayson */
/* This class shows a student's grades for their classes */

import java.util.ArrayList; // Adds ArrayLists

public class Student {
    
    private ArrayList<Integer> classes = new ArrayList<Integer>();
    private String name; // Stores the name of the student
    private String studentId; // Stores the student ID
    private int grade; // Stores the student's grade
    private int sum; // Stores the sum of the grades

    // This constructor instantiates the student's name and student ID
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // This method adds a class grade for the student
    public void addGrade(int grade) {
        if (grade < 0) {
            grade = 0;
        }
        this.grade = grade;
        classes.add(new Integer(this.grade));
    }

    // This method calculates the average grade of all of the student's classes
    public int getAverageGrade() {

        // This loops through the ArrayList and 
        for (int i = 0; i < classes.size(); i++) {
            sum += classes.get(i);  // Get the element at index i
        }
        if (classes.size() == 0) {
            sum = sum / 1;
        }
        else {
            sum = sum / classes.size(); // Divides the grade sum by the number of classes
        }
        return sum;
    }
}
