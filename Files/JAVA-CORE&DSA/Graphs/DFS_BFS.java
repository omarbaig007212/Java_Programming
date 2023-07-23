import java.util.*;

public class DFS_BFS{
	static class Graph{
		private ArrayList<Integer> adj[];
		private int nodes;

		Graph(int nodes)
		{
			this.nodes = nodes;
			adj = new ArrayList[nodes];
			for(int i=0;i<nodes;i++)
			{
				adj[i] = new ArrayList<>();
			}
		}

		public void addEdge(int node,int neighbour)
		{
			adj[node].add(neighbour);
		}

		// // ITERATIVE
		// public void DFS(int node,boolean[] visited){
		// 	Stack<Integer> st=new Stack<>();
		// 	st.push(node);
		// 	visited[node] = true;
		// 	while(st.size()!=0)
		// 	{
		// 		node = st.pop();
		// 		System.out.println(node);
		// 		ArrayList<Integer> temp = adj[node];
		// 		for(int i=0;i<temp.size();i++)
		// 		{
		// 			// System.out.println("--- "+visited[temp.get(i)]);
		// 			if(!visited[temp.get(i)])
		// 			{
		// 				visited[temp.get(i)]=true;
		// 				st.push(temp.get(i));
		// 			}
		// 		}
		// 	}
		// }


		//// RECURSIVE
		// private void DFS(int node,boolean[] visited){
		// 	System.out.println(node);
		// 	visited[node] = true;
		// 	for(int temp:adj[node])
		// 	{
		// 		if(!visited[temp])
		// 		{
		// 			DFS(temp,visited);
		// 		}
		// 	}
		// }

		// public void DFS(int node)
		// {
		// 	boolean [] visited = new boolean[nodes+1];
		// 	// DFS(node,visited);
		// }


		// public void BFS(int node)
		// {
		// 	boolean [] visited = new boolean[nodes+1];
		// 	BFS(node, visited);
		// }

		// private void BFS(int node,boolean[] visited)
		// {
		// 	Queue<Integer> q = new LinkedList<>();
		// 	q.add(node);
		// 	visited[node]=true;
		// 	while(q.size()!=0)
		// 	{
		// 		int temp=q.remove();
		// 		System.out.println(temp);
		// 		ArrayList<Integer> tempNode = adj[temp];
		// 		for(int i=0;i<tempNode.size();i++)
		// 		{
		// 			if(!visited[tempNode.get(i)])
		// 			{
		// 				q.add(tempNode.get(i));
		// 				visited[tempNode.get(i)]=true;
		// 			}
		// 		}
		// 	}

		//// --------------------------------------------------------------
		// Detect Cycle UnDirected
		// public boolean detectCycleUnDirected()
		// {
		// 	boolean[]visited = new boolean[nodes];
		// 	for(int i=0;i<visited.length;i++)
		// 	{
		// 		if(!visited[i])
		// 		{
		// 			if(detectCycleUnDirected(i,-1,visited))
		// 			{
		// 				return true;
		// 			}
		// 		}
		// 	}
		// 	return false;
		// }

		// private boolean detectCycleUnDirected(int start,int parent,boolean[] visited)
		// {
		// 	visited[start]=true;
		// 	for(int val:adj[start])
		// 	{
		// 		if(!visited[val])
		// 		{
		// 			if(detectCycleUnDirected(val,start,visited))
		// 			{
		// 				return true;
		// 			}
		// 		}
		// 		else if(val!=parent)
		// 		{
		// 			return true;
		// 		}
		// 	}
		// 	return false;
		// }


		// // --------------------------------------------------------------
		// // Detect Cycle Directed
		// public boolean detectCycleDirected()
		// {
		// 	boolean visited[]=new boolean[nodes];
		// 	for(int i=0;i<visited.length;i++)
		// 	{
		// 		if(!visited[i])
		// 		{
		// 			if(detectCycleDirected(i,visited,new boolean[nodes]))
		// 			{
		// 				return true;
		// 			}
		// 		}
		// 	}
		// 	return false;
		// }
		// private boolean detectCycleDirected(int node,boolean visited[],boolean ancestors[])
		// {
		// 	visited[node]=true;
		// 	ancestors[node]=true;
		// 	for(int neighbours:adj[node])
		// 	{
		// 		if(!visited[neighbours])
		// 		{
		// 			if(detectCycleDirected(neighbours,visited,ancestors))
		// 			{
		// 				return true;
		// 			}
		// 		}
		// 		else if(ancestors[neighbours])
		// 		{
		// 			return true;
		// 		}
		// 	}
		// 	ancestors[node]=false;
		// 	return false;
		// }

		//// Topological Sort
		// public static Stack<Integer> topoStack;

		// public void topologicalSort(int node)
		// {
		// 	topoStack = new Stack<Integer>();
		// 	boolean []visited = new boolean[nodes];
		// 	for(int i=0;i<visited.length;i++)
		// 	{
		// 		if(!visited[i])
		// 		{
		// 			topologicalSort(i,visited);
		// 		}
		// 	}
		// }

		// private void topologicalSort(int node,boolean[] visited)
		// {
		// 	visited[node]=true;
		// 	for(int temp:adj[node])
		// 	{
		// 		if(!visited[temp])
		// 		{
		// 			topologicalSort(temp,visited);
		// 		}
		// 	}
		// 	topoStack.push(node);
		// }

		// public void printStack()
		// {
		// 	while(topoStack.size()>0)
		// 	{
		// 		int node = topoStack.pop();
		// 		System.out.print(node);
		// 	}
		// }


		public int findMotherVertex(int V)
	    {	        
	        boolean[] visited = new boolean[V];
	        int last_node = -1;
	        for(int i=0;i<visited.length;i++)
	        {
	            if(!visited[i])
	            {
	                DFS(visited,adj,i);
	                last_node = i;
	            }
	        }
	        
	        visited=new boolean[V];
	        DFS(visited,adj,last_node);
	        for(int i=0;i<V;i++)
	        {
	            if(visited[i]==false)
	            {
	                return -1;
	            }
	        }
	        return last_node;
	    }
	    public void DFS(boolean []visited,ArrayList<ArrayList<Integer>>adj,int node)
	    {
	        if(visited[node])
	        {
	            return;
	        }
	        visited[node]=true;
	        for(int temp:adj[node])
	        {
	            if(!visited[temp])
	            {
	                DFS(visited,adj,temp);
	            }
	        }
	    }
	}
	public static void main(String[]args)
	{
		Graph g = new Graph(6);
        // g.addEdge(0, 1);
        // g.addEdge(0, 2);
        // g.addEdge(0, 3);
        // g.addEdge(2, 4);
        // g.addEdge(2, 0);
        g.addEdge(1,0);
        g.addEdge(1,3);
        g.addEdge(2,0);
        g.addEdge(3,5);
        g.addEdge(2,4);
        g.addEdge(4,5);
        g.topologicalSort(0);
        g.printStack();
	}
}
