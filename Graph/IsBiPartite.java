import java.io.*;
import java.util.*;

public class IsBiPartite {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int[] color = new int[vtces];

      for(int i=0; i<vtces; i++){
         color[i] = -1;
      }

      for(int i=0; i<vtces; i++){
         if(color[i]==-1){
            boolean isBipart = isBipartite(graph, i, color);
            if(isBipart == false){
               System.out.println("false");
               return;
            }
         }
      }
      System.out.println("true");
   }
   public static boolean isBipartite(ArrayList<Edge>[] graph, int src, int[] color){
      Queue<Integer> que = new LinkedList<>();
      que.add(src);
      color[src]=1;

      while(que.size()>0){
         int rem = que.remove();
         int mycolor = color[rem];

         for(Edge e:graph[rem]){
            if(color[e.nbr]==-1){
               color[e.nbr] = 1-mycolor;
               que.add(e.nbr);
            }
            else{
               if(color[e.nbr]==mycolor)
               return false;
            }
         }
      }
      return true;
   }
}
