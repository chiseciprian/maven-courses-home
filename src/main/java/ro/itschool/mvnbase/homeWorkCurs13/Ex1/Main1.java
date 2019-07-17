package ro.itschool.mvnbase.homeWorkCurs13.Ex1;

import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        Ex1 ex1=new Ex1("src/main/resources/file1.in");
        System.out.printf(ex1.toString());
    }
}
