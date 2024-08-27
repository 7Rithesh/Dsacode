package Recursion;

public class trianglePattern {
    public static void main(String[] args) {
        normalTriangle(4, 0);
    }
    static void Revtriangle(int row, int col){
        if(row == 0)
        {
            return;
        }
        if(row > col){
            System.out.print("* ");
            Revtriangle(row, col + 1);
        }
        else {
            System.out.println();
            Revtriangle(row - 1, 0);
        }
    }

    static void normalTriangle(int row, int col){
        if (row == 0) {
            return;
        }
        if(row > col){
            normalTriangle(row,col + 1);
            System.out.print("* ");
        }
        else {
            normalTriangle(row-1, 0);
            System.out.println();
        }
    }
}
