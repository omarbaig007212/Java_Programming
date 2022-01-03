//  https://practice.geeksforgeeks.org/problems/gray-code-1611215248/1/

// Using recursion

public class Main{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(find(n));
  }
  public static ArrayList<String> find(int n)
  {
    if(n==1)
    {
      ArrayList<String> base=new ArrayList<>();
      base.add("0");
      base.add("1");
      return base;
    }
    ArrayList<String> curr=find(n-1);
    ArrayList<String> res=new ArrayList<>();
    for(int i=0;i<curr.size();i++)
    {
      String temp=curr.get(i);
      res.add("0"+temp);
    }
    for(int i=curr.size()-1;i>=0;i--)
    {
      String temp=curr.get(i);
      res.add("1"+temp);
    }
    return res;
  }
}
