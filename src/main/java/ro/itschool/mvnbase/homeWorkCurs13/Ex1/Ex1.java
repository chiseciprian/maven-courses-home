package ro.itschool.mvnbase.homeWorkCurs13.Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
    private final String firstLine;

    public Ex1(String path) throws IOException {
        this.firstLine = fetchDocument(path);
    }

    private String fetchDocument(String path) throws IOException {
        BufferedReader breader=new BufferedReader(new FileReader(new File(path)));
        String line=breader.readLine();
        return line;
    }

    @Override
    public String toString() {
        return "Ex1{" +
                "firstLine='" + firstLine + '\'' +
                '}';
    }
}
