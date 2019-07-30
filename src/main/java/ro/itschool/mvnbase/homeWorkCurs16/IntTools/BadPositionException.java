package ro.itschool.mvnbase.homeWorkCurs16.IntTools;

public class BadPositionException extends Exception {
    private final int position;

    public BadPositionException(int position){
        super("Position " + position + " is not valid");
        this.position=position;
    }
}
