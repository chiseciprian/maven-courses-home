package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex2;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Ex2 ex2 =new Ex2("src/main/resources/file1.in");
        System.out.printf(ex2.toString());
    }
}
