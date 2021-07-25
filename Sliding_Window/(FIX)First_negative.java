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
        int i=0,j=0 ;
        ArrayList<Integer> ar=new ArrayList<>();
        while(j<n)
        {
            if(a[j]<0)
            {
                ar.add(a[j]);
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                if(ar.size()>0)
                {
                    System.out.print(ar.get(0)+" ");
                    if(ar.get(0)==a[i])
                    {
                        ar.remove(0);
                    }
                }
                else if(ar.isEmpty())
                {
                    System.out.print("0 ");
                }
                j++;
                i++;
            }
            
        }

        
    }
}
