package ro.itschool.mvnbase.homeWorkCurs9;

public class UpperCaseSuffixFormatter extends UpperCaseFormatter {

    private String newText="";


    public String format(String string,String sufix) {
        this.newText=super.format(string);
        this.newText+=sufix;
        return newText;
    }



}
