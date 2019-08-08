package ro.itschool.mvnbase.homeWorkCurs19;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    @DisplayName("Simply array")
    void simpleArray() {
        InsertionSort insertionSort=new InsertionSort();
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, insertionSort.sort(new int[]{3, 4, 2, 1})));
    }


    @Test
    @DisplayName("Null array")
    void nullArray() {
        InsertionSort insertionSort=new InsertionSort();
        assertTrue(Arrays.equals(null, insertionSort.sort(null)));
    }


    @Test
    @DisplayName("Single element array")
    void singleElement(){
        InsertionSort insertionSort=new InsertionSort();
        assertTrue(Arrays.equals(new int[]{3},insertionSort.sort(new int[]{3})));
    }

    @Test
    @DisplayName("Emty array")
    void EmtyArray(){
        InsertionSort insertionSort=new InsertionSort();
        assertTrue(Arrays.equals(new int[]{},insertionSort.sort(new int[]{})));
    }


    @Test
    @DisplayName("Already sorted array")
    void alreadySortArray(){
        InsertionSort insertionSort=new InsertionSort();
        assertTrue(Arrays.equals(new int[]{1,2,3,4,5},insertionSort.sort(new int[]{1,2,3,4,5})));
    }



}