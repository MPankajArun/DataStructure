package com.ArrayAndStrings;

// A simple Java program to Implement a linked list

import java.util.InputMismatchException;
import java.util.List;
import java.util.Stack;

public class Node{
    int data;
    Node next;

    public Node(int d){
        data = d;
    }

    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.prepend(11);
        lst.append(12);
        lst.prepend(23);
        lst.append(44);
        lst.prepend(55);
        lst.InsertAtNthPosition(66,3);

        lst.display();

        //lst.deleteWithValue(55);
        //lst.display();
        //lst.deleteAtNthPosition(4);
        //lst.display();
        lst.printReverseLinkedList();
    }

}
class LinkedList
{
    Node head;

    // Add a Node at the end of the LinkedList
    public void append(int data){
        Node current = head;
        if(head == null){
            head = new Node(data);
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);

    }

    // Add a Node at front of the LinkedList
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // Remove a Node from LinkedList of a Given Value
    public void deleteWithValue(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            System.out.println( data + " Successfully Deleted.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            if(current.next.data == data){
                current.next = current.next.next;
                System.out.println( data + " Successfully Deleted.");
                return;
            }
            current = current.next;
        }

    }

    // display the elements of LinkedList
    public void display(){
        Node temp = head;
        if(temp == null || temp.next == null)
            return;
        else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    // add a node at a specified position
    public void InsertAtNthPosition(int data,int position){
        Node newNode = new Node(data);
        Node current = head;

        if(position == 0){
            newNode.next = head;
            return;
        }

        int counter = 0;
        while(++counter < position){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // delete a node at a specified position
    public void deleteAtNthPosition(int position){
        Node current = head;
        if(position == 0){
            head = head.next;
            return;
        }
        int counter = 0;
        while(++counter < position){
            current = current.next;
        }
        current.next = current.next.next;
    }

    // Print a LinkedList in Reverse Order
    public void printReverseLinkedList(){
        Node current = head;
        if(current == null || current.next == null ){
            return;
        }
        else{
            Stack<Integer> st = new Stack<Integer>();
            while(current.next != null){
                st.push(current.data);
                current = current.next;
            }
            st.push(current.data);
            while(!st.empty()){
                System.out.println(st.pop());
            }

        }
    }

}