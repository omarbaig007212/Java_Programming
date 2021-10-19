import java.util.*;
public class Main{
  public static void main(String[]args)
  {
    pattern(20);
  }
  public static void pattern(int n)
  {
    int count=0;
    for(int i=1;i<=n;i++)
    {
      int j=1;
      for(;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      if(i==n)
      {
        for(j=1;j<2*n;j++)
      {
        System.out.print("*");
      }
      break;
      }
      System.out.print("*");
      for(j=1;j<count;j++)
      {
        System.out.print(" ");
      }
      count=count+2;
      if(i>1)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
