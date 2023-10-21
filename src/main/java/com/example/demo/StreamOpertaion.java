package demo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamOperation {
	
	public static void main(String args[]) {
		
		List<Integer> list = List.of(2,3,4,50,100,40);
				
		//Find Max 
		int max = list.stream().max(Integer::compare).orElse(0);
		System.out.println("MAX::"+max);

		//Find second max Integer
		int secondmax = list.stream().filter(l-> l<max).toList()
				 .stream().max(Integer::compare).orElse(0);
		
		System.out.println("SECOND MAX::"+secondmax);
		
		//Find Third max No from List
		int thirdmax =  list.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst().orElse(0);
	
		System.out.println("Third MAX::"+thidrmax);
		
		//----------------------------------------------------------------------------------
		
		List<Employee> listEmp = List.of(new Employee(1,"sajid", 50000.00),
				new Employee(2,"sam", 60000.00),
				new Employee(5,"aasif", 80000.00));
   
		  // find Employee with Max salary from Employee List
			Employee e = listEmp.stream().distinct()
					.max((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()))
					.orElse(null);
			
			 System.out.println("NAME:"+ e.getName()+"  MAX SALARY:: "+e.getSalary());

		// find Employee with SECOND Max salary from Employee List
			Double maxSal = listEmp.stream().mapToDouble(Employee::getSalary).max().orElse(0);
			
			Double secondMax = listEmp.stream().mapToDouble(Employee::getSalary)
					.filter(salary -> salary < maxSal)
					.max().orElse(0);
			
			Optional<Employee> emp = listEmp.stream().filter(employee-> employee.getSalary() == secondMax).findFirst();
			
			 System.out.println("NAME:"+ emp.get().getName()+"  MAX SALARY:: "+emp.get().getSalary());
			
	}
 		
	}


