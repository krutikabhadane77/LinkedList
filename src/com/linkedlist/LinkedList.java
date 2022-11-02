//UC1 Lets create a simple Linked List of 56, 30 and 70
//UC2 Ability to create Linked List by adding 30 and 56 to 70
//UC3 Ability to create Linked List by appending 30 and 70 to 56
//UC4 Ability to insert 30 between 56 and 70
//UC5 Ability to delete the first element in the LinkedList of sequence 56->30->70
//UC6 Ability to delete the last element in the LinkedList of sequence 56->30->70
package com.linkedlist;
public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
        }
        tail = newNode;
    }

    public void insertAfterNode(int x) {

        // Considering LinkedList is Sorted
        Node newNode = new Node(x);

        Node current = head;

        while (current != null) {

            if (!(current.data == 56)) {
                current = current.next;
            } else if (current.data == 56)
                break;

        }
        Node temp = current.next;
        newNode.next = temp;
        current.next = newNode;
    }


    public void deleteLastElement() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void display() {
        Node current = head;
        System.out.println("Nodes of linked list ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(56);
        linkedList.addNode(70);
        linkedList.display();
        linkedList.insertAfterNode(30);
        linkedList.display();
        linkedList.deleteLastElement();
        System.out.println("After deleted last element ");
        linkedList.display();
    }
}

