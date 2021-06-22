import java.util.*;
public class Egg_Droping_Recursive {
    public static void main(String[]args)
    {
        System.out.println(solve(2,6));
   }
    public static int solve(int e,int f)
    {
        if(f==0||f==1)
            return f;
        if(e==1)
            return f;
        int mn=Integer.MAX_VALUE;
        for(int k=1;k<=f;k++)
        {
            int temp=1+Math.max(solve(e-1,k-1),solve(e,f-k));
        // System.out.println(e+" : "+f+" : "+k+": temp: "+temp);
            if(mn>temp)
            {
                mn=temp;
            }
        }
        return mn;
    }
}
