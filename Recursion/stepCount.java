package Recursion;

public class stepCount {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(7));
    }

    static int numberOfSteps(int num) {
        int steps = 0;
        return getSteps(num, steps);
    }

    static int getSteps(int num, int steps){
        if(num == 0)
        {
            return steps;
        }
        if(num % 2 == 0)
        {
            return getSteps(num / 2, steps + 1);
        }
        return getSteps(num - 1, steps + 1);
    }
}
