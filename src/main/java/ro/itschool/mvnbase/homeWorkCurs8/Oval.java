package ro.itschool.mvnbase.homeWorkCurs8;

public class Oval extends RoundShape {

    private double secoundPointX;
    private double secoundPointY;
    private double thirdPointX;
    private double thirdPointY;
    private double smallRadius;
    private double largeRadius;

    Oval(double secoundPointX, double secoundPointY,double thirdPointX,double thirdPointY){
        this.secoundPointX=secoundPointX;
        this.secoundPointY=secoundPointY;
        this.thirdPointX=thirdPointX;
        this.thirdPointY=thirdPointY;
    }

   private double getSmallRadius(){
        this.smallRadius=Math.sqrt(((Math.pow(this.centerX,2)-2*this.centerX*this.secoundPointX)+Math.pow(this.secoundPointX,2))+
                (Math.pow(secoundPointY,2)-2*secoundPointY*centerY+Math.pow(centerY,2)));
        return smallRadius;
    }

   private double getLargeRadius(){
        this.largeRadius=Math.sqrt(((Math.pow(this.centerX,2)-2*this.centerX*this.thirdPointX)+Math.pow(this.thirdPointX,2))+
                (Math.pow(thirdPointY,2)-2*thirdPointY*centerY+Math.pow(centerY,2)));
        return largeRadius;
    }


    @Override
    public double getArea() {
        return Math.PI*getSmallRadius()*getLargeRadius();
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*Math.sqrt(((Math.pow(getSmallRadius(),2)+Math.pow(getLargeRadius(),2)))/2);
    }
}
