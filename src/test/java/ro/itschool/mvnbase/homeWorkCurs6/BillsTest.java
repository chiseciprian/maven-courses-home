package ro.itschool.mvnbase.homeWorkCurs6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillsTest {

    @Test
    @DisplayName("WHEN adding a bill is payed with largest bill possible")
    void payBill(){
        //SETUP
        Bills payBill= new Bills();

        //RUN
        int[] expectedResult = new int[] {500,200,10,10,1,1,1};
        int[] result =payBill.distinctNumber(723);

        //ASSERT
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    @DisplayName("WHEN bill is zero")
    void zeroBill(){
        //SETUP
        Bills billZero=new Bills();

        //RUN
        int[] expectedResult=new int[]{0};
        int[]result=billZero.distinctNumber(0);

        //ASSERT
        Assertions.assertArrayEquals(expectedResult,result);
    }





}