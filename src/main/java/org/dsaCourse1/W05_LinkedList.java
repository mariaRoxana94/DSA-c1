package org.dsaCourse1;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;

    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        // the list is empty
        if (head == null) {
            head = newNode;
        } else {
            // optim will be to have a tail, so no more iterating

            // sol to iterate
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public  void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
        }

        Node current = head;
        while (current.next != null) {

            if (current.next.data == data) {
                current.next = current.next.next;
            }

            // go to the next one
            current = current.next;
        }
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        // last element
        System.out.println("null");
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/
    public Node findMiddle() {

        if (head == null) {
            return null;
        }

//        if (head.next == null) {
//            return head;
//        }

        Node slowPointer = head;
        Node fastPointer = head; // double speed


        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }
}
public class W05_LinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        list.display();
//
//        list.add(6);
//        list.add(8);
//
//        list.display();
//        list.delete(6);
//        list.display();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.findMiddle().data);

        list.add(6);
        System.out.println(list.findMiddle().data);
    }
}
