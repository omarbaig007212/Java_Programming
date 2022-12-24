//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		solve(s);
		return s;
	}
	public static void solve(Stack<Integer> s)
	{
	    if(s.empty())
	    {
	        return;
	    }
	    int temp=s.pop();
	    solve(s);
	    sort(s,temp);
	}
	public static void sort(Stack<Integer> s,int temp)
	{
	    if(s.empty() || s.peek()<temp)
	    {
	        s.push(temp);
	        return;
	    }
	    int curr=s.pop();
	    sort(s,temp);
	    s.push(curr);
	}
}
