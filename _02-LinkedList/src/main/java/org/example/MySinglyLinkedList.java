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

    //Task 1
    // The size of list is unknown
    // Find the Kth element from the last and print it in one pass

    public int getKthFromLast(int k){
        Node prt1=head;
        Node prt2=head;
        for (int i=0;i<k;i++) {
            prt2=prt2.next;
            if(prt2==null) return -1;
        }
        while (prt2.next!=null){
            prt1=prt1.next;
            prt2=prt2.next;
        }
        return prt1.value;
    }

    //task2

    public void removeKthFromLast(int k){
        Node prevDelete=null;
        Node prt1=head;
        Node prt2=head;
        for (int i=0;i<k;i++) {
            prt2=prt2.next;
            if(prt2==null) System.out.println("No such a element in the collection");;
        }
        while (prt2.next!=null){
            prt1=prt1.next;
            prt2=prt2.next;
        }
        if(prt1==head) {head=prt1.next; prt1.next=null; size--;}
        else {
            prevDelete.next=prt1.next;
            prt1.next=null;
        }
    }


    //Homework
    //Task 1
    public void reverse(){
        Node current = head.next;
        Node prev = head;

        while (current!=null) {
            Node nextNode = current.next;
            current.next=prev;
            prev = current;
            current = nextNode;
        }
        tail=head;
        tail.next=null;
        head=prev;
    }



    // Task 2
    public void removeDuplicates() {
        if (isEmpty()) System.out.println("No values with the value send!!");

        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == current.next.value) {
                if (current == head) {
                    head = current.next;
                    current.next = current.next.next;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = prev.next.next;
                } else {
                    prev.next = current.next;
                    current.next = current.next.next;
                }
                size--;
            }
            prev = current;
            current = current.next;

        }
    }

    public void removeDuplicates2() {
        Node current = head;
        while (current != null){
            Node nextDistinctNode = current.next;
            while (nextDistinctNode != null && nextDistinctNode.value == current.value){
                nextDistinctNode = nextDistinctNode.next;
            }
            current.next = nextDistinctNode;
            current = nextDistinctNode;
        }

        }

    }



