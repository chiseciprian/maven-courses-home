package ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx2;

public class BadInputException extends Exception {
    private final int input;

    public BadInputException(int input){
        super("Age "+input+" is invalid");
        this.input=input;
    }
}
