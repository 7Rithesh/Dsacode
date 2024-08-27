package Strings;

import java.util.ArrayList;

public class substringInArrayList {
    public static void main(String[] args) {
        System.out.println(substringInArrayList("abc", ""));
    }

    static ArrayList<String> substringInArrayList(String Qs, String As){
        if(Qs.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(As);
            return list;
        }
        char ch = Qs.charAt(0);
        ArrayList<String> left = substringInArrayList(Qs.substring(1), As + ch);
        ArrayList<String> center = substringInArrayList(Qs.substring(1), As);
        ArrayList<String> last = substringInArrayList(Qs.substring(1), As + (ch + 0));

        left.addAll(center);
        left.addAll(last);
        return left;
    }
}
