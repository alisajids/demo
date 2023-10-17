package demo;


public class Product {

	private Long   productId;
	private String  productName;
	private Catagory catagory;
	
	public Product(Long productId, String productName, Catagory catagory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.catagory = catagory;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}
	   
	
}
