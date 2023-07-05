import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Program1_FindElementsStartsWithLetterA {

//	@Test
//	public void regular() 
//	{
//		List<String> names = new ArrayList<>();
//		names.add("Viji");
//		names.add("selva");
//		names.add("Amritha");
//		names.add("Rahul");
//		names.add("Chitra");
//		names.add("Manickam");
//		names.add("Vicky");
//		System.out.println(names);
//		int count = 0;
//		System.out.println(names.size());
//		for (String name : names) {
//			Find the name which starts with V
//			if (name.startsWith("V")) {
//				count++;
//			}
//
//		}
//		System.out.println(count);
//	}
	@Test
	public void streamFilter() {
		List<String> names = new ArrayList<>();
		names.add("Viji");
		names.add("selva");
		names.add("Amritha");
		names.add("Rahul");
		names.add("Chitra");
		names.add("Manickam");
		names.add("Vicky");
//		Parameters inside Filter [ left side will store the values in the list.
//		and will check each time whether it starts with A
		long count = names.stream().filter(s -> s.startsWith("V")).count();
		System.out.println(count);

		long a=Stream.of("Viji", "Vinayagar", "Ganesha").filter(s -> s.startsWith("V")).count();
		System.out.println(a);
		
		long b=Stream.of("Viji", "Vinayagar", "Ganesha").filter(s -> 
				{
					s.startsWith("G");
					return false;
				}).count();
				
		System.out.println(b);
		
		
	}

}
