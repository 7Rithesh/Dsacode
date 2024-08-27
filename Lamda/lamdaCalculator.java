package Lamda;

public class lamdaCalculator {
    public static void main(String[] args) {
        Class sums = (a, b)->(a + b);
        Class sub = (a, b)->(a - b);
        Class multi = (a, b)->(a * b);
        Class div = (a, b)->(a / b);
        lamdaCalculator Calculator = new lamdaCalculator();
        System.out.println(Calculator.caculation(10, 20, multi));
    }

int caculation(int a, int  b, Class op){
        return op.operators(a,b);
}
//boolean FindingEven(int a){
//        return a % 2 == 0;
//}
}

interface Class{
    int operators(int a, int b);

}

