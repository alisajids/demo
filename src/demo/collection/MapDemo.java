package demo.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String args[]) {
		
		System.out.println("HashMap");
		Map<Integer, String> map = new HashMap<>();
		map.put(4, "c");
		map.put(2, "b");
		map.put(null, null);
		map.put(1, "a");
		map.put(6, "d");
		//only one null key we can store
		//key and value can be duplicate it will update value if key is duplicate in node
		System.out.println(map);
		
		
		System.out.println("TreeMap");
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(4, "c");
		tm.put(null, "b");
		tm.put(1, "a");
		tm.put(6, "d");
		//null key is not allowed
		//it will sort element using key in natural order , or you can pass comparator parameter.
		System.out.print(tm);
	}
}
