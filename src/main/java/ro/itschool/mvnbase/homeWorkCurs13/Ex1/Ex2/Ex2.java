package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    private final List<String> lineList;

    public Ex2(String path) throws IOException {
        this.lineList = fetchFile(path);
    }

    private List<String> fetchFile(String path) throws IOException {
        List<String>result=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File(path)));
        String line=bufferedReader.readLine();
        while (line!=null){
            result.add(line);
            line=bufferedReader.readLine();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Ex2{" +
                "lineList=" + lineList +
                '}';
    }
}
