public class Student {
    /*
    This class with take and store information on individual students
    The information includes first and last name of student, their grade, and their unique student ID
    */
    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int grade;
    public int getGrade() { return grade;}
    public void setGrade(int grade) {
        this.grade = grade;
    }
    private static int id;
    public static void setId(int id) {
        Student.id = id;
    }
    public static int getId() {
        return id;
    }
    //Takes in a first and last name, grade, and changes the student ID for different students
    Student(String firstName, String lastName, int grade){
        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
        id++;
    }
    //Printing out the overview of student with their full name and grade
    public String toString(){ return "Name: " + firstName + " " + lastName + ", Grade: " + grade;}
}
