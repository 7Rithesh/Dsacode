package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sizeAlter {
    private int size = 0;
    private int[] data;
    private int DEFAULT_SIZE = 10;

    public sizeAlter() {
        this.data = new int[DEFAULT_SIZE];
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int set(int index, int value){
        data[index] = value;
        return value;
    }

    
    public void add(int num) {
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
sizeAlter obj = new sizeAlter();
        obj.add(45);
        obj.add(75);
        obj.add(4);
        obj.remove();
        System.out.println(Arrays.toString(obj.data));

    }
}
