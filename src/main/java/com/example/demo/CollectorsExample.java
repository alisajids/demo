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

	public static void concatStringList() {

		//Concate Two list by sorting and distinct (String)
		List<String> strList1 = List.of("Pune", "Mumbai");
		List<String> strList2 = List.of("Nashik", "Dhule");
		
		List<String> strList = Stream.concat(strList1.stream(), strList2.stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(strList);
		
	}

	public static void groupBy() {
		// Get the List
        List<String> g
            = List.of("geeks", "for", "geeks");
 
        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
            = g.stream().collect(
                Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()));
 
        // Print the result
        System.out.println(result);
	}


		public static void findDuplicate() {
		
		List<Integer> i = List.of(5,3,1,3,4,9,9,9);
		
		//Find duplicate from List<Integer>asdASZA
				List<Integer> duplicates = i.stream()
				        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				        .entrySet()
				        .stream()
				        .filter(e -> e.getValue() > 1)
				        .map(Map.Entry::getKey)
				        .collect(Collectors.toList());

				System.out.println("Duplicates: " + duplicates);
				
				System.out.println("Distinct values : "+i.stream().collect(Collectors.toSet()));
	}

	//Step by step
	public static void findDup() {
		List<Integer> i = List.of(5,3,1,3,4,9,9,9);
		
		Stream<Integer> stream = i.stream(); //convert List to stream
		
		//Count each element from List and return Map of value with count
		Map<Integer, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		//convert Map to stream
		Stream<Entry<Integer,Long>> mapstream = map.entrySet().stream();
		
		//collect List<Integer> from Map by checking count > 1
		List<Integer> duplicate =  mapstream.filter(e -> e.getValue() > 1).map(Entry::getKey).collect(Collectors.toList());
		
		System.out.print(duplicate);
	}

  public void partitioningStudent(){
	  final double PASS_THRESHOLD = 60.0;
	List<Student> studList = List.of(
				new Student(1, "sam", 70.0, "ENG"),
				new Student(2, "aasif", 71.0, "CS"),
				new Student(3, "karan", 50.0, "CS"), 
				new Student(1, "rahul", 45.0, "ENG")
				);

	     // Partition students into passing and failing
		Map<Boolean, List<Student>> passFailStudList = studList.stream()
				.collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
		
		for (Map.Entry<Boolean, List<Student>> entry : passFailStudList.entrySet()) {
			System.out.print(entry.getKey()+" ");
			System.out.print("[");
			for (Student s : entry.getValue()) {
				System.out.print(s.getName() + " ");
				System.out.print(s.getGrade() + ", ");
			}
			System.out.println("]");
		}
  }
	
}
