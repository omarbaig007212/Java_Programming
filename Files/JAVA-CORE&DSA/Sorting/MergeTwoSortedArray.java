import java.util.*;
public class MergeTwoSortedArray{
	public static int[] solve(int[]arr1,int[]arr2)
	{
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				arr3[k++]=arr1[i++];
			}
			else
			{
				arr3[k++]=arr2[j++];
			}
		}
		while(i<arr1.length)
		{
			arr3[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			arr3[k++]=arr2[j++];
		}
		return arr3;
	}
	public static void main(String[]args){
		int arr1[]=new int[]{3,4,5};
		int arr2[]=new int[]{1,2,6};
		int arr3[]=solve(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}
}