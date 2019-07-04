package ro.itschool.mvnbase.homeWorkCurs9;

public class NSATextFormatter implements TextFormatter {

    private String newText="";
    private int noOfChar;


    @Override
    public String format(String string) {
        for (int i=0;i<numberOFChar(string);i++){
            newText+="*";
        }
        return newText;
    }

    private int numberOFChar(String text){
        this.noOfChar=text.length();
        return noOfChar;
    }
}
