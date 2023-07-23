import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
	public static void main(String[] args) {
		// Without Stream
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(23);
		list1.add(11);
		list1.add(44);
		list1.add(15);
		list1.add(99);
		list1.add(100);	
		// // Only Store Even - Without Stream
		// List<Integer> list2=new ArrayList<>();
		// for(Integer x:list1)
		// {
		// 	if(x%2==0)
		// 	{
		// 		list2.add(x);
		// 	}
		// }
		// System.out.println(list2);


		//With Stream 
		// Stream<Integer> stream= list1.stream();
		// List<Integer> res = stream.filter(x->x%2==0).collect(Collectors.toList());
		// System.out.println(res);
		
	}
}