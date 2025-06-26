package encapsulation;

public class Teacher {

    public static void main(String[] args)
    {
        Student s = new Student(101);
        s.setStudentAttended(true);
        s.getStudentAttended();
        System.out.println("attendance is assigned");
    }



}
