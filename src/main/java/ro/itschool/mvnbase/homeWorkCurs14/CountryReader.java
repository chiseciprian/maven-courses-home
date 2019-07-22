package ro.itschool.mvnbase.homeWorkCurs14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    private final List<Contry> contryList;


    public CountryReader(String path) throws IOException {
        this.contryList = fetchCountry(path);
    }

    private List<Contry> fetchCountry(String path) throws IOException {
        List<Contry> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        String[] splitResult;
        while ((line = bufferedReader.readLine()) != null) {
            splitResult = line.split("\\|");
            result.add(new Contry(splitResult[0], splitResult[1], Long.parseLong(splitResult[2]), Integer.parseInt(splitResult[3])));
        }
        return result;
    }

    public List<Contry> getContryList() {
        return contryList;
    }
}
