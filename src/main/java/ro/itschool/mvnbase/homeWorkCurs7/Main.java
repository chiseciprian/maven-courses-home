package ro.itschool.mvnbase.homeWorkCurs7;

public class Main {
    public static void main(String[] args) {
    Bottle bottle1 = new Bottle();

    System.out.println(bottle1.availabelLiquid());
    System.out.println(bottle1.closeBottle());
    System.out.println(bottle1.openBottle());
    int drinkLiquid=200;
    System.out.println( bottle1.drinkFromBottle(drinkLiquid));

    drinkLiquid=400;
    System.out.println( bottle1.drinkFromBottle(drinkLiquid));
    System.out.println(bottle1.emptyCapacity());





    }
}
