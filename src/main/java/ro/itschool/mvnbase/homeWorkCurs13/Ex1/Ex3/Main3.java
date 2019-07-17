package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex3;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        ExamResultReader examResultReader =new ExamResultReader("src/main/resources/examStatus.in");
        System.out.printf(examResultReader.toString());
    }
}
