package com.core;

import accessmodifiers.Student;


//within different package and different class within subclass also we can access the public modifiers data

public class Subclass extends Student {

    public static void main(String[] args){
        new Subclass().test();

    }

    public void test()
    {
        System.out.println(rollNo);
        printRollNumber();

    }
}
