package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class PersonFileReader {
    private final List<Person>personList;


    public PersonFileReader(String path) throws IOException {
        this.personList = fetchPerson(path);
    }



    private List<Person> fetchPerson(String path) throws IOException {
        List<Person>result=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(path));
        String line;
        String[] splitResult ;
        while ((line=bufferedReader.readLine()) != null){
           splitResult= line.split("\\|");
            result.add(new Person(UUID.randomUUID().toString(),splitResult[0],splitResult[1],Integer.parseInt(splitResult[2])));
        }
        return result;
    }

    @Override
    public String toString() {
        return "PersonFileReader{" +
                "personList=" + personList +
                '}';
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
