package ro.itschool.mvnbase.homeWorkCurs17.Ex5;

public class SumOfDigits {
    public int sumDigit(int number){
        if (number==0){
            return 0;
        }else {
            return number%10+sumDigit(number/10);
        }
    }
}
