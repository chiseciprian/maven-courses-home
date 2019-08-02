package ro.itschool.mvnbase.homeWorkCurs18;

public class BadCharInputException extends Exception {


    public BadCharInputException(){
        super("This is not a letter");
    }
}
