package org.example;

import javax.swing.*;

public class LinkedListApp {

    public static void main(String[] args) {
        MySinglyLinkedList list1 = new MySinglyLinkedList();
        int[] array = {1,1,1,2,3,4,5,5,5,5,5,5};
        for(int i=0;i<=array.length-1;i++){ list1.add(array[i]);}
        list1.printNodes();
        list1.removeDuplicates2();
        list1.printNodes();
//        System.out.println("///////////////");
//        list1.reverse();
//        list1.printNodes();
//        System.out.println(list1.indexOf(4));
    }
}
