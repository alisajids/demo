package demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatIntegerList {

	public static void concatIntegerList() {
		//Concate Two list by sorting and distinct (Integer)
				List<Integer> list1 = List.of(1,3,2,4,6);
				List<Integer> list2 = List.of(2,3,7,8,9);
				
				List<Integer> list3 = Stream.concat(list1.stream(), list2.stream())
						.distinct()
						.sorted()
						.collect(Collectors.toList());
				System.out.println(list3);
	}
}
