import java.io.*;
import java.util.*;

public class MergeTwoSortedArray {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int[] ans = new int[a.length+b.length];

    int i=0, j=0, k=0;

    while(i<a.length && j<b.length){
      if(a[i] < b[j]){
        ans[k] = a[i];

        k++;
        i++;
      }
      else{
        ans[k] = b[j];
        j++;
        k++;
      }

    }

    while(i<a.length){
      ans[k] = a[i];
      k++;
      i++;
    }
    
    while(j<b.length){
      ans[k] = b[j];
      j++;
      k++;
    }
    return ans;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}
