package ro.itschool.mvnbase.homeWorkCurs15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryReader {
    private final List<Country> countries;

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountry(path);
    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> result = new ArrayList<>();
        List<String> borders = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        String[] splitResult;
        String[] splitBorders;
        while ((line = bufferedReader.readLine()) != null) {
            splitResult = line.split("\\|");
            if (splitResult.length == 6) {
                String bordersLine = splitResult[5];
                splitBorders = bordersLine.split("~");
                borders = Arrays.asList(splitBorders);
                result.add(new Country(splitResult[0], splitResult[1], Long.parseLong(splitResult[2]), Integer.parseInt(splitResult[3]), splitResult[4], borders));
            } else {
                result.add(new Country(splitResult[0], splitResult[1], Long.parseLong(splitResult[2]), Integer.parseInt(splitResult[3]), splitResult[4], new ArrayList<>()));
            }
        }
        return result;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
