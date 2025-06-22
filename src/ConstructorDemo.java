class Student {
    int age;
    String name;

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
        System.out.println(s1.name);



    }
}
