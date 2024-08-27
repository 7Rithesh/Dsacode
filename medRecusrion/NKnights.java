package medRecusrion;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        NKnights(board, 0, 0, 4);
    }
    static void NKnights(boolean[][] board, int r, int c, int knights){
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }
        if(isSafe(board, r, c)){
            board[r][c] = true;
            NKnights(board, r, c + 1, knights-1);
            board[r][c] = false;
        }
        NKnights(board, r, c + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
           if ( isVaild(board, r-1, c + 2)){
            if (board[r][c]) {
                return false;
            }
        }
      if (  isVaild(board, r +1, c + 2)){
            if (board[r][c]) {
                return false;
            }
        }
        if (isVaild(board, r - 2, c + 1)){
            if (board[r][c]) {
                return false;
            }
        }
        if (isVaild(board, r - 2, c - 1)){
            if (board[r][c]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isVaild(boolean[][] board, int r, int c) {
        if(r >= 0 && r < board.length && c >=0 && c < board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] arr: board) {
            for (boolean elments:arr) {
                if(elments){
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
        }
    }

}
