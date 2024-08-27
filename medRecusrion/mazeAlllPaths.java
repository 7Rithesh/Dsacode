package medRecusrion;

public class mazeAlllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        mazeAlllPaths("", 0, 0, maze);
    }
    static void mazeAlllPaths(String P, int r, int c, boolean[][] maze){
        if(r == maze.length -1&& c == maze[0].length-1){
            System.out.println(P);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length-1){
            mazeAlllPaths(P + 'D', r + 1, c, maze);
        }
        if (c < maze[0].length - 1) {
            mazeAlllPaths(P+'R', r, c+1,maze);
        }
        if(r > 0){
            mazeAlllPaths(P+'U', r -1 , c, maze);
        }
        if(c > 0){
            mazeAlllPaths(P+'L', r, c -1, maze);
        }
        maze[r][c] = true;
    }
}
