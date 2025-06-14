package accessmodifiers;

// class cannot be private
public class Student {

    // public variable
    public  int rollNo = 23;

    // public constructor
    public Student() {
        rollNo = 24;
    }

    public static void main(String args[]) {
        Student s = new Student();
    }

    // public method
    public void printRollNumber() {
        System.out.println(rollNo);
    }
}

