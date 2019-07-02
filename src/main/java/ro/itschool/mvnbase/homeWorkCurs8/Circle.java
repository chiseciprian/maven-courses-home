package ro.itschool.mvnbase.homeWorkCurs8;

public class Circle extends RoundShape {

    private double secoundPointX;
    private double secoundPointY;
    private double radius;

    Circle(double secoundPointX,double secoundPointY){
        this.secoundPointX=secoundPointX;
        this.secoundPointY=secoundPointY;
    }

     private double getRadius(){
        this.radius=Math.sqrt(((Math.pow(this.centerX,2)-2*this.centerX*this.secoundPointX)+Math.pow(this.secoundPointX,2))+
                (Math.pow(secoundPointY,2)-2*secoundPointY*centerY+Math.pow(centerY,2)));
        return radius;
    }


    @Override
    public double getArea() {
        return Math.PI*(getRadius()*getRadius());
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getRadius()*getRadius();
    }
}
