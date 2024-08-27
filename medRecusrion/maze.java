package medRecusrion;

public class maze {
    public static void main(String[] args) {
        System.out.println(maze(3,3,0));
    }

    static int maze(int r , int c, int count){
        if(r == 1 || c == 1){
            return 1;
        }
       int left =  maze(r-1, c, count);
        int right = maze(r, c-1,count);

        return left + right;
    }
}
