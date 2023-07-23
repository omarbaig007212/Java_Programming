import java.util.stream.*;
import java.util.List;
public class FilterAndMap {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(42,1,10,5,0,-12);
		List<String> list2 = List.of("Hello","Hibernate","Angela","John","Hi");

		//Using Filter
		List<Integer> intList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(intList);

		List<String> strList = list2.stream().filter(str->str.startsWith("H")).collect(Collectors.toList());
		System.out.println(strList);


		//Using Map
		List<Integer> intMap = list1.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(intMap);

		List<String> strMap = list2.stream().map(str->str+"---").collect(Collectors.toList());
		System.out.println(strMap);


		//Using ForEach

		list1.stream().forEach(System.out::println);
		list2.stream().forEach(System.out::println);

		//Using Sorted Methods and (Min,Max)
		List<Integer> intSorted = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(intSorted);

		Integer max = list1.stream().max((val1,val2)->val1.compareTo(val2)).get();
		System.out.println(max);

		Integer min = list1.stream().min((val1,val2)->val1.compareTo(val2)).get();
		System.out.println(min);
	}
}