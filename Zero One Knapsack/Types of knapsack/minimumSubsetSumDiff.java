import java.util.*;

import jdk.javadoc.internal.doclets.formats.html.SystemPropertiesWriter;
public class minimumSubsetSumDiff {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int wt[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
            sum+=wt[i];
        }
        ArrayList<Integer> arr=SubsetSum(wt, sum);
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++)
        {
            mn=Math.min(mn,Math.abs(sum-2*arr.get(i)));
        }
        System.out.println(mn);
    }
    public static ArrayList<Integer> SubsetSum(int[]wt,int k){
        int n=wt.length;
        boolean t[][]=new boolean[n+1][k+1];
        for(int i=0;i<k+1;i++)
            t[0][i]=false;
        for(int i=0;i<n+1;i++)
            t[i][0]=true;
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<k+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    t[i][j]=t[i-1][j]||t[i-1][j-wt[i-1]];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=n;i<n+1;i++)
        {
            for(int j=0;j<k+1;j++)
            {
                if(t[i][j])
                {
                    arr.add(j);
                }
            }
        }
        return arr;
    }
}
