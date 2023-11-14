package edu.desu.exam02.part02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursionTest {

    @Test
    public void countSubString01(){
        // Given
        Recursion recursion = new Recursion();
        String input = "Abc";

        // When
        Integer expected = 3;
        Integer actual = recursion.countSubString("Abc", "AbcAbcAbc");

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countSubString02(){
        // Given
        Recursion recursion = new Recursion();
        String input = "xyz";

        // When
        Integer expected = 5;
        Integer actual = recursion.countSubString("xyz", "xyzxyzxyzxyzxyz");

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countSubString03(){
        // Given
        Recursion recursion = new Recursion();
        String input = "xyz";

        // When
        Integer expected = 0;
        Integer actual = recursion.countSubString("xyz", "AbcAbcAbc");

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
