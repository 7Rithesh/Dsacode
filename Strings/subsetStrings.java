package Strings;

public class subsetStrings {
    public static void main(String[] args) {
        subsetStrings("", "abcd");
    }
    static void subsetStrings(String As, String Qs){
        if(Qs.isEmpty()){
            System.out.print(As+" ");
            return;
        }
        char ch = Qs.charAt(0);
        subsetStrings(As+ch, Qs.substring(1));
        subsetStrings(As, Qs.substring(1));
    }
}
