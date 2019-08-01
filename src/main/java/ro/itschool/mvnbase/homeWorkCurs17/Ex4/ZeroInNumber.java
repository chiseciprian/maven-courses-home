package ro.itschool.mvnbase.homeWorkCurs17.Ex4;

public class ZeroInNumber {
    public int zeroInNumber(int num) {
        if (num == 0) {
            return 1;
        }
        if (num % 10 == 0) {
            return 1 + zeroInNumber(num / 10);
        } else if (num / 10 == 0) {
            return 0;
        } else {
            return zeroInNumber(num / 10);
        }
    }
}
