package demo.overrding;

import java.util.HashSet;
import java.util.Set;

public class child extends Parent{

	public int x=20;
	
	public void m1() throws Exception{
		System.out.println("m1 from Child");
	}

	public static void main(String args[]) throws Exception {
		Parent p = new child();
		p.m1(); // access m1 from child
		System.out.println(p.x); // output=10
		
		// We cannot override private or static method.
		
		Set<String> set = new HashSet<>();
		set.add("Mumbai");
	}
}
