public class Main {
	public static void main(String[]args)
	{
		CustomHashmap<Integer,String> hm=new CustomHashmap();
		hm.put(1, "a");
		hm.put(6, "riddhi");
		hm.put(5, "absxd");
		hm.put(3, "abc");
		hm.put(5, "riddd");
		hm.remove(3);
 
		System.out.println(hm.get(5));
		System.out.println(hm.get(1));
		System.out.println(hm.get(6));
		System.out.println(hm.get(3));
		System.out.println(hm.get(7));
	}
}