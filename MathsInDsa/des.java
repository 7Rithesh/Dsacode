package MathsInDsa;

import OOPS.class1;
import OOPS.class2;

import java.util.Arrays;

public class des {
    public static void main(String[] args) {
        int[] ar = {3,5,61,1,56};

        for (int i = 0; i < ar.length; i++) {
            int max = 0;
            for (int j = i; j <ar.length ; j++) {
                if(ar[j] > max)
                {
                    max = ar[j];
                }

            }
            ar[i] = max;
        }
        System.out.println(Arrays.toString(ar));
    }
}
