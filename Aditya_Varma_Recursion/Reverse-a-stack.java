import java.util.Stack;

public class Solution {
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		solve(stack);
	}
    public static void solve(Stack<Integer> s)
    {
        if(s.size()==1)
        {
            return;
        }
        int temp=s.pop();
        solve(s);
        insert(s,temp);
    }
    public static void insert(Stack<Integer> s,int temp)
    {
        if(s.size()==0)
        {
            s.push(temp);
            return;
        }
        int curr=s.pop();
        insert(s,temp);
        s.push(curr);
    }

}
