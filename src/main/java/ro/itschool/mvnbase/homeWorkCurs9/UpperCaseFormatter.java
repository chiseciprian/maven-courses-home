package ro.itschool.mvnbase.homeWorkCurs9;

public class UpperCaseFormatter implements TextFormatter {

    private String newText="";

    @Override
    public String format(String string) {
        this.newText=string.toUpperCase();
        return newText;
    }


}
