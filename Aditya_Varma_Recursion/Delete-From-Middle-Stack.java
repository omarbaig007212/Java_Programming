//https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1


public void deleteMid(Stack<Integer>s,int size){
        // code here
        int k=size/2+1;
        solve(s,k);
    } 
    public static void solve(Stack<Integer> s,int k)
    {
        if(k==1)
        {
            s.pop();
            return;
        }
        int temp=s.pop();
        solve(s,k-1);
        s.push(temp);
    }
