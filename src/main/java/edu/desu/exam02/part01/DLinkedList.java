package edu.desu.exam02.part01;

public class DLinkedList<T> {
    private Node<T> head;

    public DLinkedList(){
    }

    public T getData(){
        if(head != null)
            return head.getData();
        return null;
    }

    public void insertAtHead(T data){
        Node<T> node = new Node<>(data);
        if (head != null) {
            head.setPrev(node);
            node.setNext(head);
        }
        head = node;
    }

    public void insertAtEnd(T data){
        Node<T> nextNode = new Node<>(data);
        if(head == null){
            head = nextNode;
        }else {
            Node<T> current = head;
            while(current.hasNext()){
                current = current.getNext();
            }
            current.setNext(nextNode);
        }
    }

    public Boolean contains(T data){
        return null;
    }

    public Boolean containsDuplicates(){
       return null;
    }

    public void removeDuplicates(){
    }

    public String toString(){
        StringBuilder output = new StringBuilder();
        Node<T> current = head;
        while(current != null){
            T data = current.getData();
            output.append(data.toString()+ " ");
            current = current.getNext();
        }
        return output.toString().trim();
    }
}
