import java.io.*;
import java.util.*;

public class PrintStairPath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }
        
        for(int j=1; j<=3; j++){
            if(n-j >= 0){
                printStairPaths(n-j, path+j);
            }
        }
    }

}
