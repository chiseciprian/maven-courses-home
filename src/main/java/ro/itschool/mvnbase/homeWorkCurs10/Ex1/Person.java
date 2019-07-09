package ro.itschool.mvnbase.homeWorkCurs10.Ex1;

public class Person {
    private String name;
    private int age;
    private String hairColor;

    Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }
}
