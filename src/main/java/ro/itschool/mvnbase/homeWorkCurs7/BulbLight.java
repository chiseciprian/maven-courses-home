package ro.itschool.mvnbase.homeWorkCurs7;

public class BulbLight implements Lumineers {
    private boolean switchButton;

    @Override
    public void bright() {
        if (switchButton==false){
            switchButton=true;
        } else {
            System.out.println("Oops Light is turn on");
        }
    }

    @Override
    public void noBright() {
        if (switchButton==true){
            switchButton=false;
        } else {
            System.out.println("Oops Light is turn off");
        }
    }

    @Override
    public String li1ghtStatus() {
        if (switchButton==true){
            return "Light is turn on";
        } else {
            return "Light is turn off";
        }
    }
}
