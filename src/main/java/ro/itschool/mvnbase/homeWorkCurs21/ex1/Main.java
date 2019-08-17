package ro.itschool.mvnbase.homeWorkCurs21.ex1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person>persons= List.of(new Person("Thomas",16,"Berlin",false),
                new Person("Giulia",26,"Milan",true),
                new Person("Rebecca",32,"Venice",false),
                new Person("Rafael",45,"Madrid",true),
                new Person("Jose",42,"Barcelona",true),
                new Person("Agata",14,"Athens",false)
                );

        final List<String> majorPersonsNames=persons.stream()
                .filter(person -> person.getAge()>=18)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        majorPersonsNames.forEach(personsNames-> System.out.println(personsNames));

        System.out.println("- - - - - - - - - - - - - - - ");

        final List<String>allPerson=persons.stream()
                .map(person -> "<"+person.getName()+">:<"+person.getCity()+">:<"+person.getAge()+">")
                .collect(Collectors.toList());
        allPerson.forEach(person-> System.out.println(person));

        System.out.println("- - - - - - - - - - - - - - - ");

        final List<Person>personNameStartWith=persons.stream()
                .filter(person -> person.getName().startsWith("A"))
                .map(person -> new Person(person.getName(),person.getAge(),person.getCity(),person.isHasCar()))
                .collect(Collectors.toList());
        personNameStartWith.forEach(person -> System.out.println(person));

        System.out.println("- - - - - - - - - - - - - - - ");

        final List<String>personsHasCar=persons.stream()
                .filter(person -> person.isHasCar())
                .map(person -> person.getName())
                .collect(Collectors.toList());
        personsHasCar.forEach(personHasCar-> System.out.println(personHasCar));
    }
}
