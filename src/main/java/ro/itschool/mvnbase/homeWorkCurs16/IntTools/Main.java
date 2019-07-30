package ro.itschool.mvnbase.homeWorkCurs16.IntTools;

public class Main {
    public static void main(String[] args) throws BadPositionException {
        IntTool intTool=new IntTool(523);
        System.out.println(intTool.digitSum());
        System.out.println(intTool.lastDigit());
        try {
            System.out.println(intTool.digitAt(6));
        }catch (BadPositionException bpe){
            System.out.println(bpe);
        }

    }
}
