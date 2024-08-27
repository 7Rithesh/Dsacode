package medRecusrion;


public class NqueensProblem {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    static void queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }
        // for left Diagonal
        int leftD = Math.min(row,col);
        for (int i = 0; i <= leftD; i++) {
            if(board[row-i][col-i]) {
                    return false;
            }
        }
        // for right Diagonal
        int rightD = Math.min(row, board.length-1-col);
        for (int i = 0; i <= rightD; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for (boolean[] arr: board) {
            for (boolean element: arr) {
                if (element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
