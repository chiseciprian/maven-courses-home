package ro.itschool.mvnbase.homeWorkCurs7;

public class Bottle {
    private int bottleCapacity;
    private int availableLiquid;
    private boolean bootleStatus;

    Bottle(){
        bottleCapacity=500;
        availableLiquid=500;
        bootleStatus=false;
    }
    Bottle(int bottleCapacity){
        this.bottleCapacity=bottleCapacity;
        this.availableLiquid=bottleCapacity;
        this.bootleStatus=false;
    }
    Bottle(int bottleCapacity,int availableLiquid,boolean bootleStatus){
        this.bottleCapacity=bottleCapacity;
        if(availableLiquid<bottleCapacity){
            this.availableLiquid=availableLiquid;
        } else {
            this.availableLiquid=bottleCapacity;
        }

        this.bootleStatus=bootleStatus;
    }


    public boolean hasMore(){
        return availableLiquid>0;
    }

    public int availabelLiquid(){
        return availableLiquid;
    }

    public int emptyCapacity(){
        return bottleCapacity-availableLiquid;
    }

    public String openBottle(){
        if (bootleStatus==false){
            bootleStatus=true;
            return "Bottle is opened";
        } else{
            return "Bottle is already open";
        }
    }

    public String closeBottle(){
        if (bootleStatus==true){
            bootleStatus=false;
            return "Bottle is closed";
        } else {
            return "Bottle is already closed";
        }
    }

    public String drinkFromBottle(int drinkLiquid){
        if (bootleStatus==true){
            if (drinkLiquid<=availableLiquid){
                this.availableLiquid-=drinkLiquid;
                return "You drink "+drinkLiquid+". Available liquid is "+availableLiquid;
            } else{
                return "Sorry, you drink too much! Your available liquid is "+availableLiquid;
            }

        } else{
            return "Open the bottle first";
        }
    }
}
