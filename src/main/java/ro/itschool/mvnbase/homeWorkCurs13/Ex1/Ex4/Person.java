package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex4;

public class Person {
    private final String id;
    private final String name;
    private final String adress;
    private final Integer age;

    public Person(String id, String name, String adress, Integer age) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }
}
