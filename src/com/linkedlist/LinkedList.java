//UC1 Lets create a simple Linked List of 56, 30 and 70
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
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);
        linkedList.display();
    }
}
