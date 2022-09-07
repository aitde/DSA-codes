import java.io.*;
import java.util.*;

public class IsSymmetricTree {
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

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }

  public static boolean IsSymmetric(Node node) {
    
      Queue<Node> que = new LinkedList<>();
      que.add(node);

      while(que.size()!=0){
        int size = que.size();

        ArrayList<Node> arr = new ArrayList<>();
        for(int i=0; i<size; i++){
          arr.add(que.remove());
        }

        int left=0, right=arr.size()-1;

        while(left<right){
          if(arr.get(left).children.size() != arr.get(right).children.size()){
            return false;
          }
          left++;
          right--;
        }

        for(int i=0; i<arr.size(); i++){
          Node x = arr.get(i);
          for(int j=0; j<x.children.size(); j++){
            que.add(x.children.get(j));
          }
        }
      }
      return true;
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
    boolean sym = IsSymmetric(root);
    System.out.println(sym);
    // display(root);
  }

}
