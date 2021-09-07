static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        pair p=new pair(Integer.MAX_VALUE,Integer.MIN_VALUE);
        for(int i=0;i<n;i++)
        {
            if(a[i]<p.first)
            {
                p.first=a[i];
            }
            if(a[i]>p.second)
            {
                p.second=a[i];
            }
        }
        return p;
    }
