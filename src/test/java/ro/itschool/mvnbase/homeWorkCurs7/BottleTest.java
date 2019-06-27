package ro.itschool.mvnbase.homeWorkCurs7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleTest {

    @Test
    @DisplayName("TRY drink from a closed bottle")
    void drinkClosedBottle(){
        //SETUP
        Bottle bottle =new Bottle();

        //RUN
        String result=bottle.drinkFromBottle(200);
        String expectedResult="Open the bottle first";

        //ASSERT
        assertSame(expectedResult,result);
    }

    @Test
    @DisplayName("Drinking in normal condition")
    void drinkNormalCondition(){
        //SETUP
        Bottle bottle = new Bottle(500,500,true);

        //RUN
        String result=bottle.drinkFromBottle(200);

        //ASSERT
        assertFalse(result.contains("Sorry"));
    }

    @Test
    @DisplayName("Open bottle but not availabel liquid")
    void drinkNotAvailable(){
        //SETUP
        Bottle bottle = new Bottle(500,500,true);

        //RUN
        String result=bottle.drinkFromBottle(800);

        //ASSERT
        assertTrue(result.contains("Sorry"));
    }

    @Test
    @DisplayName("TRY open a opened bottle")
    void openBottleAlreadyOpen(){
        //SETUP
        Bottle bottle = new Bottle(500,500,true);

        //RUN
        String result=bottle.openBottle();
        String expectedResult="Bottle is already open";

        //ASSERT
        assertSame(result,expectedResult);

    }


}