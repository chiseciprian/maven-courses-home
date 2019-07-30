package ro.itschool.mvnbase.homeWorkCurs16.BirthYearCalculatorEx2;

public class InputEvaluator {
    public int evaluate(int input) throws BadInputException {
        if (input<0){
        throw new BadInputException(input);
        }
        return input;
    }
}
