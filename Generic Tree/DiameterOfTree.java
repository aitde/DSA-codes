import java.io.*;
import java.util.*;

public class DiameterOfTree {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  static int dia =-1;

  public static int height(Node node){

      int max = -1;
      int secmax = -1;

      for(int i=0; i<node.children.size(); i++){
        int val = height(node.children.get(i));

        if(val >= max){
          secmax = max;
          max = val;
        }
        else if(val > secmax){
          secmax = val;
        }
      }

      int myDia = max+secmax+2;
      dia = Math.max(dia, myDia);

      return max+1;

  }  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    height(root);
    System.out.println(dia);
  }

}
