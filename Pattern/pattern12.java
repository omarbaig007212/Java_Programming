import java.util.*;
public class Main{
  public static void main(String[]args)
  {
    pattern(5);
  }
  public static void pattern(int n)
  {
    for(int i=1;i<=2*n;i++)
    {
      if(i<=n)
      {
        int j=1;
        for(;j<i;j++)
        {
          System.out.print(" ");
        }
        for(;j<=n;j++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
      else{
        int j=1;
        for(;j<=2*n-i;j++)
        {
          System.out.print(" ");
        }
        for(;j<=n;j++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }
}
