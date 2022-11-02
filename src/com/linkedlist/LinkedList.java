//UC1 Lets create a simple Linked List of 56, 30 and 70
//UC2 Ability to create Linked List by adding 30 and 56 to 70
package com.linkedlist;

public class LinkedList {
    static class Node{
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
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
            tail.next = null;
        }

    }
    public void display() {
        Node current = head;
        System.out.println("Nodes of linked list ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(70);
        linkedList.addNode(30);
        linkedList.addNode(56);
        linkedList.display();
    }
}
