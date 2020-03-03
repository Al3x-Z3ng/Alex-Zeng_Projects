public class Main {
    public static void main(String[] args) {
        School Windermere = new School("Windermere", "Benita Kwon", 1);
        System.out.println("Teachers in the school:");
        Windermere.addingTeacher("John", "Wick", "PE");
        Windermere.addingTeacher("Tony", "Stark", "Physics");
        Windermere.addingTeacher("Michael", "Scott", "Business");
        Windermere.showingAllTeachers();
        System.out.println(" ");
        System.out.println("Students enrolling in this school:");
        Windermere.addingStudent("Yusuf", "Ibrahim", 11);
        Windermere.addingStudent("Peter", "Parker", 12);
        Windermere.addingStudent("Paul", "Lee", 8);
        Windermere.addingStudent("Ben", "Conner", 10);
        Windermere.addingStudent("Kyle", "Lester", 9);
        Windermere.addingStudent("Justin", "Johnny", 10);
        Windermere.addingStudent("George", "Diego", 8);
        Windermere.addingStudent("Tyler", "Blevins", 9);
        Windermere.addingStudent("Camilla", "Keller", 11);
        Windermere.addingStudent("Tyanna", "Johnson", 12);
        Windermere.showingAllStudents();
        System.out.println("______________________________________");
        System.out.println("One teacher removed:");
        Windermere.removingTeacher(1);
        Windermere.showingAllTeachers();
        System.out.println(" ");
        System.out.println("Two students removed:");
        Windermere.removingStudent(2);
        Windermere.showingAllStudents();
    }
}
