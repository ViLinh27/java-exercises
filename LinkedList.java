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
        new_node.next = null;

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

        System.out.println();
    }

    // delettion by key----------
    // method to delete node in LinkeList by KEY
    public static LinkedList deleteByKey(LinkedList list, int key) {
        // store head node
        // prev is null b/c first node has no previous
        Node currentNode = list.head, prev = null;

        // case 1: if head node has the key to be deleted
        if (currentNode != null && currentNode.data == key) {
            // change the head node since we have the delete the first head
            list.head = currentNode.next;

            // display message
            System.out.println(key + " found and deleted");

            // return new list:
            return list;
        }

        // case 2: if key is somwhere other than head
        // search key to be deleted
        // track prev node since we need it to change currentNode.next
        while (currentNode != null && currentNode.data != key) {
            // if currentNode no have key, keep going to next node
            prev = currentNode;
            currentNode = currentNode.next;
        }

        // if key present,key is at currentNode
        if (currentNode != null) {
            // since the key is at currentNode
            // unlinke currentNode from linkedList
            prev.next = currentNode.next;

            // display message for sanity check
            System.out.println(key + " found and deleted");
        }

        // case 3: the key not in list at all
        // if key not present in linked list currentNode is null
        if (currentNode == null) {
            System.out.println(key + " not found");
        }

        // return list
        return list;
    }

    // driver code
    public static void main(String[] args) {
        // start with empty list!
        LinkedList list = new LinkedList();

        // Where the insertion happens!!!!
        // inser values here:
        list = insert(list, 1);
        list = insert(list, 3);
        list = insert(list, 5);
        list = insert(list, 7);
        list = insert(list, 9);
        list = insert(list, 11);

        printList(list);
        // Output:
        // LinkedList: 1 3 5 7 9 11

        // deletion test:------------

        // delte node with value 1
        // key at head
        deleteByKey(list, 1);

        printList(list);
        // output:
        // 1 found and deleted
        // LinkedList: 3 5 7 9 11

        // delete node with val 7
        // key in middle
        deleteByKey(list, 7);

        printList(list);
        // output:
        // 7 found and deleted
        // LinkedList: 3 5 9 11

        // delete node with val 8
        // key not in list
        deleteByKey(list, 8);

        printList(list);
        // output:
        // 8 not found
        // LinkedList: 3 5 9 11
    }
}

// ref code from :
// https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/