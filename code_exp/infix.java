import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Stack<Character> o = new Stack<>();
    Stack<Integer> c = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(') {
        o.push(ch);
      } else if (Character.isDigit(ch)) {
        c.push(ch-'0');
      } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        while (o.size() > 0 && o.peek() != '(' && precedence(ch) <= precedence(o.peek())) {
          int op2 = c.pop();
          int op1 = c.pop();
          c.push(solve(op1, op2, o.pop()));
        }
        o.push(ch);
      } else if (ch == ')') {
        while (o.size() > 0 && o.peek() != '(') {
          int op2 = c.pop();
          int op1 = c.pop();
          c.push(solve(op1, op2, o.pop()));
        }
        if (o.size() > 0) {
          o.pop();
        }
      }
    }
    while (o.size() > 0) {
      int op2 = c.pop();
      int op1 = c.pop();
      c.push(solve(op1, op2, o.pop()));
    }
    System.out.println(c.pop());
  }

  public static int precedence(char ch) {
    if (ch == '+' || ch == '-')
      return 1;
    else if (ch == '*' || ch == '/')
      return 2;
    else
      return 2;
  }

  public static int solve(int op1, int op2, char ch) {
    if (ch == '+')
      return op1 + op2;
    else if (ch == '-')
      return op1 - op2;
    else if (ch == '*')
      return op1 * op2;
    else
      return op1 / op2;
  }
}
