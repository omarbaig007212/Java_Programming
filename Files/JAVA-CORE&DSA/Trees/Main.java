public class Main{
	public static void main(String[]args)
	{
		BinarySearchTree bt = new BinarySearchTree();
		int arr[]={5,2,7,1,4,6,9,8,3,10}; // True
		// int arr[]={1,2,3,4,5,6,7,8,9,10}; // False
		bt.publicate(arr);
		// bt.publicateSort(arr);
		bt.display();
		bt.displayLevelOrder();
		// System.out.println(" Is the tree balanced : ? "+bt.balanced());
	}
}