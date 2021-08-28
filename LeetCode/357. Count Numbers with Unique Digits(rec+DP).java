class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
    //     O(1) Solution::::: --------------------------------
    // if(n==0)
    // {
    //     return 1;
    // }
    // else if(n==1)
    // {
    //     return 10;
    // }
    // else if(n==2)
    // {
    //     return 91;
    // }
    //     int m=2;
    //     int sum=81;
    //     int k=8;
    //     int prev=91;
    //     while(m<n)
    //     {
    //         sum=sum*k;
    //         k--;
    //         m++;
    //         prev+=sum;
    //     }
    //     return prev;
    //     ----***--------------------------
        
        
    //------- O(1) solution --------------
        return find(n);
    }
    public static int find(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 10;
        }
        int res=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                res=res*9;
            }
            else
            {
                res=res*(11-i);
            }
        }
        return res+find(n-1);
    }
}
