package demo;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private Long salary;
	
	public Employee(int id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o2) {
		if (this.getId()== o2.getId()) return 0;
		else if (this.getId()> o2.getId()) return 1;
		else return -1;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
}
