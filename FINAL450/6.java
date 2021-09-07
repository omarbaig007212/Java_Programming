public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i=0,j=0;
        while(i<n)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i],1);
            }
            i++;
        }
        while(j<m)
        {
            if(!hm.containsKey(b[j]))
            {
                hm.put(b[j],1);
            }
            j++;
        }
        return hm.size();
    }
