import java.util.*;
public class Longest_Rep_Subseq{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    int m=s.length();
    int t[][]=new int[n+1][m+1];
    for(int i=0;i<m+1;i++)
      t[0][i]=0;
    for(int i=0;i<n+1;i++)
      t[i][0]=0;
    for(int i=1;i<n+1;i++)
      for(int j=1;j<m+1;j++)
        if(s.charAt(i-1)==s.charAt(j-1) && i!=j)
          t[i][j]=1+t[i-1][j-1];
        else
          t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
    System.out.println(t[n][m]);
  }
}
