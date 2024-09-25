package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ExamplesString {

	public static void main(String args[]) {
		
		//Merge two List with unique elements
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7,7);

       List<Integer> duplicate =  list2.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream()
        .filter(e->e.getValue()>1)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
       
       System.out.println("The duplicate of arraylist ::"+duplicate);

        
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("The concatination of two arraylist ::"+mergedList);
        
        
        List<Employee> employees = Arrays.asList(new Employee(1,"Alice", 12000L),
        		new Employee(2,"Alice",18000L),
        		new Employee(3,"Charlie",15000L),
        		new Employee(4,"David",11000L));
        
      //find duplicate employee by name
       Map<String, Long> map=  employees.stream()
    		   .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));     
       List<String> dup =	map.entrySet().stream()
    		   .filter(e->e.getValue()>1)
    		   .map(Map.Entry::getKey)
    		   .collect(Collectors.toList());
       System.out.println("The duplicate Emp ::"+dup);

       
        // Filtering and sorting employees with salary greater than 10,000
       
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > 10000)
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName())) //sorted by name
                .collect(Collectors.toList());
        
        highSalaryEmployees.stream().forEach(e->System.out.println(e.getName()));

        //select first employee with salary >10000
       Employee optional =  employees.stream().filter(e->e.getSalary()>10000).findFirst().get();
       
       //select the employee with max salary
      Employee e= employees.stream()
    		  .distinct()
    		  .max((e1,e2)->Long.compare(e1.getSalary(),e2.getSalary()))
    		  .orElse(null);
      
  //   select max(salary) from employee WHERE salary < (select max(salary) from employee);
      // select salary from employee order by salary DESC limit 1 OFFSET 1;
		Double maxSal = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0);
		 employees.stream().map(Employee::getSalary).collect(Collectors.toList()).
				stream().sorted(Comparator.reverseOrder()).limit(1);
		 
		 
		 
		 Employee highestSalaryEmployee = employees.stream()
	                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
	                .findFirst().get();
		 
		 //Third highest salary 
		 Optional<Employee> thirdHighestEmployee = employees.stream()
	                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
	                .skip(2) // Skip the first two (highest and second-highest)
	                .limit(1)
	                .findFirst();


	        // Using Java 8 Stream API to find the second-highest salary
	        Optional<Long> secondHighestSalary = employees.stream()
	                .map(Employee::getSalary)
	                .distinct()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)  // Skip the highest salary
	                .limit(1)
	                .findFirst();

	}
}
