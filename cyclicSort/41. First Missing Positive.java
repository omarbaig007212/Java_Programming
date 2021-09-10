// The numbers should be >0 and <array.length , the number[i]!=number[i-1] , if these conditions staisfy then , swap(i,val-1). 
// If not then i++.
// Compare from i=0->N , if arr[i]!=i+1; then i+1 is the answer or index. 
// If not found and i==N then the index is N+1;

class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        int N=arr.length;
        while(i<N)
        {
            int val=arr[i];
            if(arr[i]>0 && arr[i]<N && arr[i]!=arr[val-1])
            {
                swap(arr,i,val-1);
            }
            else
            {
                i++;
            }
        }
        i=0;
        while(i<N)
        {
            if(arr[i]!=i+1)
            {
                return i+1;
            }
            i++;
        }
        return N+1;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
