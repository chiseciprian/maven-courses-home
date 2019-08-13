package ro.itschool.mvnbase.homeWorkCurs20;

public class Main {
    public static void main(String[] args) {
        GenericList<String>myList=new GenericList<>();
        System.out.println(myList.size());
        for (int i=1;i<=1000;i++){
            myList.add("test"+i);
        }
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        System.out.println(myList.get(999));
    }
}
