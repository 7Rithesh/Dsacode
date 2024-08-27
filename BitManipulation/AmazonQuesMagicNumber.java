package BitManipulation;

public class AmazonQuesMagicNumber {
    public static void main(String[] args) {
        int n = 5; // 5 in binary form '101'
        int ans = 0;
        int base = 5; //Actual base of the question
        // using while loop
        while (n > 0)
        {
            int last = n & 1;        // it's give the last binary digit of n
            n = n >> 1;             // to remove the last bit using RIGHT SHIFT
            ans += base * last;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
