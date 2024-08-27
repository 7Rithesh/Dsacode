package BitManipulation;

public class findingNoOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        int base = 10; // base types [2 is binary][10 is decimal][8 is octal] etc...
        int ans = (int)((Math.log(number) / Math.log(base)) + 1);
        System.out.println(ans);
    }
}
