package ro.itschool.mvnbase.homeWorkCurs9;

public class Main {
    public static void main(String[] args) {
        ChangeTextFormatter changeTextFormatter =new ChangeTextFormatter("Ana are mere");
        System.out.println(changeTextFormatter.format("Ana nu are mere"));

        NSATextFormatter nsaTextFormatter = new NSATextFormatter();
        System.out.println(nsaTextFormatter.format("Ana are mere"));

        UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
        System.out.println(upperCaseFormatter.format("Ana are mere"));

        UpperCaseSuffixFormatter upperCaseSuffixFormatter = new UpperCaseSuffixFormatter();
        System.out.println(upperCaseSuffixFormatter.format("Ana are mar","ul"));
    }
}
