import java.io.*;
import java.util.ArrayList;

public class LinkedListShapes {
    Node head; // head of list

    static class Node {
        Shapes data;
        Node next;

        Node(Shapes d) {
            data = d;
            next = null;
        }
    }

    public static LinkedListShapes insert(LinkedListShapes list, Shapes data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedListShapes list) {
        Node currentNode = list.head;

        System.out.println("Shapes LinkedList: ");

        while (currentNode != null) {
            System.out.println(currentNode.data + " ");

            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public static LinkedListShapes deleteByKey(LinkedListShapes list, String namekey) {
        Node currentNode = list.head, prev = null;

        // head deleted
        if (currentNode != null && currentNode.data.name == namekey) {
            list.head = currentNode.next;
            System.out.println(namekey + " found and deleted");
            return list;
        }

        // middle deleted
        while (currentNode != null && currentNode.data.name != namekey) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            prev.next = currentNode.next;
            System.out.println(namekey + " found and deleted");
        }

        // key no found
        if (currentNode == null) {
            System.out.println(namekey + " not found");
        }

        return list;
    }

}
