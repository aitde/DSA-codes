
import java.util.*;

public class mergeSort
{
	public static void main(String[] args) {
		int[] arr = {5,243,465,0,2,8,-1};
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] mergeSort(int[] arr){
	    if(arr.length == 0){
	        return arr;
	    }
	    if(arr.length==1){
	        return arr;
	    }
	    
	    int mid = arr.length/2;
	    
	    int[] firstHalf = mergeSort(Arrays.copyOfRange(arr, 0, mid));
	    int[] secondHalf = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
	    
	    return mergeSorted(firstHalf, secondHalf);
	}
	public static int[] mergeSorted(int[] a, int[] b){
	    int[] ans = new int[a.length+b.length];
	    
	    int i=0, j=0, k=0;
	    
	    while(i<a.length && j<b.length){
	        if(a[i]<b[j]){
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
}
