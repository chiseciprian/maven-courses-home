package ro.itschool.mvnbase.homeWorkCurs14;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private final List<Contry> contryList;

    public CountryStatistics(List<Contry> contryList) {
        this.contryList = contryList;
    }

    public List<Contry> getAllCountries() {
        return new ArrayList<>(contryList);
    }

    public List<Contry> getCountriesStartingWithLetter(String letter) {
        List<Contry> contriesStartWithLetter = new ArrayList<>();
        for (Contry contryElement : contryList) {
            if (contryElement.getName().startsWith(letter)) {
                contriesStartWithLetter.add(contryElement);
            }
        }
        return contriesStartWithLetter;
    }

    public long getPopulation(String countryName) {
        long population = 0;
        for (Contry contryElement : contryList) {
            if (contryElement.getName().equals(countryName)) {
                population = contryElement.getPopulation();
            }
        }
        return population;
    }

    public long getArea(String countryName) {
        long area = 0;
        for (Contry contryElement : contryList) {
            if (contryElement.getName().equals(countryName)) {
                area = contryElement.getPopulation();
            }
        }
        return area;
    }

    public Contry getLargestCountry() {
        long area = 0;
        Contry result = null;
        for (Contry contryElement : contryList) {
            if (contryElement.getArea() > area) {
                area = contryElement.getArea();
                result = contryElement;
            }
        }
        return result;
    }

    public Contry getMostPeopleCountry() {
        long people = 0;
        Contry result = null;
        for (Contry contryElement : contryList) {
            if (contryElement.getPopulation() > people) {
                people = contryElement.getPopulation();
                result = contryElement;
            }
        }
        return result;
    }

    public Contry getMostDenseCountry() {
        double density = 100;
        Contry contry = null;
        for (Contry contryElement : contryList) {
            if (((double)contryElement.getArea()/(double)contryElement.getPopulation()) < density) {
                density = (double)contryElement.getArea()/(double)contryElement.getPopulation();
                contry = contryElement;
            }
        }
        return contry;
    }




}
