package exception.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) {
        ThrowsDemo td = new ThrowsDemo();
        td.m1();

    }

    void m1() {
        System.out.println("iam M1");
        m2();
    }

    void m2() {
        System.out.println("iam m2");
        try {
            m3();
        } catch (FileNotFoundException e) {
            System.out.println("iam handling");
        }
    }

    void m3() throws FileNotFoundException {
            FileInputStream fis = new FileInputStream("abc.txt");
        System.out.println("iam m3");
    }

















}
