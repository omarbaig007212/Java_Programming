import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextInt();
        String pat=sc.nextInt();
        System.out.print(search(txt,pat));
    }
    public static int search(String t, String s) {
        // code here
        HashMap<Character,Integer> hp=new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            if (hp.containsKey(t.charAt(i))) {

                hp.put(t.charAt(i), hp.get(t.charAt(i)) + 1);
            } else {
                hp.put(t.charAt(i), 1);
            }
        }
        int count = hp.size();
        int i = 0;
        int j = 0;
        int c=0;
        int k=t.length();
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (hp.containsKey(ch)) {
                hp.put(ch, hp.get(ch) - 1);
                if (hp.get(ch) == 0) {
                    count--;
                }
            }
            if(j-i+1 == k) {
                if(count==0)
                {
                    c++;
                }
                if (hp.containsKey(s.charAt(i))) {
                    hp.put(s.charAt(i), hp.get(s.charAt(i)) + 1);
                    if (hp.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return c;
    }
}
