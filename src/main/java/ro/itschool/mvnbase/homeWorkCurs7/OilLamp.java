package ro.itschool.mvnbase.homeWorkCurs7;

public class OilLamp implements Lumineers {
   private boolean burn;

    @Override
    public void bright() {
    if (burn==false){
        burn=true;
    } else{
        System.out.println("Oops Oil lump is burning");
    }
    }

    @Override
    public void noBright() {
        if (burn==true){
            burn=false;
        } else{
            System.out.println("Oops Oil lump is not burning");
        }
    }

    @Override
    public String li1ghtStatus() {
        if (burn==true){
            return "Lamp is burning now";
        } else{
            return "Lamp is not burning now";
        }
    }
}
