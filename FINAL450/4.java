public static void sort012(int a[], int n)
    {
        // code here 
        int i=0;
        int j=0;
        int k=a.length-1;
        while(j<=k)
        {
            if(a[j]==0)
            {
                swap(a,i,j);
                i++;
                j++;
            }
            else if(a[j]==1)
            {
                j++;
            }
            else if(a[j]==2)
            {
                swap(a,j,k);
                k--;
            }
        }
    }
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
