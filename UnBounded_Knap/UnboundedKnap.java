import java.util.*;
public class UnboundedKnap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int wt[]=new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
        }
        int val[]=new int[n];
        for(int i=0;i<n;i++)
        {
            val[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        System.out.println(UKnap(wt,val,sum));
    }
    public static int UKnap(int wt[],int val[],int sum)
    {
        int n=wt.length;
        int t[][]=new int[n+1][sum+1];
        for(int i=0;i<sum+1;i++)
            t[0][i]=0;
        for(int i=0;i<n+1;i++)
            t[i][0]=1;
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    t[i][j]=Math.max(t[i][j-wt[i-1]],t[i-1][j]);
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
