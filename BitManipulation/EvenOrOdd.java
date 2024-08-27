package BitManipulation;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 34;
        if(EvenOrOdd(n))
        {
            System.out.println("Its an odd Number");
        }
        else
        {
            System.out.println("It's even number");
        }
    }
    static boolean EvenOrOdd(int n)
    {
        return (n & 1) == 1;
    }
}
