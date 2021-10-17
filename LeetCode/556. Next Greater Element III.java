class Solution {
    public int nextGreaterElement(int n) {
        int len=(int)Math.log10(n)+1;
        int arr[]=new int[len];
        int i=len-1;
        int prev=n;
        while(n!=0)
        {
            arr[i]=n%10;
            n=n/10;
            i--;
        }
        i=len-2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i==-1)
        {
            return -1;
        }
        int j=len-1;
        while(arr[j]<=arr[i])
        {
            j--;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        n=0;
        for(int k=0;k<=i;k++)
        {
            n=n*10+arr[k];
        }
        for(int k=len-1;k>i;k--)
        {
           n=n*10+arr[k];
        }
        if(n<prev)
        {
            return -1;
        }
        return n;
    }
}
