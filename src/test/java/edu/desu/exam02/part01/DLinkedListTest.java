package edu.desu.exam02.part01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DLinkedListTest {

    @Test
    public void insertAtHeadTest01(){
        // Given
        DLinkedList<String> linkedList = new DLinkedList<>();
        linkedList.insertAtHead("First");

        // When
        String expected = "First";
        String actual = linkedList.getData();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insertAtHeadTest02(){
        // Given
        DLinkedList<Integer> linkedList = new DLinkedList<>();
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        // When
        Integer expected = 2;
        Integer actual = linkedList.getData();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insertAtEndTest01(){
        // Given
        DLinkedList<Integer> linkedList = new DLinkedList<>();
        linkedList.insertAtHead(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(4);

        // When
        String expected = "1 2 4";
        String actual = linkedList.toString();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insertAtEndTest02(){
        // Given
        DLinkedList<Integer> linkedList = new DLinkedList<>();
        linkedList.insertAtEnd(10);

        // When
        String expected = "10";
        String actual = linkedList.toString();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containsTest01(){
        // Given
        DLinkedList<String> linkedList = new DLinkedList<>();
        linkedList.insertAtHead("One");
        linkedList.insertAtEnd("Two");
        linkedList.insertAtEnd("Three");

        // When
        Boolean actual = linkedList.contains("Three");

        // Actual
        Assertions.assertTrue(actual);
    }

    @Test
    public void containsTest02(){
        // Given
        DLinkedList<String> linkedList = new DLinkedList<>();
        linkedList.insertAtHead("One");
        linkedList.insertAtEnd("Two");
        linkedList.insertAtEnd("Three");

        // When
        Boolean actual = linkedList.contains("Four");

        // Actual
        Assertions.assertFalse(actual);
    }

    @Test
    public void containsDuplicates01(){
        // Given
        DLinkedList<String> linkedList = new DLinkedList<>();
        linkedList.insertAtHead("One");
        linkedList.insertAtEnd("Two");
        linkedList.insertAtEnd("Two");
        linkedList.insertAtEnd("Three");

        // When
        Boolean actual = linkedList.containsDuplicates();

        // Actual
        Assertions.assertTrue(actual);
    }

    @Test
    public void containsDuplicates02(){
        // Given
        DLinkedList<String> linkedList = new DLinkedList<>();
        linkedList.insertAtHead("One");
        linkedList.insertAtEnd("Two");
        linkedList.insertAtEnd("Three");

        // When
        Boolean actual = linkedList.containsDuplicates();

        // Actual
        Assertions.assertFalse(actual);
    }

    @Test
    public void removeDuplicatesTest01(){
        // Given
        DLinkedList<String> linkedList = new DLinkedList<>();
        linkedList.insertAtHead("One");
        linkedList.insertAtEnd("Two");
        linkedList.insertAtEnd("Three");
        linkedList.insertAtEnd("Two");


        // When
        linkedList.removeDuplicates();
        String expected = "One Two Three";
        String actual = linkedList.toString();

        // Actual
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesTest02(){
        // Given
        DLinkedList<Integer> linkedList = new DLinkedList<>();
        linkedList.insertAtHead(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(4);

        // When
        String expected = "1 2 4";
        String actual = linkedList.toString();

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
