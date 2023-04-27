package com.bridgelabz;

public class LinkedList <T>{

    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        /*
        * New Node is created in the Linked list.so the head and tail is new node.
        * if head is not equal to null, then newNode.next will be head.
        * And head is New node.
         */
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
