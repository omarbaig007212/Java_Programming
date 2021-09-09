//https://practice.geeksforgeeks.org/problems/rotation4723/1#
class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int ans=findPI(arr);
        if(ans==-1)
        {
            if(arr[0]>arr[n-1])
            {
                return n;
            }
            else
            {
                return 0;
            }
        }
        return ans+1;
    }
    public static int findPI(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid>0 && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(mid<arr.length-1 && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(arr[start]<=arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
