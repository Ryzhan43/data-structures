package org.example;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    MySinglyLinkedList(){
        this.head = null;
        this.tail= null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head==null;
    }
    void add(int data){
        // create a new node with data value
        Node node=new Node(data);
        // check if empty

        if(isEmpty()){head=tail=node;
        }
        else { // add element to last position
            tail.next=node;
            tail=node;
        }
        size++;
    }

    void printNodes() {
        Node current=head;
        while(current!=null){
            if(current.next==null) System.out.print(current.value + "=> null");
            else System.out.print(current.value +"=>");
            current=current.next;
        }
        System.out.println();
    };

    // deletes first item with the value
    void deleteNodes(int value) {
        if (isEmpty()) System.out.println("No values with the value send!!");

        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == value) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;

        }
    }

    int indexOf(int value){
        int pos=0;
        Node current=head;
        if(isEmpty()) return-1;
        while (current!=null) {
            if (current.value==value) return pos;
            current=current.next;
            pos++;
        }
        return -1;
    }

    //Tasj

}
