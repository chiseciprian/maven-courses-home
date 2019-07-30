package ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx2;

import ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx1.BirthYearCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BadInputException {
        InputEvaluator inputEvaluator=new InputEvaluator();

        try {
            System.out.println("Insert your age");
            Scanner keyboard = new Scanner(System.in);
            int age=keyboard.nextInt();
            inputEvaluator.evaluate(age);
            BirthYearCalculator birthYearCalculator=new BirthYearCalculator(age);
            System.out.println(birthYearCalculator.calculateBirth());
        }catch (BadInputException bie){
            System.out.println(bie);
        }
    }
}
