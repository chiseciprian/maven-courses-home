package ro.itschool.mvnbase.homeWorkCurs15;

public class BadCountryInputException extends Exception {
    private final String country;

    public BadCountryInputException(String country){
        super("This "+ country +" is not valid");
        this.country=country;
    }
}
