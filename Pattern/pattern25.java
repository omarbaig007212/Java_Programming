import java.util.*;

public class Main {

  public static void main(String[] args) {
    pattern(5);
  }

  public static void pattern(int n) {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      System.out.print("*");
      if(i==1||i==n)
      {
        for(int j=1;j<=n-2;j++)
        {
          System.out.print("*");
        }
      }
      else
      {
        for(int j=1;j<=n-2;j++)
        {
          System.out.print(" ");
        }
      }
      System.out.print("*");
      System.out.println();
    }
  }
}
