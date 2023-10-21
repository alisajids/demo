package demo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class IDemo {
	
	public static void main(String args[]) {
		
		List<Integer> list = List.of(2,3,4,50,100,40);
				
		int max = list.stream().max((e1,e2) -> Integer.compare(e1, e2)).orElse(0);
		
		int secondmax = list.stream().filter(l-> l<max).collect(Collectors.toList())
				 .stream().max((e1,e2)->Integer.compare(e1, e2)).orElse(0);
		
		System.out.println("MAX::"+max);
		System.out.println("SECOND MAX::"+secondmax);
		//Find second max No from List
		int thirmax =  list.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst().orElse(0);
	
		System.out.println("Third MAX::"+thirmax);
		
		
		
		List<Employee> listEmp = List.of(new Employee(1,"sajid", 50000.00),
				new Employee(2,"sam", 60000.00),
				new Employee(3,"salaman", 80000.00),
				new Employee(5,"aasif", 80000.00));
   
		  // find Max salary from Employee List
			Employee e = listEmp.stream().distinct()
					.max((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()))
					.orElse(null);
			
			 System.out.println("MAX SALARY:: "+e.getSalary());

			
			
	}
 		
	}


