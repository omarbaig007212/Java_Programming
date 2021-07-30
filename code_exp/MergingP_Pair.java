import java.io.*;
import java.util.*;

public class Main {
    public static class Pair implements Comparable<Pair>{
         int st;
         int et;
        public Pair(int st,int et)
        {
            this.st=st;
            this.et=et;
        }
        public int compareTo(Pair other)
        {
            if(this.st!=other.st)
                return this.st-other.st;
            else
                return this.et-other.et;
        }
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair p[]=new Pair[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            p[i]=new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(p);
        Stack<Pair> a=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                a.push(p[i]);
            }
            else
            {
                if(a.peek().et < p[i].st)
                {
                    a.push(p[i]);
                }
                else
                {
                    a.peek().et=Math.max(p[i].et,a.peek().et);
                }
            }
        }
        print(a);
    }
    public static void print(Stack<Pair> p)
    {
        if(p.size()==0)
        {
            return;
        }
        Pair t=p.pop();
        print(p);
        System.out.println(t.st+" "+t.et);
    }

}
