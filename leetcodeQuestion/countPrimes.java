package leetcodeQuestion;

public class countPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(9));
    }
    public static int countPrimes(int number) {
        if (number <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return 0; // Divisible by a number other than 1 and itself
            }
        }
        return 1; // Number is prime
    }
}

