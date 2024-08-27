package BitManipulation;

public class pascalTriangle {
    public static void main(String[] args) {
        int[][] arr = {
                      {1},
                     {1,1},
                    {1,2,1},
                   {1,3,3,1},
                  {1,4,6,4,1},
                 {1,5,10,10,5,1}
        };
        int n = 6;
        int ans = 1 << (n-1);
        System.out.println(ans);
    }
}
