package Recursion;

public class fibinocciNumber {
    public static void main(String[] args) {
        int ans = printFibo(4);
        System.out.println(ans);
    }
    static int printFibo(int n)
    {
       if(n < 2)
       {
           return n;
       }
      return printFibo(n -1 )+ printFibo(n - 2);
    }
}
