package Recursion;

public class countZeroes {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(method2(3040010, count));
    }
    static int method1(int n){
        if(n == 0)
        {
            return 0;
        }
        int rem = n % 10;
        if(rem == 0)
        {
            count ++;
        }
        method1(n / 10);
        return count;
    }
    static int method2(int n, int count)
    {
        if(n == 0)
        {
            return count;
        }
        int rem = n % 10;
        if(rem == 0)
        {
           return method2(n/10, count+1);
        }
            return method2(n/10, count);

    }
}
