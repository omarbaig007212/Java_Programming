import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int j = 0; j < n; j++) {
      String line = br.readLine();
      for (int k = 0; k < n; k++) {
        arr[j][k] = line.charAt(k) - '0';
      }
    }
    findCelebrity(arr);
  }
  public static void findCelebrity(int[][] a) {
    Stack<Integer> c=new Stack<>();
    int c1=0;
    for(int j=0;j<a[0].length;j++)
    {
        boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            if(i!=j)
            {
                if(a[i][j]==0)
                {
                  //if the person i dosn't know j that means i is the potential celeb and so.. on.
                    c1=i;
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true)
        {
            c.push(c1);
            break;
        }
    }
    if(c.size()>0)
    {
         System.out.println(c.pop());
    }
    else
    {
        System.out.println("none");
    }
  }

}
