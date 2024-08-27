package BitManipulation;

public class RangeOfXor {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;

        int ans = XOR(b) ^ XOR(a-1);
        System.out.println(ans);
    }
    static int XOR(int n)
    {
        if((n%4) == 1)
        {
            return 1;
        }
        if((n%4) == 2)
        {
            return n + 1;
        }
        if((n%4) == 0)
        {
            return n;
        }
        return 0;
    }
}
