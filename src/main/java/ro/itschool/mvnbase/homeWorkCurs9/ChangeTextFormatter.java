package ro.itschool.mvnbase.homeWorkCurs9;

public class ChangeTextFormatter implements TextFormatter {

    private String sourceText;
    private String newText;

    ChangeTextFormatter(String sourceText){
        this.sourceText=sourceText;
    }

    @Override
    public String format(String targetText) {
        this.newText=this.sourceText.replaceAll(sourceText,targetText);
        return newText;
    }
}
