package Recursion;

public class IToN {
    public static void main(String[] args) {
        recFun(5);
    }
    static void recFun(int n)
    {
        if (n == 0)
        {
            return;
        }
        recFun(n - 1);
        System.out.println(n);
    }
}
