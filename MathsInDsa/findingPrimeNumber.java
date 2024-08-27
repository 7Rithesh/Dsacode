package MathsInDsa;

public class findingPrimeNumber {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n)
    {
        int check = 2;
        while (check * check <= n)
        {
            if(n % check == 0)
            {
                return false;
            }
            check++;
        }
        return true;
    }
}
