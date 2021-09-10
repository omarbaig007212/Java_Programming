// In this problem we are asked to find 1 number that's duplicate always . So given repeating we sort using repeating and then.. iterate and if arr[i]!=i+1{return arr[i]};


class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
        int N=arr.length;
        while(i<N)
        {
            int val=arr[i];
            if(val!=i+1 && arr[val-1]!=arr[i])
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
                return arr[i];
            }
            i++;
        }
        return -1;
    }
    public static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
