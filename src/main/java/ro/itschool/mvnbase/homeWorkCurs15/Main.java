package ro.itschool.mvnbase.homeWorkCurs15;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryReader countryReader=new CountryReader("src/main/resources/countries2.txt");
        System.out.println(countryReader.getCountries());

        List<Country>countries=new ArrayList<>(countryReader.getCountries());
        CountriesStatistics countriesStatistics= new CountriesStatistics(countries);

        try {
            System.out.println("- - - - - - - - - - - - - - - - ");
            System.out.println(countriesStatistics.getBorderingCountries("Romania"));
            System.out.println("- - - - - - - - - - - - - - - - ");
            System.out.println(countriesStatistics.getCountriesBordering("RO"));
            System.out.println("- - - - - - - - - - - - - - - - ");
            System.out.println(countriesStatistics.getCountriesForRegion("Asia"));
        }catch (BadCountryInputException bcie){
            System.out.println(bcie);
        }

    }
}
