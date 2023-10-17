package demo;

public class Order {

	private Long orderId;
	private Customer customer;
	private Product product;
	private String orderDate;
	
	public Order(Long orderId, Customer customer, Product product, String orderDate) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
		this.orderDate = orderDate;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
