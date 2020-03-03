import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String principal;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipaln(String principal) {
        this.principal = principal;
    }

    private int ranking;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    //Takes in the name of school, the name of the enrolling principal, and the ranking in the area
    School(String name, String principal, int ranking){
        this.name = name;
        this.principal = principal;
        this.ranking = ranking;
    }
    //This method adds an extra teacher to the school
    public ArrayList<Teacher> addingTeacher(String firstName, String lastName, String subject){
        teachers.add(new Teacher(firstName,lastName,subject));
        return teachers;
    }
    //This method is used to add a student to the school
    public ArrayList<Student> addingStudent(String firstName, String lastName, int grade){
        students.add(new Student(firstName,lastName,grade));
        return students;
    }
    //This method is used to delete a teacher form the list
    public  ArrayList<Teacher> removingTeacher(int HowMany){
        for (int i = 0; i < HowMany; i++) {
            teachers.remove(i);
        }
        return teachers;
    }
    //This method is used to delete a student from the list
    public  ArrayList<Student> removingStudent(int HowMany){
        for (int i = 0; i < HowMany; i++) {
            students.remove(i);
        }
        return students;
    }
    //This method is used to show all the teachers in the list
    public void showingAllTeachers(){
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    //This method is used to show all the students in the list
    public  void showingAllStudents(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
