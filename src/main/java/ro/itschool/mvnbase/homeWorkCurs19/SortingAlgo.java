package ro.itschool.mvnbase.homeWorkCurs19;

public interface SortingAlgo {
    int[]sort(int[]elems);

    default void swap(int[]array, int first,int second){
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
}
