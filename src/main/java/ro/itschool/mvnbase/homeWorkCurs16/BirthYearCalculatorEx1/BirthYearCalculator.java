package ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx1;

import java.util.Calendar;

public class BirthYearCalculator {
    private final int age;

    public BirthYearCalculator(int age) {
        this.age = age;
    }

    public Integer calculateBirth() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int birthYear = year - this.age;
        return birthYear;
    }


}
