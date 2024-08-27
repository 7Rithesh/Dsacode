package LinkedList;

import leetcodeQuestion.ListNode;

class Ll{
    Node head;
    Node tail;
    int size = 0;
    Ll(){
        size = 0;
    }
    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
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
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }
    public void addLast(int value){
        if (tail == null){
            add(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            add(value);
        }
        if(index == size){
            addLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;

    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast1(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteAny(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast1();
        }
        Node pre = get(index -1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        return val;
    }
    public int deleteLast2(){
        Node temp;
        temp = head;
        int val = tail.value;
        if(head.next == null){
            tail = null;
        }
       while (temp.next != tail){
           temp = temp.next;
       }
       temp.next = null;
       tail = temp;
       size--;
       return val;
    }
public int findLengthOfCycle(){
    Node slow = head;
    Node fast = head;
    int length = 0;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            Node temp = slow;
            do{
                temp = temp.next;
                length ++;
            }while (temp == fast);
        }
    }
    return length;
}
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}