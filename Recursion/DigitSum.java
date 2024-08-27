package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digSum(3353));;
    }
    static int digSum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return digSum(n / 10)+(n - 10) ;
    }
}
