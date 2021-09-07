class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long max=Integer.MIN_VALUE;
        long sum=arr[0];
        for(int i=1;i<n;i++)
        {
            if(sum>max)
            {
                max=sum;
            }
            if((sum+arr[i])>=arr[i])
            {
                sum=sum+arr[i];
            }
            else
            {
                sum=arr[i];
            }
        }
        if(sum>max)
            {
                max=sum;
            }
        return max;
    }
    
}
