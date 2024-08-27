package expectionHandling;

public class Main {
    public static void main(String[] args) throws MyExpection {
        int num1 = 5;
        int num2 = 0;
        String name = "";
        if(name.equals("")){
            throw new MyExpection("Enter any name can't leave blank");
        }
        try {
            divide(num1, num2);
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End of the program");
        }
    }

    static int divide (int a, int b) throws ArithmeticException{
        if(b ==0){
            throw new ArithmeticException("Cann't divide by Zero");
        }
        return a / b;
    }
}
