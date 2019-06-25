package ro.itschool.mvnbase.homeWorkCurs6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConcatTest {

    @Test
    @DisplayName("Concat Two arrays different size")
    void concatDiferent(){
        //SETUP
        Concat concatFunction = new Concat();

        //RUN
        int[]array1={1,2};
        int []array2={6,7,9};
        int[] result=concatFunction.concatArray(array1,array2);
        int[]expectedResult=new int[]{1,2,6,7,9};

        //ASSERT
        Assertions.assertArrayEquals(result,expectedResult);


    }

}