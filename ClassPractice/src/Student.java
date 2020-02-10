import java.util.Scanner;

public class Student {
    String name;
    static int id = 123456;
    String[] studentCourses;
    Student(String name, String[] courses) {
        this.name = name;
        this.studentCourses = courses;
        id++;
    }
    public String[] addingCourse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many new courses would you like to add?");
        int howMany = scan.nextInt();
        studentCourses = new String[studentCourses.length + howMany];
        System.out.println("Enter new courses below:");
        for (int i = 0; i < studentCourses.length; i++) {
            if (i <= studentCourses.length - howMany - 1) {
                studentCourses[i] = studentCourses[i];
            }
            if (i > studentCourses.length - howMany - 1) {
                studentCourses[i] = scan.next();
            }
        }
        return studentCourses;
    }
    public double averageGradeofStudent(){
        Scanner scan = new Scanner(System.in);
        double grade;
        double total = 0;
        System.out.println("Enter grades below: ");
        for (int i = 0; i < studentCourses.length; i++){
            grade = scan.nextDouble();
            total = total + grade;
        }
        double average = total/studentCourses.length;
        return average;
    }
    public void printingCourses() {
        for (int i = 0; i < studentCourses.length; i++) {
            System.out.println(studentCourses[i]);
        }
    }
}

