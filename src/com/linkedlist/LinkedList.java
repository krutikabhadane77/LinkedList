//UC1 Lets create a simple Linked List of 56, 30 and 70
//UC2 Ability to create Linked List by adding 30 and 56 to 70
//UC3 Ability to create Linked List by appending 30 and 70 to 56
//UC4 Ability to insert 30 between 56 and 70
//UC5 Ability to delete the first element in the LinkedList of sequence 56->30->70
//UC6 Ability to delete the last element in the LinkedList of sequence 56->30->70
//UC7 Ability to search LinkedList to find Node with value 30
//UC8 Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
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


    public void searchElement(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Element is present at "+i+ " position");
        else
            System.out.println("Element is not present ");

}

    public void insertAtSpecificPosition(int newElement, int position) {
        Node newNode = new Node(40);
        newNode.data = newElement;
        newNode.next = null;

        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            Node temp = new Node(40);
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }

            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
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
        linkedList.addNode(30);
        linkedList.addNode(70);
        linkedList.display();
        linkedList.searchElement(30);
        linkedList.insertAtSpecificPosition(40,3);
        System.out.println("After adding new element ");
        linkedList.display();

    }
}

