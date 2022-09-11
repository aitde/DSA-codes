import java.io.*;
import java.util.*;

public class KLargestElement {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      
      PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<n; i++){
			pq.add(arr[i]);
		}

		for(int i=0; i<n-k; i++){
			pq.remove();
		}
		
		for(int i=0; i<k; i++){
			int e = pq.remove();
			System.out.println(e);
		}
    }

}
