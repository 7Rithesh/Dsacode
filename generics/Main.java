package generics;

public class Main {
    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(5);
        list.insert(25,2);
        list.display();
    }
}
