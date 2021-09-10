// This has repeated elements but N is N not changed so... same logic as the duplicate numbers one but after sorting iterate and add if arr[i]!=i+1;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        int N=arr.length;
        while(i<N)
        {
            int val=arr[i];
            if(arr[i]!=arr[val-1])
            {
                swap(arr,i,val-1);
            }
            else
            {
                i++;
            }
        }
        i=0;
        List<Integer> list=new ArrayList<>();
        while(i<N)
        {
            if(arr[i]!=i+1)
            {
                list.add(i+1);
            }
            i++;
        }
        return list;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
