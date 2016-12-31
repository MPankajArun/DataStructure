package com.ArrayAndStrings;

import sun.awt.image.ImageWatched;

import java.util.Stack;

/**
 * Created by Pankaj Arun Meshram on 31/12/16.
 *
 * Given a singly linked list of integers,
 * write a function in java that returns true if the given list is palindrome, else returns false
 *
 * Singly linked list, so you use auxiliary data store, a stack works, better, a string works with a special character for separator, like "#".
 You simply traverse the linked list and push to the stack, or to the string with "#" , e.g


 1 -> 2 -> 3 -> 42 -> 3 -> 2 -> 1
 will be encoded as :   1#2#3#42#3#2#1

 Now, traverse from left ( head ) again, pop the stack, and match the values.
 In case you are using a String, then split the string and then traverse from right.
 In case they match always, we have a solution.

 Error out in case there is no match.
 We can try to be clever and use some x,2x pointer to reach to the middle. But, as of now, that pointer game is pointless.
 *
 */
public class IsListPalindrome {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.prepend(1);
        lst.prepend(2);
        lst.prepend(3);
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(4);

        System.out.println(listPalindrome(lst.head));
    }

    public static boolean listPalindrome(Node head){
        Stack<Integer>  st = new Stack<Integer>();
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
           st.push(slow.data);
           slow = slow.next;
           fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            if(slow.data != st.pop()){
                return false;
            }
            slow = slow.next;
        }
        return true;


    }


}
