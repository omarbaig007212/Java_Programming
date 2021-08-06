 public static void levelOrderLinewise(Node node){
    // write your code here
    Queue<Node> mainQ=new ArrayDeque<>();
    mainQ.add(node);
    mainQ.add(new Node(-1));
    while(mainQ.size()>0)
    {
        node=mainQ.remove();
        if(node.data!=-1)
        {
            System.out.print(node.data+" ");
            for(Node child:node.children)
            {
                mainQ.add(child);
            }
        }
        else
        {
            if(mainQ.size()>0)
            {
                mainQ.add(new Node(-1));
                System.out.println();
            }
        }
    }
}

//Step ------------------------------------------ 2222222222222  (Make a flag(-1) to know that this is till this level and then print "\n" when encountered;)

public static void levelOrderLinewise(Node node){
      Queue<Node> queue = new ArrayDeque<>();
      queue.add(node);

      Queue<Node> cqueue = new ArrayDeque<>();
      while(queue.size() > 0){
        node = queue.remove();
        System.out.print(node.data + " ");

        for(Node child: node.children){
          cqueue.add(child);
        }

        if(queue.size() == 0){
          queue = cqueue;
          cqueue = new ArrayDeque<>();
          System.out.println();
        }
      }
    }

//Step-------------------------------11111 (Normal mainQ and currQ where the data is stored in both and exchanged;)

 public static void levelOrderLinewise(Node node){
    // write your code here
    Queue<Node> mainQ=new ArrayDeque<>();
    mainQ.add(node);
    while(mainQ.size()>0)
    {
        int siz=mainQ.size();
        for(int i=0;i<siz;i++)
        {
            node=mainQ.remove();
            System.out.print(node.data+" ");
            for(Node child:node.children)
            {
                mainQ.add(child);
            }
        }
        System.out.println();
    }
  }
//step---------------------------------------- 333333333333333 (Make a counter vairable to store the number on each level and then iterate and store until the full iteration);


public static class Pair{
      Node node;
      int level;
      Pair(Node node,int level)
      {
          this.node=node;
          this.level=level;
      }
  }
  public static void levelOrderLinewise(Node node){
    // write your code here
    Queue<Pair> mainQ=new ArrayDeque<>();
    Pair p=new Pair(node,1);
    int level=1;
    mainQ.add(p);
    while(mainQ.size()>0)
    {
        p=mainQ.remove();
        if(level<p.level)
        {
            System.out.println();
            level=p.level;
        }
        System.out.print(p.node.data+" ");
        for(Node child:p.node.children)
        {
            Pair p1=new Pair(child,level+1);
            mainQ.add(p1);
        }
    }
  }

/// step ------------------------------------------------ 4 (create a Pair class which stores the Node and Level and increases the level+1 on each children);
