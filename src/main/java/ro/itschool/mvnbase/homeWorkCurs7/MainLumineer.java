package ro.itschool.mvnbase.homeWorkCurs7;

public class MainLumineer {
    public static void main(String[] args) {
        OilLamp oilLamp =new OilLamp();
        oilLamp.noBright();
        oilLamp.bright();
        System.out.println(oilLamp.li1ghtStatus());

        BulbLight bulbLight = new BulbLight();
        bulbLight.bright();
        bulbLight.noBright();
        System.out.println(bulbLight.li1ghtStatus());
    }
}
