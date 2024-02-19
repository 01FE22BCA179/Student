class Course {
    private String[] courses = { "C#", "Software Testing ", "Machine Learning", "DEVOPS", "Minor Project" };
    private int[] marks = { 88, 92, 39, 98, 38 };

/**
 * The function "displayStudentcourses" prints out the list of student courses.
 * 
 */
    public void displayStudentMarks() {
        System.out.println("\nCourses registered :");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + "\t\t\t");
        }
        System.out.println("\nCourses and  Marks Obtained : ");

         for (int i = 0; i < courses.length; i++) {
             System.out.println(courses[i] + " :  " + marks[i]);
    }
}
    public void displayStudentcourses() {
        System.out.println("\nCourses in which score is less than 40 :");
         for (int i = 0; i < marks.length; i++) {
            if(marks[i]<40){
                System.out.println("Student "+ "scored " +marks[i] +" in " + courses[i]  );
           }
        }
        }
    }
    /**
     * The function "displayStudentMarks" prints out the courses and marks obtained by a student.
     */