package ro.itschool.mvnbase.homeWorkCurs15;

import java.util.ArrayList;
import java.util.List;

public class CountriesStatistics {
    private final List<Country> countries;

    public CountriesStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountriesForRegion(String region) throws BadCountryInputException {
        List<Country>countriesByRegion=new ArrayList<>();
        for (Country country:countries){
            if (country.getRegion().equals(region)){
                countriesByRegion.add(country);
            }
        }
        if (countriesByRegion.isEmpty()){
            throw new BadCountryInputException(region);
        }
        return countriesByRegion;
    }

    public List<Country> getCountriesBordering(String borderInitials) throws BadCountryInputException {
        List<Country>countriesBordering=new ArrayList<>();
        for (Country country:countries){
            if (country.getBorders().contains(borderInitials)){
                countriesBordering.add(country);
            }
        }
        if (countriesBordering.isEmpty()){
            throw new BadCountryInputException(borderInitials);
        }
        return countriesBordering;
    }

    public List<String> getBorderingCountries(String countryName) throws BadCountryInputException {
        List<String>borderingCountries=new ArrayList<>();
        for (Country country: countries){
            if (country.getName().equals(countryName) ){
               borderingCountries=new ArrayList<>(country.getBorders());
            }
        }
        if (borderingCountries.isEmpty()){
            throw new BadCountryInputException(countryName);
        }
        return borderingCountries;
    }
}
