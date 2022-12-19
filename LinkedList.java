import java.io.*;

//java program to implement a singly linked list
public class LinkedList {
    Node head; // head of list

    /* Linked list Node */
    // inner class made static so main() can access it
    static class Node {
        int data;// data stored in node
        Node next;// connects to next node

        // Constructor to create new node
        // Next is by default initialized as null
        Node(int d) {
            data = d;
            next = null;// do we need this?
        }
    }

    // method to insert new node
    // note how its of type LinkedList class
    public static LinkedList insert(LinkedList list, int data) {
        // create new node with given data
        Node new_node = new Node(data);

        // if Linked List is empty, then make new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // if list has stuff in it,
            // go through entire LinkedList to last node
            // then insert new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;// checks the next to see if something is in there
            }

            // insert new_node at last node
            last.next = new_node;
        }

        // Return list by head since typically Linked Lists are
        // represented by head pointer
        return list;
    }

    // method to print the LinkedList
    public static void printList(LinkedList list) {
        Node currentNode = list.head;// remember LinkedLists represented by head pointer

        System.out.print("LinkedList: ");// header for print out

        // go through the LinkedList:
        while (currentNode != null) {
            // Print data at current node
            System.out.print(currentNode.data + " ");

            // go to next node
            currentNode = currentNode.next;
        }
    }

    // driver code
}