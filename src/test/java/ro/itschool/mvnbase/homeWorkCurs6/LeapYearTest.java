package ro.itschool.mvnbase.homeWorkCurs6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LeapYearTest {

    @Test
    @DisplayName("Testing a leap year")
    void leapYear(){
        //SETUP
        LeapYear leapYear = new LeapYear();

        //RUN
        String result=leapYear.leapYear(2020);
        String expectedResult="Is a leap year";

        //ASSERT
        Assertions.assertSame(result,expectedResult);
    }

    @Test
    @DisplayName("Testing a normal year")
    void normalYear(){
        //SETUP
        LeapYear leapYear = new LeapYear();

        //RUN
        String result=leapYear.leapYear(2019);
        String expectedResult="Is not a leap year";

        //ASSERT
        Assertions.assertSame(result,expectedResult);
    }

    @Test
    @DisplayName("Testing a nehative numbers")
    void negativeNumber(){
        //SETUP
        LeapYear leapYear = new LeapYear();

        //RUN
        String result=leapYear.leapYear(-2019);
        String expectedResult="Opps! Please insert a positive number!";

        //ASSERT
        Assertions.assertSame(result,expectedResult);
    }

}