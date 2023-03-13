// Goal is to move n disks from t1 to t2 using t3 as helper.
// If we move (n-1) from t1 to t3(helper) then we will have only disk left.
// Move that one disk to final tower t2 
// Lastly, move all (n-1) from t3 to t2 using t1 as helper.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1id = sc.nextInt();
        int t2id = sc.nextInt();
        int t3id = sc.nextInt();
        toh(n,t1id,t2id,t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0)
        {
            return;
        }
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toh(n-1,t3id,t2id,t1id);
    }

}
