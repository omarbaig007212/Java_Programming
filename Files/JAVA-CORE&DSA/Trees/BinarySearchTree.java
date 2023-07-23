import java.util.*;

public class BinarySearchTree{
	private static class Node{
		private int value;
		private int height;
		private Node left;
		private Node right;
		public Node(int value)
		{
			this.value=value;
		}

		public int getValue()
		{
			return this.value;
		}
	}

	private Node root;

	public int height(Node node)
	{
		if(node == null)
		{
			return -1;
		}
		return node.height;
	}

	public void publicate(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			insert(nums[i]);
		}
	}

	public void publicateSort(int[] nums)
	{
		publicateSort(nums,0,nums.length-1);
	}

	private void publicateSort(int[] nums,int left,int right)
	{
		if(left>right)
		{
			return;
		}
		int mid=left+(right-left)/2;
		insert(nums[mid]);
		publicateSort(nums,left,mid-1);
		publicateSort(nums,mid+1,right);
	}

	public void insert(int value){
		root = insert(value,root);
	}

	private Node insert(int value,Node node)
	{
		if(node==null)
		{
			Node temp = new Node(value);
			return temp;
		}

		if(value>node.value)
		{
			node.right = insert(value,node.right);
		}

		else if(value<node.value)
		{
			node.left = insert(value,node.left);
		}

		node.height = Math.max(height(node.left),height(node.right))+1;

		return node;
	}

	public void display(){
		display(this.root,"Root Node. ");
	}

	public boolean balanced()
	{
		return balanced(root);
	}

	public boolean balanced(Node node)
	{
		if(node==null)
		{
			return true;
		}

		return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
	}

	private void display(Node node,String details)
	{
		if(node==null)
		{
			return;
		}
		System.out.println(details+" -> "+node.getValue());
		display(node.left,"Left node of node "+node.getValue());
		display(node.right,"Right node of node "+ node.getValue());
	}

	public void displayLevelOrder()
	{
		Queue<Node> st=new LinkedList<>();
		st.add(root);
		displayLevelOrder(st);
	}
	private void displayLevelOrder(Queue<Node> st)
	{
		while(st.size()>0)
		{
			Node node = st.remove();
			System.out.print(node.value+" ");

			if(node.left!=null)
			{
				st.add(node.left);
			}
			if(node.right!=null)
			{
				st.add(node.right);
			}
		}
	}
}