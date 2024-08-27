package printitngPatterns;

public class normalPyramid1 {
    public static void main(String[] args) {
        numberedSquarePattern(4);
    }

    static void pyramidType1(int n)
    {

     /*
        #
        # #
        # # #
        # # # #
     */
        // i = j times[ no of columns = no of rows]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    static void squarePattern(int n)
    {
        /*
        *  *  *  *
        *  *  *  *
        *  *  *  *
        *  *  *  *
         */
        // here each and every side the columns and rows are equal so ( j < n and i < n times)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    static void reversePattern(int n)
    {
        /*
         # # # #
         # # #
         # #
         #
         */
        // here the column gradually decreasing so, we can use j <= n - i;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    static void patternType2(int n)
    {
        for (int i = 1; i <= 2 * n; i++) {
            int col = i;
            if(i >= 5)
            {
                col = 2 * n -i;
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void diamondPattern(int n)
    {
        for (int i = 1; i <= 2 * n - 1 ; i++) {
            int col = i;
            if(i > n)
            {
                col = 2 * n - i;
            }
            int noOfSpaces = n - col;
            for (int spaces = 1; spaces <= noOfSpaces ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void columnPyramid(int n)
    {
        /*
                    nofRows = 4; n = 4;
      1             --> Its printing the column the output should be in col
    2 1 2           --> row Loop( normal statement)
  3 2 1 2 3         --> Space Loop(it's run until n - i times)
4 3 2 1 2 3 4       --> 1st half pyramid the col starts from( row ) and end in one
                    --> 2nd half normal loop starts from 2 and it run till row times
         */
        for (int i = 1; i <= n ; i++) {

            for (int spaces = 1; spaces <= n - i ; spaces++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }

            for (int newJ = 2; newJ <= i ; newJ++) {
                System.out.print(newJ+ " ");
            }
            System.out.println();
        }

    }
    static void diamondNumberPattern(int n)
    {
        /*
      1
    2 1 2       --> use above three pattern method
  3 2 1 2 3
4 3 2 1 2 3 4
  3 2 1 2 3
    2 1 2
      1
         */
        for (int i = 1; i <= 2 * n - 1 ; i++) {
            int col = i;
            if(i > n)
            {
                col = 2 * n - i;
            }
            int noOfSpaces = n - col;
            for (int spaces = 1; spaces <= noOfSpaces ; spaces++) {
                System.out.print("  ");
            }
            for (int j = col; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int newJ = 2; newJ <= col; newJ++) {
                System.out.print(newJ + " ");
            }
            System.out.println();
        }
    }

    static void numberedSquarePattern(int n)
    {
        /*

4 4 4 4 4 4 4 4 4
4 3 3 3 3 3 3 3 4
4 3 2 2 2 2 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 1 0 1 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 2 2 2 2 3 4
4 3 3 3 3 3 3 3 4
4 4 4 4 4 4 4 4 4

         */
        int N = 2 * n ;
        int original = n;
        for (int i = 0; i <= N ; i++) {
            for (int j = 0; j <= N; j++) {
                int basicPattern = original - Math.min(Math.min(i, j), Math.min(N - i, N - j ));
                System.out.print(basicPattern + " ");
            }
            System.out.println();
        }
    }
}
