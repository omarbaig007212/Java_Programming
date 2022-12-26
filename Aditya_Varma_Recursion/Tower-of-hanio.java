public class Main{
  public static int count;
  public static void main(String[]args)
  {
    count=0;
    int n=5;
    solve(n,1,3,2);
    System.out.println(count);
  }
  public static void solve(int n,int s,int d,int h)
  {
    if(n==1)
    {
      System.out.println("move disk "+n+" from pole "+s+" to pole "+d);
      return;
    }
    solve(n-1,s,h,d);
    System.out.println("move disk "+n+" from pole "+s+" to pole "+d);
    solve(n-1,h,d,s);
  }
}
