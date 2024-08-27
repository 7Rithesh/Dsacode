package Recursion;

public class godenRatio {
    public static void main(String[] args) {
        System.out.println(goldenRatio(50));
    }
    static int goldenRatio(int n)
    {

        return (int )((Math.pow(((1 + Math.sqrt(5))/ 2), n) - Math.pow(((1 - Math.sqrt(5))/ 2), n))/Math.sqrt(5));
    }
}
