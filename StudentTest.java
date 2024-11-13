/* Elias Grayson */
/* This class tests the Student class */
public class StudentTest extends Student {
    
    // Instantiates the same constructor as BankAccount
    public StudentTest(String name, String studentId) {
        super(name, studentId);
    }

    // This method is the method used for testing
    public static void main(String[] args) {

        //Student x1 tests a normal amount of classes and grade numbers
        Student x1 = new Student("x1", "shs420");
        x1.addGrade(59);
        x1.addGrade(30);
        x1.addGrade(98);
        x1.addGrade(65);

        // Student x2 test if the student enters only 1 grade
        Student x2 = new Student("x2", "ppp69");
        x2.addGrade(70);

        // Student x3 tests if the student adds a lot of classes
        Student x3 = new Student("x3", "mnm72");
        x3.addGrade(12);
        x3.addGrade(44);
        x3.addGrade(72);
        x3.addGrade(40);
        x3.addGrade(89);
        x3.addGrade(70);
        x3.addGrade(43);
        x3.addGrade(2);
        x3.addGrade(99);
        x3.addGrade(45);
        x3.addGrade(59);

        // Student x4 tests if the student enters negative values for their grades
        Student x4 = new Student("x4", "pbl31");
        x4.addGrade(-68);
        x4.addGrade(-90);

        // Gives out the result
        System.out.println("This is the average grade for Student x1: " + x1.getAverageGrade());
        System.out.println("This is the average grade for Student x2: " + x2.getAverageGrade());
        System.out.println("This is the average grade for Student x3: " + x3.getAverageGrade());
        System.out.println("This is the average grade for Student x4: " + x4.getAverageGrade());
    }
}
