class Hamiltonian_Path 
{ 
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // Creating another array of arraylist to store the neighbours of each node.
        ArrayList<Integer>[] graph=new ArrayList[N];
        for(int i=0;i<N;i++)
        {
            graph[i]=new ArrayList<>();
        }
        // Storing the Node and it's neighbour given as an edge.
        for(int i=0;i<Edges.size();i++)
        {
            int first = Edges.get(i).get(0)-1;
            int second = Edges.get(i).get(1)-1;
            graph[first].add(second);
            graph[second].add(first);
        }
        // Creating a boolean array (visited).
        boolean[] visited=new boolean[N];
        
        // Calling DFS for each node to check.
        for(int i=0;i<N;i++)
        {
            if(dfs(graph,i,N,visited,0)) return true;
        }
        return false;
    }
    public boolean dfs(ArrayList<Integer>[] graph,int start,int toReach,boolean[] visited,int count)
    {
        // Pointer is at the node.
        visited[start]=true;
        // Counting.
        count++;
        if(count==toReach)
        {
            return true;
        }
        for(int x:graph[start])
        {
            if(!visited[x])
            {
                if(dfs(graph,x,toReach,visited,count)) return true;
            }
        }
        // From Start we didn't get any result thus going one step back.
        visited[start]=false;
        count--;
        return false;
    }
} 