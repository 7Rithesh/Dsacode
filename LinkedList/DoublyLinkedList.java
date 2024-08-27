package LinkedList;

import java.util.*;

public class DoublyLinkedList {
    public static void main(String[] args) {

        DDL list = new DDL();
        list.insertFirst(90);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(80);
        list.insertLast(100);
        list.display();
    }

}

class DDL{
    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.pre = null;
        node.next = head;
        if(head != null){
            head.pre = node;
        }
        head = node;
    }
    public void display(){
        Node temp;
        temp = head;
        while(temp != null){
            System.out.print(temp.val +  "-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node temp = head;
        node.next = null;
        if (head == null) {
            node.pre = null;
            head = node;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }
    class Node {
        int val;
        Node next;
        Node pre;

        Node(int val){
            this.val = val;
        }
        Node(int val , Node next, Node pre){
            this.val = val;
            this.next = next;
            this.pre = pre;
        }
    }
}