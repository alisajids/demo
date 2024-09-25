package demo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String name;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="studentId", orphanRemoval = true)
	private List<Address> list;
}
