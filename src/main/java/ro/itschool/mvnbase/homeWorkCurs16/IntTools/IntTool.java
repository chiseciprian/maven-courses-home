package ro.itschool.mvnbase.homeWorkCurs16.IntTools;

public class IntTool {
    private final Integer number;

    public IntTool(Integer number) {
        this.number = number;
    }

    public int digitSum() {
        int number = this.number;
        int digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number = number / 10;
        }
        return digitSum;
    }

    public int lastDigit() {
        int lastDigit = this.number % 10;
        return lastDigit;
    }

    public int digitAt(int position) throws BadPositionException {
        int number = this.number;
        int[] numberArray = new int[(int) (Math.log10(1000) + 1)];
        if (position<1 || position>numberArray.length-1){
            throw new BadPositionException(position);
        }
        for (int i=numberArray.length-1;i>0;i--){
            numberArray[i]=number%10;
            number/=10;
        }
        return numberArray[position];
    }
}
