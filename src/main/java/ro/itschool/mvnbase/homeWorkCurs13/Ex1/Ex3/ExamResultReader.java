package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExamResultReader {
    private final List<ExamResult> examResults;

    public ExamResultReader(String path) throws IOException {
        this.examResults = fetchResult(path);
    }

    private List<ExamResult> fetchResult(String path) throws IOException {
        List<ExamResult> results = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        String[] splitResult;
        while ((line = bufferedReader.readLine()) != null) {
            splitResult=line.split("\\|");
            results.add(new ExamResult(splitResult[0],splitResult[1]));
        }
        return results;
    }


    @Override
    public String toString() {
        return "ExamResultReader{" +
                "examResults=" + examResults +
                '}';
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }
}
