class Student {
    /*int age;
    String name;
 // constructor with no parameters
    public Student()
    {
        System.out.println("Constructor called:");
        age = 19;
        name = "Hema";
    }


    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);*/




    int marks;
    String name;

    private Student(int m,String n)
    {
        marks = m;
        name = n;
        System.out.println(marks+ " " + name);
    }
    public static void main(String[] args)
    {
        Student s1 = new Student(10,"Hema");
        Student s2= new Student(20,"Phani");
        Student s3= new Student(30,"mohit Sir");
        Student s4= new Student(40,"Ashok Sir");
    }
}
