package medRecusrion;

import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeWithObstacles("", 0, 0, maze);
    }
    static ArrayList<String> mazePath(String P, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
           list.addAll( mazePath(P + 'D', r-1, c));
        }
        if(c > 1){
            list.addAll(mazePath(P+'R', r, c-1));

        }
        return list;
    }

    static ArrayList<String> EveryPath(String P, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(EveryPath(P + 'V', r-1, c));
        }
        if(r > 1 && c > 1){
            list.addAll(EveryPath(P+'D', r-1, c - 1));
        }
        if(c > 1){
            list.addAll(EveryPath(P+'H', r, c-1));
        }
        return list;
    }


    static void  mazeWithObstacles(String P, int row, int col, boolean maze[][]){
        if(row == maze.length-1 && col == maze.length-1){
            System.out.println(P);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row < maze.length-1){
            mazeWithObstacles(P + 'D', row + 1, col, maze);
        }
        if(col < maze[0].length-1){
            mazeWithObstacles(P + 'R', row, col+1, maze);
        }
    }

}
