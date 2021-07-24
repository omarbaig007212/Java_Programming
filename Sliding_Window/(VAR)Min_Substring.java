import java.util.*;
public class MinSlidingWi {
    public static void main(String[] args) {
        HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
        int m = Integer.MAX_VALUE;
        int count = 0;
        String s2 = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int i = 0; i < t.length(); i++) {
            if (hp.containsKey(t.charAt(i))) {

                hp.put(t.charAt(i), hp.get(t.charAt(i)) + 1);
            } else {
                hp.put(t.charAt(i), 1);
            }
        }
        count = hp.size();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (hp.containsKey(ch)) {
                hp.put(ch, hp.get(ch) - 1);
                if (hp.get(ch) == 0) {
                    count--;
                }
            }
            while (count == 0 && i <= j) {
                if (m > j - i + 1) {
                    m=j - i + 1;
                    s2 = s.substring(i, j + 1);
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
        System.out.println(s2);
    }
}
