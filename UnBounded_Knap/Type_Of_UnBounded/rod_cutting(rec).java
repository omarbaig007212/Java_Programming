// { Driver Code Starts
import java.util.Scanner;
class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        if(n<=0)
        {
            return 0;
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,price[i]+cutRod(price,n-i-1));
        }
        return ans;
    }
}
