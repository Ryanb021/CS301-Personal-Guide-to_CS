// Creating Data Types
// Student Class

public class Student {
    public static void main(String[] args) {
        
        Student student1 = new Student("Ryan", 18);

        student1.displayInfo();
    }
    
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Instance method
    public void displayInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}
