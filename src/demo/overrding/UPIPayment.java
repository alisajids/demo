package demo.overrding;

public class UPIPayment implements Payment {

	@Override // Override is optional , but good to have
	public void doTransaction() {
		System.out.println("Payment from UPI");
		
	}

	
}
