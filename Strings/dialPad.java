package Strings;

import java.util.ArrayList;
import java.util.List;

public class dialPad {
    public static void main(String[] args) {
//        dialPad("", "12");
        ArrayList<String> ans = dialPadList("", "12");
        System.out.println(ans);
    }
    static void dialPad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digits = up.charAt(0) - '0';
        for (int i = (digits-1) * 3; i < digits * 3 ; i++) {
            char ch = (char)('a' + i);
            dialPad(ch + p, up.substring(1));
        }
    }

    static ArrayList<String> dialPadList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digits = up.charAt(0) - '0';
        for (int i = (digits-1) * 3; i < digits * 3 ; i++) {
            char ch = (char)('a' + i);
            ans.addAll(dialPadList(ch + p, up.substring(1)));
        }
        return ans;
    }
}
