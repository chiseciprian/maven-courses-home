package ro.itschool.mvnbase.homeWorkCurs8;

public class Main {
    public static void main(String[] args) {

        Square square =new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getNoOfSides());

        Rectangle rectangle = new Rectangle(6,8);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getNoOfSides());

        Circle circle = new Circle(7,8);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Oval oval =new Oval(7,8,9,10);
        System.out.println(oval.getArea());
        System.out.println(oval.getPerimeter());

    }
}
