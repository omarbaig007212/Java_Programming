import java.util.*;
public class Main{
  public static void main(String[]args)
  {
    pattern(14);
  }
  public static void pattern(int n)
  {
    int count=2*n-3;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(" ");
      }
      if(i==1)
      {
        for(int j=1;j<2*n;j++)
        {
          System.out.print("*");
        }
      }
      else
      {
        System.out.print("*");
        for(int j=1;j<=count;j++)
        {
          System.out.print(" ");
        }
        if(i!=n)
        {
          System.out.print("*");
        }
      }
      System.out.println();
      count=count-2;
    }
  }
}
