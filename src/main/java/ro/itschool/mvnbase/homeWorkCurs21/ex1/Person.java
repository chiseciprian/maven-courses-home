package ro.itschool.mvnbase.homeWorkCurs21.ex1;

public class Person {
    private final String name;
    private final int age;
    private final String city;
    private final boolean hasCar;

    public Person(String name, int age, String city, boolean hasCar) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.hasCar = hasCar;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", hasCar=" + hasCar +
                '}';
    }
}
