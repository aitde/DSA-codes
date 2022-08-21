import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
    int size = max-min+1;
    int[] freq = new int[size];

    for(int i=0; i<arr.length; i++){
      int idx = arr[i]-min;
      freq[idx] += 1;
    }

    int sum=0;
    int[] prefix = new int[size];

    for(int i=0; i<size; i++){
      sum += freq[i];
      prefix[i] = sum;
      
    }

    int[] ans = new int[arr.length];

    for(int i=arr.length-1; i>=0; i--){
      int val = arr[i];
      int idx = val-min;
      int ele = prefix[idx]-1;
      ans[ele] = val;
      prefix[idx] -= 1;
    }

    for(int i=0; i<arr.length; i++){
      arr[i] = ans[i];
    }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}
