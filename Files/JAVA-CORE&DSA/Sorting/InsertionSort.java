import java.util.*;

public class InsertionSort {
	public static void main(String[]args){
		int arr[]=new int[]{5,2,3,4,1};
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int val = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>val)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
		System.out.println(Arrays.toString(arr));
	}
}