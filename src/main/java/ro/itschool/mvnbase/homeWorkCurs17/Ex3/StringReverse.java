package ro.itschool.mvnbase.homeWorkCurs17.Ex3;

public class StringReverse {
    public String revertString(String word){
        if (word.equals("")){
            return "";
        }else {
            return revertString(word.substring(1))+word.charAt(0);
        }
    }
}
