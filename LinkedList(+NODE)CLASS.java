import java.util.*;

public class Main{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public int size()
        {
            return this.size;
        }
        public void addLast(int val)
        {
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0)
            {
                head=tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public void addFirst(int val)
        {
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0)
            {
                head=tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;
            }
            size++;
        }
        public int removeFirst()
        {
            if(size==0)
            {
                return -1;
            }
            int data=head.data;
            head=head.next;
            return data;
        }
        public int removeLast()
        {
            if(size==0)
            {
                return -1;
            }
            Node parser=this.head;
            while(parser!=tail)
            {
                parser=parser.next;
            }
            int data=tail.data;
            parser.next=null;
            tail=parser;
            return data;
        }
        public void display()
        {
            if(this.size()==0)
            {
                System.out.println("Empty");
            }
            else
            {
                Node n=head;
                while(n!=null)
                {
                    System.out.print(n.data+" ");
                    n=n.next;
                }
                System.out.println();
            }
        }
        public int merger(Node l1,Node l2,int p1,int p2,LinkedList res)
        {
            if(l1==null && l2==null)
            {
                return 0;
            }
            int data=0;
            int carry=0;
            if(p1>p2)
            {
                carry=merger(l1.next, l2, p1-1, p2,res);
                data=l1.data+carry;
            }
            else if(p1<p2)
            {
                carry=merger(l1, l2.next, p1, p2-1,res);
                data=l2.data+carry;
            }
            else
            {
                carry=merger(l1.next, l2.next, p1-1, p2-1,res);
                data=l1.data+l2.data+carry;
            }
            int sum=data%10;
            res.addFirst(sum);            
            return data/10;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();
        while(n>0)
        {
            l1.addLast(sc.nextInt());
            n--;
        }
        while(m>0)
        {
            l2.addLast(sc.nextInt());
            m--;
        }
        LinkedList res=new LinkedList();
        int c=res.merger(l1.head,l2.head,l1.size(),l2.size(),res);
        if(c>0)
        {
            res.addFirst(c);
        }
        res.display();
    }
}
