import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int i=0,j=0,sum=0,Maxsum=Integer.MIN_VALUE;
        while(j<n)
        {
            if(sum>Maxsum)
            {
                Maxsum=sum;
            }
            if(j-i+1<k)
            {
                sum=sum+a[j];
                j++;
            }
            else
            {
                sum=sum-a[i];
                sum=sum+a[j];
                i++;
                j++;
            }
        }
        System.out.println(Maxsum);
    }
}
