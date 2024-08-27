package MathsInDsa;
import java.util.Objects;
import java.util.Scanner;
public class IfElse {
        public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);
            System.out.println("is Megna Died :");
            String fate = sc.nextLine();
            if(fate.equals("Yes") || fate.equals("yes")){
                System.out.println("Suriya Meets Priya");
            }
            else {
                System.out.println("Suriya weds Megna");
            }
        }
}

