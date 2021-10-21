import java.util.*;
public class Main{
  public static void main(String[]args)
  {
    pattern(10);
  }
  public static void pattern(int n)
  {
    int count=n-1;
    int flag=-1;
    for(int i=1;i<=2*n;i++)
    {
      if(i<=n)
      {
        for(int j=1;j<=count;j++)
      {
        System.out.print(" ");
      }
      count--;
      System.out.print("*");
      for(int j=1;j<=flag;j++)
      {
        System.out.print(" ");
      }
      if(i!=1 && i!=(2*n-1))
      {
        System.out.print("*");
      }
      flag=flag+2;
      System.out.println();
      }
      else if(i>n)
      {
        
        count++;
        for(int j=1;j<=count;j++)
      {
        System.out.print(" ");
      }
      System.out.print("*");
      flag=flag-2;
      for(int j=1;j<=flag;j++)
      {
        System.out.print(" ");
      }
      if(i!=1 && i!=(2*n))
      {
        System.out.print("*");
      }
      System.out.println();
      }
    }
  }
}
