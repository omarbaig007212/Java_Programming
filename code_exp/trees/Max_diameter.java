import java.io.*;
import java.util.*;

public class Main {
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
  static int diamax;
  public static int dia(Node node)
  {
    int dch=-1;
    int sdch=-1;
    for(Node child:node.children)
    {
      int curr=dia(child);
      if(curr>dch)
      {
        sdch=dch;
        dch=curr;
      }
      else if(curr>sdch)
      {
        sdch=curr;
      }
    }
    int tempDia=dch+sdch+2;
    if(tempDia>=diamax)
    {
      diamax=tempDia;
    }
    dch+=1;
    return dch;
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
    diamax=Integer.MIN_VALUE;
    dia(root);
    System.out.println(diamax);
    // write your code here
  }

}
