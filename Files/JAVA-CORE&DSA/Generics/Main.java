public class Main{
	public static void main(String[]args)
	{
		Box<String> box1 = new Box<>("123");
		box1.container = "122";
		System.out.println(box1.getContainer());
		System.out.println(box1.getType());
	}
}