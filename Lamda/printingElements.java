package Lamda;

import java.util.ArrayList;

public class printingElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        System.out.println();
        list.forEach((item) -> System.out.println(item * 10));
        int[][] arr =
                {
                        {12, 34, 44,51},
                        {92, 44, 89 ,65},
                        {29, 49, 45,50},
                        {12, 34, 48,58}
                };
        for (int[] num: arr) {
            for (int num1 : num){
                System.out.print(num1+"   ");
            }
            System.out.println();
        }
    }
}
