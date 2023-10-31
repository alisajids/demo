# README
 This is a basic program for biginner for CRUD Operation using Spring Boot with Rest API like GET,POST,PUT,DELETE
You are tasked with implementing a feature in an e-commerce system that involves products, categories, customers, and orders. Here are the class relationships:
1. `Product` class has:
   - `productId`
   - `productName`
   - `category` (of type `Category`)

2. `Category` class has:
   - `categoryId`
   - `categoryName`

3. `Customer` class has:
   - `customerId`
   - `customerName`

4. `Order` class has:
   - `orderId`
   - `customer` (of type `Customer`)
   - `products` (a list of type `Product`)
   - `orderDate`


Your task is to write a Java method that takes a list of orders and returns a map that groups orders by category, where each category key is mapped to a list of customer names who ordered products from that category. Use Java Streams for this task.

Write a Java method with the following signature:

public static Map<Category, List<String>> groupCustomersByCategory(List<Order> orders) {
    // Your code here
}

What is SOLID principal?
What DRY and KISS?


Example:
Input 1 : UNit Price= X
Input 2 : Model Price =Y
Output  : Gross Value ?

UK
Gross Value= UNit Price


Poland
Gross Value=Model Price

Russia
Gross Value=Unit + Model Price


Country  --> interface
calculat(unitp, modep)

c = new UK();
c.cal
UK implement Country---> subclass


Europ implement Country---class

calc(){
  if(UK || Ger)
   unit
  else if() 
}


Germany
	Gross Value= UNit Price
---------------------------------------  
What is polymorphism?
What is Abstraction?

  
  // Join the characters from the array and frame the word


Input 1 Array         :{"d","e","ed","co","aa"} 
INput 2 Word (String) :"code"


public String matchStr(){
    
    List<String> str1={"d","e","ed","co","aa"} ;
    String match="code";
    
    co, d,e,ed,xx
    aacodeed
    
    List<Strig> sorted = str1.stream().sorted()
    .collect(Collectors.toList());
    
    String word="";
    for(String str : sorted){
      word = word.concat(str);
    }
   if(word.contains(match)){
     String res = word.substring(match);
      System.out.print("Word Matched");
    }
    
    
  
}



public final class Student {

    
    public final String id;    
    public final String name;
	
  public Student(id, name{ this.id = id;
  this.name = name
  }
	
	public String getId() {
        return id;
    }
   

    private void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    
    @Overide
    equal(){}
    hash()

}





public class A { 
   int x = 20;
}
public class B extends A {
   int x = 30;
}

	B b = new B();
   System.out.println(b.x); // 30
 
   A a = new A();
   System.out.println(a.x); // 20
 
   A a2 = new B();  // run time
   System.out.println(a2.x); //30
   
   
   
   
   
   
   
   
   
package pack1;
public class A 
{
   private int x = 50;	
   protected int y = 100;
    int z = 200;
}
package pack2;
import pack1.A;
public class B extends A {

}


package pack1;
import pack2.B;
public class Test {
public static void main(String[] args) 
{
   B b = new B();
   System.out.println(b.x); // Not accessible
   System.out.println(b.y); // Accessible
   System.out.println(b.z); // Accessible 
  }
}

Imbutable class implementation
How to store key value pair in sroted manner
Designig pattern
 Singleton
 Factory
 Abstract
 Creational



Map<String,String> map=new HashMap<>()
				map.put("RED", "apple");
				map.put("BLACK", null);
				map.put("BLUE", "sea");
				map.put("GREEN", "leaf");
				map.put("WHITE", "");
        
       map.entrySet().stream()
       .filter(e->!StringUtil.isEmpty(e.getValue()))
       .collect(Collectors.toMap());
       
       
       
       List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5); =>3,4	
       
      List<Integer> list =   list.stream().collect(Collectors.groupingBy(Function.identity(),
       Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
       

What are the type of Bean Scop?
Singleton
Prototype
Session
Request

What is @AdviceController Annotation
What are the Security Layers implemented.






public  class Student {

    
    public String id;    
    public String name;
    
  @ManyToOne(FetchType.Lazy)
  @ColumnMapping(name="student")
	public List<Address> address;
	

}

public  class Address {

	public String addid;  
	public String city;    
    public String street;
   
   @OneToMany(FetchType.Lazy)
   @ColumnMapping(name="student_id", refrenceColumn="id")
   private Stundent student; 
    
	
}



Customer (id,name)	
customerid	name
1	John
2	Robert
3	David
4	Ram
5	Deepak

Orders( id, amount, customer_id)	
orderid	amount	customerid
100	20	1
101	40	4
102	30	2
103	79	2
104	100	1
       
  select c.id,c.name FROM customer c 
  WHERE c.id not in (select customerid from order)
    
What is docker and kubernates?
What is colision in Map?
What is hibernate n-1 problem?
How to map composit key in JPA?
JacksonToJsonMapping



