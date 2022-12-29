//https://www.hackerrank.com/challenges/the-power-sum/problem?isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'powerSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER X
     *  2. INTEGER N
     */
     public static int res;
    public static int powerSum(int X, int N) {
    // Write your code here
      ArrayList<Integer> s=new ArrayList<>();
      solve(X,N,1,s);
      return res;
    }
    public static void solve(int x,int n,int j,ArrayList<Integer> curr)
    {
      if(x<0)
      {
        return;
      }
      if(x==0)
      {
        System.out.println(curr.toString());
        res++;
        return;
      }
      for(int i=j;i<=100;i++)
      {
        int del=(int)Math.pow(i,n);
        if(del<=x)
        {
          curr.add(i);
          solve(x-del, n, i+1,curr);
          curr.remove(curr.size()-1);
        }
      }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = Integer.parseInt(bufferedReader.readLine().trim());

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
