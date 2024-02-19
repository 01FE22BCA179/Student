
/**
 * The `Student` class represents a student with attributes such as name, date of birth, USN, program,
 * and department, and includes methods to display the student's details.
 */
public class Student {
    public String name;
    public String dob;
    public String usn;
    public String program;
    public String dep;
   /*** The `display_details` function prints out the student's name, USN, program, and department. */
    public void display_details() {
        System.out.println("Student Name: " + name);
        System.out.println("Student USN : " + usn);
        System.out.println("Student Program : " + program);
        System.out.println("Student Department : " + dep);
    }


    /**
     * The main function creates instances of Student and StudentCourse classes, sets student details,
     * and displays the student's details, marks, and courses.
     */
public static void main(String[] args) {
        Student s=new Student();
        //Course s1 = new Course();
        s.name = "Sangeetha";
        s.usn= "01fe22bca179";
        s.program="BCA";
        s.dep="BCA";
        s.display_details();
        
        //s1.displayStudentMarks();

        //s1.displayStudentcourses();

    }
}