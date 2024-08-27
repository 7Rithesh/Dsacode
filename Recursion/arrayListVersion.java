package Recursion;

import java.util.ArrayList;

public class arrayListVersion {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {45,657,23,45,78,52};
        int target = 45;
        System.out.println(arrayListVersion(arr, 0, target, list));
    }
    static ArrayList<Integer>  arrayListVersion(int [] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
             list.add(index);
        }
        return arrayListVersion(arr, index + 1, target, list);
    }
}
