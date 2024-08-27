package generics;

public class LinkedL {
    Node head;
    Node tail;
    int size;
    LinkedL(){
        size = 0;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = node;
        }
        node.next = head;
        head = node;
        size++;
    }
    public void addLast(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = node;
        }
        tail.next = node;
        tail = node;
        size ++;
    }
    public void insert(int value, int index){
        if(index == 0){
            addFirst(value);
            return;
        }
        if (index == size){
            addLast(value);
            return;
        }
        Node temp;
        temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return val;
    }

    public void display(){
        Node temp;
        temp = head;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
