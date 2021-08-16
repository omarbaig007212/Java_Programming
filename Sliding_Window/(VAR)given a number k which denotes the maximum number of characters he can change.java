import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    int start = 0;
    int end = 0;
    int maxFreq = 0;
    int maxLen = 0;
    HashMap<Character, Integer> hm = new HashMap<>();
    while (end < s.length()) {
      char ch = s.charAt(end);
      if (hm.containsKey(ch)) {
        hm.put(ch, hm.get(ch) + 1);
      } else {
        hm.put(ch, 1);
      }
      maxFreq = Math.max(maxFreq, hm.get(ch));
      if ((end - start + 1 - maxFreq) > k) {
        char c = s.charAt(start);
        hm.put(c, hm.get(c) - 1);
		      start++;
      }
      maxLen = Math.max(end - start + 1, maxLen);
      end++;
    }
    System.out.println(maxLen);
    // System.out.println(Arrays.asList(hm)); // method 1
  }
}
