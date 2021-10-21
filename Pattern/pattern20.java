import java.util.*;

public class Main {

  public static void main(String[] args) {
    pattern(80);
  }

  public static void pattern(int n) {
    n=n-1;
    for(int i=1;i<=n+1;i++)
    {
      if(i==1||i==n+1)
      {
        for(int j=1;j<=n;j++)
        {
          System.out.print("*");
        }
      }
      else
      {
        System.out.print("*");
        for(int j=1;j<n-1;j++)
        {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
