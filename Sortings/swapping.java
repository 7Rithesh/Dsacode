package Sortings;

public class swapping {
    public static void main(String[] args) {
        int num1 = 234;
        int num2 = 332;

    swap(num1, num2);
    }
    static void swap(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1 +" "+ n2);
    }
}
