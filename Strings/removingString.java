package Strings;

public class removingString {
    public static void main(String[] args) {
        System.out.println(removingString2("araoack"));
    }
    // Using with Argument
    static void removingString(String qS, String aS){
            if(qS.isEmpty()){
                System.out.println(aS);
                return;
            }
            char ch = qS.charAt(0);
            if(ch == 'a'){
                removingString(qS.substring(1), aS);
            }
            else {
                removingString(qS.substring(1), aS+ch);
            }
    }
    // Using without Argument
    static String removingString2(String qS){
        if(qS.isEmpty()){
            return"";
        }
        char ch = qS.charAt(0);
        if(ch == 'a'){
            return removingString2(qS.substring(1));
        }

          return ch + removingString2(qS.substring(1));

    }
}
