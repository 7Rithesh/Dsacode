package Strings;

public class skipApple {
    public static void main(String[] args) {
        System.out.println(skipappNotApple("riappapple"));
    }
    static String skipApple(String Qs){
        if(Qs.isEmpty()){
            return "";
        }
        if(Qs.startsWith("apple")){
            return skipApple(Qs.substring(5));
        }
        else {
            return skipApple(Qs.substring(1));
        }
    }

    static String skipappNotApple(String Qs){
        if(Qs.isEmpty()){
            return "";
        }
        if(Qs.startsWith("app") && !Qs.startsWith("apple")){
            return skipappNotApple(Qs.substring(3));
        }
        else {
            return Qs.charAt(0) + skipappNotApple(Qs.substring(1));
        }
    }
}
