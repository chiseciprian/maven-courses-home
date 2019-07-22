package ro.itschool.mvnbase.homeWorkCurs14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryReader countryReader = new CountryReader("src/main/resources/countries.txt");
        CountryStatistics countryStatistics = new CountryStatistics(countryReader.getContryList());

        System.out.println(countryStatistics.getAllCountries());
        System.out.println("-------------------");
        System.out.println(countryStatistics.getCountriesStartingWithLetter("R"));
        System.out.println("-------------------");
        System.out.println(countryStatistics.getPopulation("Madagascar"));
        System.out.println("-------------------");
        System.out.println(countryStatistics.getPopulation("Australia"));
        System.out.println("-------------------");
        System.out.println(countryStatistics.getLargestCountry());
        System.out.println("-------------------");
        System.out.println(countryStatistics.getMostPeopleCountry());
        System.out.println("-------------------");
        System.out.println(countryStatistics.getMostDenseCountry());


        List<Contry>contryList=new ArrayList<>(countryStatistics.getAllCountries());
        CountryWriter countryWriter = new CountryWriter("src/main/resources/countriesWritte.txt");
        countryWriter.writte(contryList);

    }
}
