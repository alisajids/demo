package demo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Examples {

	public static void main(String args[]) {
		
		List<String> slist = List.of("sajid","sam");
		//Convert List to Map
		Map<Integer, String> smap = slist.stream().collect(Collectors.toMap(s->slist.indexOf(s)+1, s->s));
				
		smap.entrySet().stream().
				forEach(entry->System.out.println("Key::"+entry.getKey()+"  value::"+ entry.getValue()));
				
				
				
		List<Integer> list = List.of(10,2,3,2,1,4,5,6,3);
		
		//Convert List to Set
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		set.stream().forEach(s->System.out.println(s));
				
		//Find all duplicate elements from list
		List<Integer> duplicate = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1)
				.map(e->e.getKey()).collect(Collectors.toList());
		System.out.println(duplicate);
		
		
		//Find Occurances of each element
		List<String> alist = List.of("a","a","b","c","b","d");
		Map<String ,Long> map = alist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));	
		System.out.println(map);
		
		
		//find first duplicate from list
		Integer firstdup = list.stream()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().filter(e->e.getValue()>1)
			.map(e->e.getKey()).findFirst().get();
		
		System.out.println(firstdup);
		
		
		int min = list.stream().min(Integer::compare).orElse(0);
		System.out.println("Min ::"+min);
		
		int max = list.stream().max(Integer::compare).orElse(0);
		System.out.println("Max ::"+max);
		
		//Display unique and sorted
		List<Integer> sorted = list.stream()
				.distinct().sorted().collect(Collectors.toList());
		
		System.out.println(sorted);
		
		//Sorted in Reverse order
		List<Integer> reversesorted = list.stream().distinct()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesorted);
	

	}
}
