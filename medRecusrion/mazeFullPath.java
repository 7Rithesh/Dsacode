package medRecusrion;

import java.util.Arrays;

public class mazeFullPath {
    public static void main(String[] args) {
        boolean maze[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int [][] path = new int[maze.length][maze[0].length];
        mazeFullPath("", 0, 0, path, maze, 1);
    }

    static void mazeFullPath(String P, int r, int c, int[][] path,boolean[][] maze, int step){
        if(r == maze.length-1 && c == maze.length-1){
            for( int[] arr : path){
                path[r][c] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(P);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){
            mazeFullPath(P + 'D', r + 1, c, path,maze, step+1);
        }
        if (c < maze[0].length - 1) {
            mazeFullPath(P+'R', r, c+1, path,maze, step+1);
        }
        if(r > 0){
            mazeFullPath(P+'U', r -1 , c,  path,maze, step+1);
        }
        if(c > 0){
            mazeFullPath(P+'L', r, c -1,  path,maze, step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
