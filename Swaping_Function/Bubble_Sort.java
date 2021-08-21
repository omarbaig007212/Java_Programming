public void bubbleSort(int arr[])
{
  int size=arr.length;
  for(int i=0;i<size-1;i++)
  {
    for(int j=1;j<size-i;j++)
    {
      if(arr[j-1]>arr[j])
      {
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
      }
    }
  }
}
