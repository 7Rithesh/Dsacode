package Strings;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
//        ArrayList<String> ans = permutationList("abc", "");
//        System.out.println(ans);
        System.out.println(permutationCount2("abc", "",0));
    }
    static void permutation(String Qs, String As){
        if(Qs.isEmpty()){
            System.out.println(As);
            return;
        }
        char ch = Qs.charAt(0);
        for (int i = 0; i <= As.length(); i++) {
                String f = As.substring(0,i);
                String l = As.substring(i,As.length());
                permutation(Qs.substring(1), f + ch + l);
        }
    }
    static ArrayList<String> permutationList(String Qs, String As){
        if(Qs.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(As);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = Qs.charAt(0);
        for (int i = 0; i <= As.length(); i++) {
            String f = As.substring(0,i);
            String l = As.substring(i,As.length());
            ans.addAll(permutationList(Qs.substring(1), f + ch + l));
        }
        return ans;
    }
    static int permutationCount(String Qs, String As){
        if(Qs.isEmpty()){
            return 1;
        }
        char ch = Qs.charAt(0);
        int count = 0;
        for (int i = 0; i <= As.length(); i++) {
            String f = As.substring(0,i);
            String l = As.substring(i,As.length());
            count = count + permutationCount(Qs.substring(1), f + ch + l);
        }
        return count;
    }

    static int permutationCount2(String Qs, String As, int count){
        if(Qs.isEmpty()){
            return 1;
        }
        char ch = Qs.charAt(0);
        for (int i = 0; i <= As.length(); i++) {
            String f = As.substring(0,i);
            String l = As.substring(i,As.length());
            count = count + permutationCount(Qs.substring(1), f + ch + l);
        }
        return count;
    }

}
