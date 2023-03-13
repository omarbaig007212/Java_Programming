import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf){
        // write ur code here
      
        // When all index are travelled it will go back with the fixed array size of fsf
        // Then on the way back ff will store index of the positing and res[] will store if res[j]==0
        // Only if ff!=-1
        if(idx==arr.length)
        {
            return new int[fsf];
        }
        int ff=-1;
        if(arr[idx]==x)
        {
            ff=idx;
            fsf++;
        }
        int res[]=allIndices(arr,x,idx+1,fsf);
        int j=res.length-1;
        while(j>=0 && res[j]!=0)
        {
            j--;
        }
        if(ff!=-1 && j!=-1)
        {
            res[j]=ff;
        }
        return res;
    }

}
