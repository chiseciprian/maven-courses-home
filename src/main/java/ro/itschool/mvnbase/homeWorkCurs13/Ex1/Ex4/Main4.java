package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex4;

import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        PersonFileReader personFileReader =new PersonFileReader("src/main/resources/person.in");
        System.out.printf(personFileReader.toString());
    }
}
