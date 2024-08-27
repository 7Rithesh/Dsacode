package MathsInDsa;

public class SieveMethod {
    public static void main(String[] args) {
        int n = 40;
        boolean [] primes = new boolean[n + 1];
SieveMethod(n, primes);
    }
    static void SieveMethod(int n, boolean[] primes)
    {
        // i * i is a root formula
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i])
            {
                // by multiplying the prime number with 2 it's all must divisible numbers
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if(!primes[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}
