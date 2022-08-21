import java.io.*;
import java.util.*;

public class Sort012 {

  public static void sort012(int[] arr){
    int left=0;
    int right=arr.length-1;

    for(int i=0; i<=right;){
      if(arr[i]==0){
        swap(arr, i, left);
        i++;
        left++;
      }
      else if(arr[i]==1){
        i++;
      }
      else{
        swap(arr, i, right);
        right--;
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }

}
