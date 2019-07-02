package ro.itschool.mvnbase.homeWorkCurs8;

public class Square extends SideShape {

    private double sideLength;

    Square(int sideLenght){
        this.sideLength =sideLenght;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return sideLength *4;
    }

    @Override
    int getNoOfSides() {
        return 4;
    }
}
