//https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/hashmap-official/ojquestion pepcoding Write HashMap


import java.io.*;
import java.util.*;

public class Main {

  public static class HashMap<K, V> {
    private class HMNode {
      K key;
      V value;

      HMNode(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList<HMNode>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

    public int hashFunc(K key)
    {
      int c=key.hashCode();
      return Math.abs(c)%buckets.length;
    }
    public void reHash() throws Exception
    {
      LinkedList<HMNode>[] obj=buckets;
      size=0;
      initbuckets(obj.length*2);
      for(int i=0;i<obj.length;i++)
      {
        for(HMNode node:obj[i])
        {
          put(node.key, node.value);
        }
      }
    }
    public int getIndexValue(K key,int bi)
    {
      int di=0;
      for(HMNode node:buckets[bi])
      {
        if(node.key.equals(key))
        {
          return di;
        }
        di++;
      }
      return -1;
    }
    public void put(K key, V value) throws Exception {
      // write your code here
      int bi=hashFunc(key);
      int ibi=getIndexValue(key, bi);
      if(ibi==-1)
      {
        HMNode node=new HMNode(key, value);
        buckets[bi].add(node);
        size++;
      }
      else
      {
        buckets[bi].get(ibi).value=value;
      }
      double lamda=(1.0*size)/buckets.length;
      if(lamda>2.0)
      {
        reHash();
      }
    }

    public V get(K key) throws Exception {
      // write your code here
      int bi=hashFunc(key);
      int ibi=getIndexValue(key, bi);
      if(ibi==-1)
      {
        return null;
      }
      else
      {
        return buckets[bi].get(ibi).value;
      }
    }

    public boolean containsKey(K key) {
      // write your code here
      int bi=hashFunc(key);
      int ibi=getIndexValue(key, bi);
      if(ibi==-1)
      {
        return false;
      }
      else
      {
        return true;
      }
    }

    public V remove(K key) throws Exception {
      // write your code here
      int bi=hashFunc(key);
      int ibi=getIndexValue(key, bi);
      if(ibi==-1)
      {
        return null;
      }
      else
      {
        V value=buckets[bi].get(ibi).value;
        buckets[bi].remove(ibi);
        size--;
        return value;
      }
    }

    public ArrayList<K> keyset() throws Exception {
      // write your code here
      ArrayList<K> res=new ArrayList<>();
      for(int i=0;i<buckets.length;i++)
      {
        for(HMNode node:buckets[i])
        {
          res.add(node.key);
        }
      }
      return res;
    }

    public int size() {
      // write your code here
      return size;
    }

   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMNode node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}
