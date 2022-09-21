import java.io.*;
import java.util.*;

public class IsCyclic {
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

   static class Pair{
      int v;

      Pair(int v){
         this.v=v;
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

      boolean[] visited = new boolean[vtces];
      boolean ans = false;

      for(int v=0; v<vtces; v++){
         if(visited[v]==false){
            ans = ans || isCyclic(graph, v, visited);
         }
      }
      System.out.println(ans);
   }

   public static boolean isCyclic(ArrayList<Edge>[] graph, int src, boolean[] visited){
      Queue<Pair> que = new LinkedList<>();
      que.add(new Pair(src));

      while(que.size()>0){
         Pair rem=que.remove();

         if(visited[rem.v]==true){
            return true;
         }

         visited[rem.v]=true;

         for(Edge e:graph[rem.v]){
            if(visited[e.nbr]==false){
               que.add(new Pair(e.nbr));
            }
         }
      }
      return false;
   }
}
