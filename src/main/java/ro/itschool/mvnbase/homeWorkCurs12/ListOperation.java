package ro.itschool.mvnbase.homeWorkCurs12;

import java.util.*;

public class ListOperation {
    private final List<String> first;
    private final List<String> second;


    //protejam mai bine din constructor

    public ListOperation(List<String> first, List<String> second) {
        this.first=first==null? new ArrayList<>():first;
        this.second=second==null? new ArrayList<>():second;
    }

    public boolean compare() {
        List<String> first = new ArrayList<>(this.first);
        List<String> second = new ArrayList<>(this.second);

        if (first.size() != second.size() ){
            return false;
        }
        Collections.sort(first);
        Collections.sort(second);
        return first.equals(second);
    }


    public List<String> intersect() {
        Set<String> intersectedList = new HashSet<>();
        for (String secondElement : second) {
                if (first.contains(secondElement)) {
                        intersectedList.add(secondElement);
                }

        }
        return new ArrayList<>( intersectedList);
    }

    public List<String>union(){
        Set<String> union = new HashSet<>(first);
        for (String secondElemen:second){
                union.add(secondElemen);
        }
        return new ArrayList<>(union);
    }

    public List<String> substract(){
        List<String> substract = new ArrayList<>(first);
        for (String secondElement : second) {
                while (first.contains(secondElement)) {
                    substract.remove(secondElement);
                }
        }
        return substract;
    }



}
