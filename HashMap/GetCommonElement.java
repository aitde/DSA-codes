import java.io.*;
import java.util.*;

public class GetCommonElement{

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
        hm.put(arr1[i],1);
    }

    for(int i=0; i<n2; i++){
        int ele = arr2[i];
        if(hm.containsKey(ele)){
            System.out.println(ele);
            hm.remove(ele);
        }
    }
    
 }

}
