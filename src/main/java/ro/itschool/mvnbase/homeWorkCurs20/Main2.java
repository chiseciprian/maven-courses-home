package ro.itschool.mvnbase.homeWorkCurs20;

import ro.itschool.mvnbase.homeWorkCurs20.searchingAlgo.GenericBinarySearch;
import ro.itschool.mvnbase.homeWorkCurs20.searchingAlgo.GenericLinearSearch;
import ro.itschool.mvnbase.homeWorkCurs20.sortingAlgo.GenericBubbleSort;
import ro.itschool.mvnbase.homeWorkCurs20.sortingAlgo.GenericInsertionSort;
import ro.itschool.mvnbase.homeWorkCurs20.sortingAlgo.GenericSelectionSort;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Integer arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        GenericBubbleSort bubbleSort=new GenericBubbleSort();
        GenericInsertionSort insertionSort=new GenericInsertionSort();
        GenericSelectionSort selectionSort=new GenericSelectionSort();

        GenericLinearSearch linearSearch=new GenericLinearSearch();
        GenericBinarySearch binarySearch=new GenericBinarySearch();

        String[]list=new String[]{"Maria","Cristina","Ana"};
        bubbleSort.bubbleSort(list,list.length);
        System.out.println(Arrays.toString(list));

        bubbleSort.bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

//        insertionSort.insertionSort(arr,arr.length);
//        System.out.println(Arrays.toString(arr));

//      selectionSort.selectionSort(arr,arr.length);
//        System.out.println(Arrays.toString(arr));

        System.out.println(linearSearch.linearSearch(list, list.length, "Maria"));
        System.out.println(binarySearch.binarySearch(list, list.length, "Maria"));

    }
}
