package demo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainDemo {

	public static void main(String args[]) {
		
		Order o1 = new Order(1L, new Customer(1L,"sam"), 
				new Product(1L,"Indigo Nation", new Catagory(1L, "Cloth")), "1-1-20");
		
		Order o2 = new Order(2L, new Customer(2L,"Sajid"), 
				new Product(2L,"Raymand", new Catagory(2L, "Cloth")), "1-1-20");
		
		Order o3 = new Order(3L, new Customer(3L,"Aasif"), 
				new Product(3L,"Raymand", new Catagory(3L, "Cloth")), "1-1-20");
		
		List<Order> orders = List.of(o1,o2,o3);
		
		Map<String, List<String>> resp = groupCustomersByCategory(orders);
		for(Map.Entry<String, List<String>> m: resp.entrySet()) {
			 System.out.println(m.getKey());
			 System.out.println(m.getValue());
		 }

	}
	
	public static Map<String, List<String>> groupCustomersByCategory(List<Order> orders) {
	   
		 return	orders.stream().collect(
				 Collectors.groupingBy(o->o.getProduct().getCatagory().getCategoryName(),
						Collectors.mapping(o->o.getCustomer().getCustomerName(), Collectors.toList())));
		
	}
}
