package demo.overrding;

public interface Payment {

	public void doTransaction();
	
	default void addCoupon() {
		System.out.println("Default method :: Add 5 Rupees coupon.");
	}
	
	static void getPaymentReport() {
		System.out.println("static method of Payment Report ");
	}
}
