package ro.itschool.mvnbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloMavenTest {

    @Test
    @DisplayName("When we call sayHello THEN a string is returned")

    void sayHello(){

        //setup
        HelloMaven helloMaven = new HelloMaven();
        //run
        String result=helloMaven.sayHello();

        //assert
        Assertions.assertTrue(result.contains("Hello Maven"));
    }
}