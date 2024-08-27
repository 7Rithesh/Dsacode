package BitManipulation;

public class noOfSetBits {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;

      /*
           METHOD -- 1

        while (n>0)
        {
            if ((n&1) == 1)
            {
                count++;
            }
            n = n >> 1;
        }
       */

        // METHOD -- 2
        while (n > 0)
        {
            n = (n&(n-1));
            count++;
        }
        System.out.println(count);
    }
}
