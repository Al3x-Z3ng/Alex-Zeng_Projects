public class Teacher {
    /*
    This class is used to take and store information for the teachers
    It asks for their first & last name, and the subject they are teaching
     */
    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private  String subject;
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //Taking in and storing the information of teacher
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
    //Printing out the information taken in previously about the teacher
    public String toString(){
        return "Name: " + firstName + " " + lastName + ", Subject: " + subject;
    }
}
