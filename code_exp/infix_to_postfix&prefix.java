import java.io.*;
import java.util.*;
public class Main{
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Stack<String> pre=new Stack<>();
    Stack<String> post=new Stack<>();
    Stack<Character> o=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
      char ch=s.charAt(i);
      if(ch=='(')
      {
        o.push(ch);
      }
      else if(Character.isAlphabetic(ch)||Character.isDigit(ch))
      {
        pre.push(ch+"");
        post.push(ch+"");
      }
      else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
      {
        while(o.size()>0 && o.peek()!='(' && precedence(ch)<=precedence(o.peek()))
        {
            String pre1=pre.pop();
            String pre2=pre.pop();
            char op=o.pop();
            pre.push(op+pre1+pre2);
            String post1=post.pop();
            String post2=post.pop();
            post.push(pre1+pre2+op);
          }
        o.push(ch);
      }
      else if(ch==')')
      {
        while(o.size()>0 && o.peek()!='(')
        {
          String pre1=pre.pop();
          String pre2=pre.pop();
          char op=o.pop();
          pre.push(op+pre1+pre2);
          String post1=post.pop();
          String post2=post.pop();
          post.push(pre1+pre2+op);
        }
        if(o.size()>0)
        {
          o.pop();
        }
      }
    }
    while(o.size()>0)
    {
      String pre1=pre.pop();
          String pre2=pre.pop();
          char op=o.pop();
          pre.push(op+pre1+pre2);
          String post1=post.pop();
          String post2=post.pop();
          post.push(pre1+pre2+op);
    }
    System.out.println(pre.pop()+"\n"+post.pop());
 }
 public static int precedence(char ch)
 {
   if(ch=='+'||ch=='-')
   {
     return 1;
   }
   else if(ch=='*'||ch=='/')
   {
     return 2;
   }
   else
   {
     return 2;
   }
 }
}
