import java.io.*;

import java.util.*;

public class GetCommonElement2 {

  public static void main(String[] args) throws Exception {
	  Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];

    for(int i=0; i<n1; i++){
        arr1[i]=sc.nextInt();
    }

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];

    for(int i=0; i<n2; i++){
        arr2[i]=sc.nextInt();
    }

    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i=0; i<n1; i++){
      int x = arr1[i];
      if(hm.containsKey(x)){
        int freq = hm.get(x);
        hm.put(x,freq+1);
      }
      else{
        hm.put(x,1);
      }
    }

    for(int i=0; i<n2; i++){
      if(hm.containsKey(arr2[i]) && hm.get(arr2[i])>0){
        System.out.println(arr2[i]);
        int freq = hm.get(arr2[i]);
        hm.put(arr2[i],freq-1);
      }
    }
  }

}
