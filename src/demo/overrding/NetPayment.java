package demo.overrding;

public class NetPayment implements Payment{

	@Override
	public void doTransaction() {
		System.out.println("Payment from NetBanking.");	
	}
	
	@Override
	public void addCoupon() {
		System.out.println("Default method in subclass :: Add 10 Rupees coupon.");
	}
}
