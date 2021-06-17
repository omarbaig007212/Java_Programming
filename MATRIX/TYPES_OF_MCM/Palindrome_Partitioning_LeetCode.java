class Solution {
    public int minCut(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        for(int g=0;g<s.length();g++)
        {
            int i=0;int en=g;
            while(en<s.length())
            {
                if(g==0)
                    dp[i][en]=true;
                else if(g==1)
                {
                    if(s.charAt(i)==s.charAt(en))
                    {
                        dp[i][en]=true;
                    }
                    else
                    {
                        dp[i][en]=false;
                    }
                }
                else
                {
                    if(s.charAt(i)==s.charAt(en))
                    {
                        dp[i][en]=dp[i+1][en-1];
                    }
                    else
                    {
                        dp[i][en]=false;
                    }
                }
                en++;
                i++;
            }
        }
        int t[]=new int[s.length()];
        t[0]=0;
        for(int j=1;j<s.length();j++)
        {
            if(dp[0][j]==true)
            {
                t[j]=0;
            }
            else
            {
                int min=Integer.MAX_VALUE;
                for(int i=j;i>=1;i--)
                {
                    if(dp[i][j]==true)
                    {
                        if(min>t[i-1])
                        {
                            min=t[i-1];
                        }
                    }
                }
                t[j]=min+1;
            }
        }
        return t[s.length()-1];
    }
}
