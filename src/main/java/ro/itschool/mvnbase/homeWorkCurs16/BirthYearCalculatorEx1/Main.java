package ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx1;

import ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx2.BadInputException;
import ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx2.InputEvaluator;

public class Main {
    public static void main(String[] args) {
        InputEvaluator inputEvaluator=new InputEvaluator();

        try {
            int age=20;
            inputEvaluator.evaluate(age);
            BirthYearCalculator birthYearCalculator=new BirthYearCalculator(age);
            System.out.println(birthYearCalculator.calculateBirth());
        }catch (BadInputException bie){
            System.out.println(bie);
        }



    }
}
