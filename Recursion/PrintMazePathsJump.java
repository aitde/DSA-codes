import java.io.*;
import java.util.*;

public class PrintMazePathsJump {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        printMazePaths(0, 0, n-1, m-1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if((sr==dr)&&(sc==dc)){
            System.out.println(psf);
            return;
        }
        
        for(int h=1; h<=dc-sc; h++){
            printMazePaths(sr, sc+h, dr, dc, psf+"h"+h);
        }
        
        for(int v=1; v<=dr-sr; v++){
            printMazePaths(sr+v, sc, dr, dc, psf+"v"+v);
        }
        
        for(int d=1; d<=dc-sc && d<=dr-sr; d++){
            printMazePaths(sr+d, sc+d, dr, dc, psf+"d"+d);
        }
    }

}
