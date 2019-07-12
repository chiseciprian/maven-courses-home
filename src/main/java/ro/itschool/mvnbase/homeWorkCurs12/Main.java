package ro.itschool.mvnbase.homeWorkCurs12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> first=new ArrayList<>();
        first.add("new");
        first.add("old");
        first.add("first");
        first.add("semnification");
        first.add("steal");
        first.add("uniq");
        first.add("second");
        first.add("second");
        List<String> second=new ArrayList<>();
        second.add("old");
        second.add("new");
        second.add("first");
        second.add("secret");
        second.add("select");
        second.add("second");


        ListOperation listOperation = new ListOperation(first,second);
        System.out.println(listOperation.compare());
        System.out.println(listOperation.intersect());
        System.out.println(listOperation.union());
        System.out.println(listOperation.substract());

    }
}
