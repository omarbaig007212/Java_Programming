import java.util.*;
public class CountOfSubSet {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int wt[]=new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        int k=Count(wt,sum);
        System.out.println(k);
    }
    public static int Count(int arr[],int sum)
    {
        int n=arr.length;
        int t[][]=new int[n+1][sum+1];
        for(int i=0;i<=sum;i++)
            t[0][i]=0;
        for(int i=0;i<=n;i++)
            t[i][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    
}
