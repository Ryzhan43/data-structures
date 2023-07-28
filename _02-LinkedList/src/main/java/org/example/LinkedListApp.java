package org.example;

import javax.swing.*;

public class LinkedListApp {

    public static void main(String[] args) {
        MySinglyLinkedList list1 = new MySinglyLinkedList();
        for(int i=0;i<=5;i++) list1.add(i);
        list1.printNodes();

        System.out.println(list1.indexOf(4));
    }
}
