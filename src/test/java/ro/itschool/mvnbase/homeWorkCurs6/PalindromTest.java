package ro.itschool.mvnbase.homeWorkCurs6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {


    @Test
    @DisplayName("Verificarea unui palindrom")

    void palindromTest(){
        //SETUP
        Palindrom palindromFunction = new Palindrom();

        //RUN
        boolean result=palindromFunction.intPalindrom(1234321);

        //ASSERT
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Verificarea unui numar ce nu este palindrom")

    void noPalindromTest(){
        //SETUP
        Palindrom palindromFunction = new Palindrom();

        //RUN
        boolean result=palindromFunction.intPalindrom(123456);

        //ASSERT
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Palindrom string verification")
    void stringPalindrom(){
        //SETUP
        Palindrom palindromFunction=new Palindrom();

        //RUN
        boolean result=palindromFunction.stringPalindrom("taco cat");

        //ASSERT
        assertTrue(result);

    }

    @Test
    @DisplayName("String ce nu este palindrom")
    void noPalindromString(){
        //SETUP
        Palindrom palindromFunction=new Palindrom();

        //RUN
        boolean result=palindromFunction.stringPalindrom("text");

        //ASSERT
        assertTrue(result);

    }

}