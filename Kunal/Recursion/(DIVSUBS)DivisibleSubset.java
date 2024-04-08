//https://www.codechef.com/problems/DIVSUBS

public class DivisibleSubset{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    while(T>0)
      {
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
          arr[i]=sc.nextInt();
        }
        long sum=0;
        Map<Long,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++)
        {
          sum+=arr[i];
          long val=sum%N;
          if(val==0)
          {
            System.out.println(i+1);
            for(int k=0;k<i;k++)
            {
              System.out.print(arr[k]+" ");
            }
            break;
          }
          else
          {
            if(hm.get(val)!=null)
            {
              int count=0;
              int v=hm.get(val);
              for(int k=v+1;k<=i;k++)
              {
                System.out.print((k+1)+" ");
              }
              break;
            }
            else
            {
              hm.put(val,i);
            }
          }
        }
        T--;
      }
  }
}
