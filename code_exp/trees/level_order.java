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
//Step-------------------------------11111


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


//Step ------------------------------------------ 2222222222222
