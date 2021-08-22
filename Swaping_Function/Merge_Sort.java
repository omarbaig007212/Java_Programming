// Divide the array into 2 parts and then those 2 will sort using "mergeTwoArrays",will sort the two arrays and return a new array which will be a3 and returned;

public static int[] mergeSot(int arr[],int lo,int hi)
{
  if(lo==hi)
  {
    int a[]=new int[1];
    a[0]=arr[lo];
    return a;
  }
  int mid=(lo+hi)/2;
  int a1[]=mergeSort(arr,lo,mid);
  int a2[]=mergeSort(arr,mid+1,hi);
  int a3[]=mergeTwoArrays(a1,a2);
  return a3;
}
public static int[] mergeTwoArrays(int a1[],int a2[])
{
  int a3[]=new int[a1.lenght+a2.length];
  int i=0;
  int j=0;
  int k=0;
  while(i<a1.lenght && j<a2.length)
  {
    if(a1[i]<a2[j])
    {
      a3[k]=a1[i];
      i++;
      k++;
    }
    else if(a1[i]>a2[j])
    {
      a3[k]=a2[j];
      j++;
      k++;
    }
    else
    {
      a3[k]=a1[i];
      k++;
      a3[k]=a2[j];
      k++;
      i++;
      j++;
    }
  }
  while(i<a1.length)
  {
    a3[k]=a1[i];
    k++;
    i++;
  }
  while(j<a2.length)
  {
    a3[k]=a2[j];
    k++;
    j++;
  }
  return a3;
}
