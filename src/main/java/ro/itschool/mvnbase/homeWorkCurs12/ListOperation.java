package ro.itschool.mvnbase.homeWorkCurs12;

import java.util.*;

public class ListOperation {
    private final List<String> first;
    private final List<String> second;


    public ListOperation(List<String> first, List<String> second) {
        this.first = first;
        this.second = second;
    }

    public boolean compare() {
        List<String> first = new ArrayList<>(this.first);
        List<String> second = new ArrayList<>(this.second);
        if (first == null && second == null) {
            return true;
        } else if ((first == null && second != null) || (first != null && second == null) || (first.size() != second.size())) {
            return false;
        }
        Collections.sort(first);
        Collections.sort(second);
        return first.equals(second);
    }


    public List<String> intersect() {
        List<String> first = new ArrayList<>(this.first);
        List<String> second = new ArrayList<>(this.second);
        List<String> intersectedList = new ArrayList<>();
        if(verification(first,second)){
            return null;
        }
        Collections.sort(first);
        Collections.sort(second);
        for (String secondElement : second) {
            for (String firsElement : first) {
                if (firsElement.contains(secondElement)) {
                    if (!intersectedList.contains(firsElement)){
                        intersectedList.add(firsElement);
                    }
                }
            }
        }
        return intersectedList;
    }

    public List<String>union(){
        List<String> first = new ArrayList<>(this.first);
        List<String> second = new ArrayList<>(this.second);
        List<String> union = new ArrayList<>();
        if(verification(first,second)){
            return null;
        }
        for (String firstElement:first){
            if (!union.contains(firstElement)){
                union.add(firstElement);
            }
        }
        for (String secondElemen:second){
            if (!union.contains(secondElemen)){
                union.add(secondElemen);
            }
        }
        return union;
    }

    public List<String> substract(){
        List<String> first = new ArrayList<>(this.first);
        List<String> second = new ArrayList<>(this.second);
        List<String> substract = new ArrayList<>(first);
        if(verification(first,second)){
            return null;
        }
        Collections.sort(first);
        Collections.sort(second);
        for (String secondElement : second) {
            for (String firsElement : first) {
                if (secondElement.contains(firsElement)) {
                    substract.remove(firsElement);
                }
            }
        }
        return substract;
    }

    public boolean verification(List<String> first,List<String>second){
        if (first == null && second == null) {
            return true;
        } else if ((first == null && second != null) || (first != null && second == null)) {
            return true;
        }
        return false;
    }


}
