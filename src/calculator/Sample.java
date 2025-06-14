package calculator;

import accessmodifiers.Student;

// with in different package and different class also we can access the  data if it is public modifier
public class Sample {
    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.println(s.rollNo);
        s.printRollNumber();

    }

}
