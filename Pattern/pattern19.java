import java.util.*;

public class Main {

  public static void main(String[] args) {
    pattern(20);
  }

  public static void pattern(int n) {
    int curr=1;
    int space=2*n-2;
    for(int i=1;i<2*n;i++)
    {
      for(int j=1;j<=curr;j++)
      {
        System.out.print("*");
      }
      for(int j=1;j<=space;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=curr;j++)
      {
        System.out.print("*");
      }
      if(i<n)
      {
        space=space-2;
        curr++;
      }
      else
      {
        space=space+2;
        curr--;
      }
      System.out.println();
    }
  }
}
