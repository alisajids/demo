package demo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionDemo {

	public static void main(String args[]) {
		List<Integer> l1 = List.of(1,2,3,4,5,6);
		
//		System.out.print(l1);
		//Stores duplicate element and insertion order maintained
		// It uses index  of array hence search and retrieval is faster.
		l1.stream().forEach(System.out::println);
		
		
		//Stores duplicate element and insertion order maintained
		//Insert and update is very fast and efficient
		// It usese doubly linked list to store element
		List<String> l2 = new LinkedList<>();
		l2.add("d");
		l2.add("c");
		l2.add("b");
		l2.add("a");
		System.out.println(l2);
		
		Iterator<String> t = l2.iterator();
		while(t.hasNext()) {
			System.out.print(t.next());
			
		}
		
	
		//Stores unique element but insertion order not maintained
		//it uses only HashMap internally to store its elements
		System.out.println("HashSet");
		Set<String> s = new HashSet<>();
		s.add("d");
		s.add("d");
		s.add("a");
		s.add("b");
		System.out.println(s);
		
		//Stores unique element but insertion order maintained
		System.out.println("LinkedHashSet");
		Set<String> ls = new LinkedHashSet<>();
		ls.add("d");
		ls.add("d");
		ls.add("a");
		ls.add("b");
		System.out.println(ls);
		
		//Stores unique element and element stored is in sorted order 
		System.out.println("TreeSet");
				Set<String> ts = new TreeSet<>();
				ts.add("d");
				ts.add("d");
				ts.add("a");
				ts.add("b");
				System.out.println(ts);

	}
}
