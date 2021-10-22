import java.util.*;

public class Main {

  public static void main(String[] args) {
    pattern(4);
  }

  public static void pattern(int n) {
    int count=2*n-2;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      for(int j=1;j<=count;j++)
      {
        System.out.print(" ");
      }
      count=count-2;
      for(int j=i;j>=1;j--)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
