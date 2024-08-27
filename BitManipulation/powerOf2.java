package BitManipulation;

public class powerOf2 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(ans(n));
    }
    static boolean ans(int n)
    {
       return (n&(n-1)) == 0;
        /*
        8 is 1000 we are using ADD operator

        1000
        0111
        ----
        0000
        ----

        if its give me zero the it's power of 2
         */
    }
}
