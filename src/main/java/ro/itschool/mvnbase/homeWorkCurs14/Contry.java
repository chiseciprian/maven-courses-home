package ro.itschool.mvnbase.homeWorkCurs14;

import java.util.Objects;

public class Contry {
    private String name;
    private String capital;
    private long population;
    private int area;


    public Contry(String name, String capital, long population, int area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contry contry = (Contry) o;
        return population == contry.population &&
                area == contry.area &&
                Objects.equals(name, contry.name) &&
                Objects.equals(capital, contry.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, population, area);
    }

    @Override
    public String toString() {
        return "Contry{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
