import java.io.*;
import java.util.*;

public class Main {
  static int arr[][] = new int[21][11];

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < 21; i++)
    {
      for (int j = 0; j < 11; j++)
      {
        arr[i][j] = -1;
      }
    }
    int []wt = new int[n];
    int []val = new int[n];
    for (int i = 0; i < n; i++) {
      val[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      wt[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    int t[][]=new int[n+1][k+1];
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=k;j++)
        {
            if(i==0||j==0)
            {
                t[i][j]=0;
            }
        }
    }
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=k;j++)
        {
            if(wt[i-1]<=j)
            {
                t[i][j]=Math.max((val[i-1]+t[i-1][j-wt[i-1]]),(t[i-1][j]));
            }
            else
            {
                t[i][j]=t[i-1][j];
            }
        }
    }
    System.out.println(t[n][k]);
  }
}