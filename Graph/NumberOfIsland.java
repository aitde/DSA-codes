import java.io.*;
import java.util.*;

public class NumberOfIsland {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      boolean[][] visited = new boolean[m][n];
      int count = 0;
      for(int i=0; i<m; i++){
         for(int j=0; j<n; j++){
            if(arr[i][j]==0 && !visited[i][j]){
               traverse(arr, i, j, visited);
               count++;
            }
         }
      }
      System.out.println(count);
   }
   public static void traverse(int[][] arr, int i, int j, boolean[][] visited){

      visited[i][j] = true;

      if(i-1>=0 && arr[i-1][j]==0 && !visited[i-1][j])
         traverse(arr, i-1, j, visited);
      if(j-1>=0 && arr[i][j-1]==0 && !visited[i][j-1])
         traverse(arr, i, j-1, visited);
      if(i+1<arr.length && arr[i+1][j]==0 && !visited[i+1][j])
         traverse(arr, i+1, j, visited);
      if(j+1<arr[0].length && arr[i][j+1]==0 && !visited[i][j+1])
         traverse(arr, i, j+1, visited);
   }
}
