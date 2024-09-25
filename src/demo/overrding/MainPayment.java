package demo.overrding;

public class MainPayment {

	public static void main(String args[])
	{
		//It Override abstract  method from super interface
		Payment payment = new UPIPayment();
		payment.doTransaction();
		payment.addCoupon();
		
		Payment.getPaymentReport();
		
		
		//It Override both abstract and default method from super interface
		Payment p = new NetPayment();
		p.doTransaction();
		p.addCoupon();
		Payment.getPaymentReport();
	}
}
