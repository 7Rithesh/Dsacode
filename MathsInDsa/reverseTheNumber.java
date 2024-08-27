package MathsInDsa;

public class reverseTheNumber {
    public static void main(String[] args) {
            reverseTheNumber(2443);
    }
    static void reverseTheNumber(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
