import java.util.*;

public class Rod_cutting{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int length[]=new int[n];
        int price[]=new int[n];
        for(int i=0;i<n;i++)
            length[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            price[i]=sc.nextInt();
        int L=sc.nextInt();
        System.out.println(func(length,price,L));
    }
    public static int func(int[] length,int[] price,int L)
    {
        int n=length.length;
        int t[][]=new int[n+1][L+1];
        for(int i=0;i<L+1;i++)
            t[0][i]=0;
        for(int i=0;i<n+1;i++)
            t[i][0]=0;
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<L+1;j++)
            {
                if(length[i-1]<=j)
                    t[i][j]=Math.max((price[i-1]+t[i][j-length[i-1]]),(t[i-1][j]));
                else
                    t[i][j]=t[i-1][j];
            }
        }   
        return t[n][L];
    }
}
