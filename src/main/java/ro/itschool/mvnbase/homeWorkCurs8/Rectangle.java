package ro.itschool.mvnbase.homeWorkCurs8;

public class Rectangle extends SideShape{

    private double sideALength;
    private double sideBLength;

    Rectangle(double sideALength,double sideBLength){
        this.sideALength=sideALength;
        this.sideBLength=sideBLength;
    }

    @Override
    int getNoOfSides() {
        return 4;
    }

    @Override
    public double getArea() {
        return sideALength*sideBLength;
    }

    @Override
    public double getPerimeter() {
        return 2*(sideALength+sideBLength);
    }
}
