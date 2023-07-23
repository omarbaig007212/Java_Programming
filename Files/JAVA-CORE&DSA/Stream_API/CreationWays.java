import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class CreationWays{
	public static void main(String[] args) {
		//Creation 1 -> Using empty()
		Stream stream = Stream.empty();
		stream.forEach(e->{
			System.out.println(e);
		});


		// Creation 2 -> Using of() from stream object.
		String[] str = {"Hello","World","New","."};
		Stream way2 = Stream.of(str);
		way2.forEach(e->{
			System.out.println(e);
		});


		// Creation 3 -> Using Builder().build()
		Stream way3 = Stream.builder().build();
		way3.forEach(e->{
			System.out.println(e);
		});


		// Creation 4 -> Using Arrays inbuild method
		IntStream way4 = Arrays.stream(new int[]{-2,-1,0,1,2});
		way4.forEach(e->{
			System.out.println(e);
		});


		// Creation 5 -> Using List/Set inbuild stream() method.
		List<Integer> list=new ArrayList<>();
		list.add(1);
		Stream way5 = list.stream();
		way5.forEach(e->{
			System.out.println(e);
		});
	}
}