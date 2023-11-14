package edu.desu.exam02.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void endXTest01(){
        // Given
        Example example = new Example();
        String input = "xxre";

        //When
        String expected = "rexx";
        String actual = example.endX(input);

        // Then

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void endXTest02(){
        // Given
        Example example = new Example();
        String input = "xxhixx";

        //When
        String expected = "hixxxx";
        String actual = example.endX(input);

        // Then

        Assertions.assertEquals(expected, actual);

    }
}
