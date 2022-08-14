import java.io.*;
import java.util.*;

public class FloodFill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited =new boolean[n][m];
        floodfill(arr, visited, 0, 0, "");
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, boolean[][] visited, int sr, int sc, String asf) {
        int dr=maze.length;
        int dc=maze[0].length;

        if(sr==dr-1 && sc==dc-1){
            System.out.println(asf);
            return;
        }

        if(sr<0 || sc<0 || sr==dr || sc==dc || visited[sr][sc]==true || maze[sr][sc]==1){
            return;
        }

        visited[sr][sc]=true;

        floodfill(maze,visited,sr-1,sc,asf+'t');
        floodfill(maze,visited,sr,sc-1,asf+'l');
        floodfill(maze,visited,sr+1,sc,asf+'d');
        floodfill(maze,visited,sr,sc+1,asf+'r');

        visited[sr][sc]=false;
        
    }
}
