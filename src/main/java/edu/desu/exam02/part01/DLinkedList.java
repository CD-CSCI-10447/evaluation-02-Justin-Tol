package edu.desu.exam02.part01;

public class DLinkedList<T> {
    private Node<T> head;

    public DLinkedList() {
    }

    public T getData() {
        if (head != null)
            return head.getData();
        return null;
    }

    public void insertAtHead(T data) {
        Node<T> node = new Node<>(data);
        if (head != null) {
            head.setPrev(node);
            node.setNext(head);
        }
        head = node;
    }

    public void insertAtEnd(T data) {
        Node<T> nextNode = new Node<>(data);
        if (head == null) {
            head = nextNode;
        } else {
            Node<T> current = head;
            while (current.hasNext()) {
                current = current.getNext();
            }
            current.setNext(nextNode);
        }
    }

    public Boolean contains(T data) {
        Node<T> node = this.head;
        while (node != null) {
            if (node.getData() == data) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public Boolean containsDuplicates() {
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            Node checker = currentNode.getNext();
            while (checker != null) {
                if (currentNode.getData() == checker.getData()) {
                    return true;
                }
                checker = checker.getNext();
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public void removeDuplicates() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            Node<T> checker = currentNode;
            while (checker.getNext() != null) {
                if (currentNode.getData().equals(checker.getNext().getData())) {
                    checker.setNext(checker.getNext().getNext());
                } else {
                    checker = checker.getNext();
                }
            }
            currentNode = currentNode.getNext();
        }
    }

        public String toString() {
            StringBuilder output = new StringBuilder();
            Node<T> current = head;
            while (current != null) {
                T data = current.getData();
                output.append(data.toString() + " ");
                current = current.getNext();
            }
            return output.toString().trim();
        }
    }

