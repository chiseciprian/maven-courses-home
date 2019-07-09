package ro.itschool.mvnbase.homeWorkCurs10.Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Jake",18,"brown"));
        person.add(new Person("Dan",33,"brown"));
        person.add(new Person("Cris",24,"blonde"));
        person.add(new Person("Carl",45,"brown"));
        person.add(new Person("Emilly",39,"red"));
        person.add(new Person("Mark",55,"blonde"));

        System.out.println(persoName(person));
        System.out.println(personByAge(person,18));
        System.out.println(mapHairColor(person));
    }

    public static List<String> persoName(List<Person> person){
        List<String> personName=new ArrayList<>();
        for (Person element: person){
            personName.add(element.getName());
        }
        return personName;
    }

    public static List<String> personByAge(List<Person>person,int age){
        List<String> personByAge = new ArrayList<>();
        for (Person element: person){
            if(element.getAge()>age){
                personByAge.add(element.getName());
            }
        }
        return personByAge;
    }

    public static Map<String,List<String>> mapHairColor(List<Person>person){
        Map<String,List<String>> mapHair =new HashMap<>();
        for (Person pers:person){
            List<String> name=mapHair.get(pers.getHairColor());
            if (name==null){
                name=new ArrayList<>();
                mapHair.put(pers.getHairColor(),name);
            }
            name.add(pers.getName());
        }
        return mapHair;
    }
}
