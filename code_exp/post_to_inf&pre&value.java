import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Stack<Integer> c=new Stack<>();
    Stack<Character> o=new Stack<>();
    Stack<String> inf=new Stack<>();
    Stack<String> pre=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
      char ch=s.charAt(i);
      // if(ch=='(')
      // {
      //   o.push(ch);
      // }
      if(Character.isDigit(ch))
      {
        c.push(ch-'0');
        inf.push(ch+"");
        pre.push(ch+"");
      }
      else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
      {
        int op2=c.pop();
        int op1=c.pop();
        c.push(solve(op1,op2,ch));
        String i1=inf.pop();
        String i2=inf.pop();
        inf.push("("+i2+""+ch+""+i1+")");
        String p1=pre.pop();
        String p2=pre.pop();
        pre.push(ch+p2+p1);
      }
      // else if(ch==')')
      // {
      //   while(o.size()>0 && o.peek()!='(')
      //   {
      //     int op2=c.pop();
      //     int op1=c.pop();
      //     c.push(solve(op1,op2,o.pop()));
      //   }
      //   if(o.size()>0)
      //     o.pop();
      // }
    }
    while(o.size()>0)
    {
      int op2=c.pop();
        int op1=c.pop();
        char op=o.pop();
        c.push(solve(op1,op2,op));
        String i1=inf.pop();
        String i2=inf.pop();
        inf.push("("+i2+""+op+""+i1+")");
        String p1=pre.pop();
        String p2=pre.pop();
        pre.push(op+p2+p1);
    }
    System.out.println(c.pop()+"\n"+inf.pop()+"\n"+pre.pop());
  }
  public static int solve(int op1,int op2,char ch)
  {
    if(ch=='+')
      return op1+op2;
    else if(ch=='-')
      return op1-op2;
    else if(ch=='*')
      return op1*op2;
    else
      return op1/op2;
  }
}
