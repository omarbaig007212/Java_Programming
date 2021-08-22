// In this the same as Bubble_sort but the sorted is INC from left to right..

public static void Selection_Sort(int arr[])
{
   int n=arr.length;
   for(int i=0;i<n-1;i++)
   {
       int mini=i;
       for(int j=i+1;j<n;j++)
       {
           if(isSmaller(arr,j,mini))
           {
               mini=j;
           }
       }
       swap(arr,i,mini);
   }
}
