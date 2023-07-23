import java.util.*;

public class TreesDemo {

	private static class BinaryTree{
		int value;
		BinaryTree left;
		BinaryTree right;
		BinaryTree(int value)
		{
			this.value = value;
		}
	}

	private static BinaryTree root;

	public static void populate(){
		System.out.println("Enter the root node value : ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		root = new BinaryTree(value);
		populate(sc,root);
	}

	private static void populate(Scanner sc,BinaryTree node)
	{
		System.out.println(" Left ? for : "+node.value);
		boolean left = sc.nextBoolean();
		if(left)
		{
			System.out.println(" Enter left node value for -> "+node.value);
			int value = sc.nextInt();
			BinaryTree nodeLeft = new BinaryTree(value);
			node.left = nodeLeft;
			populate(sc,node.left);
		}
		System.out.println(" Right ? for : "+node.value);
		boolean right = sc.nextBoolean();
		if(right)
		{
			System.out.println(" Enter Right node value for -> "+node.value);
			int value = sc.nextInt();
			BinaryTree nodeRight = new BinaryTree(value);
			node.right = nodeRight;
			populate(sc,node.right);
		}
	}

	public static void main(String[]args){
		System.out.println("Starting");
		populate();		
	}
}