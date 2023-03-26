package com.innerClass;

class Mall{
	private static String mallName = "Pacific";
	private String loc ="Pune";
	
	void doShopping() {
		class Cart{
			String item;
			float price;
			float totBill = 0.0f;
			
			public void addBill(String item, float price) {
				this.item = item;
				this.price = price;
				System.out.println(this.item+" "+this.price);
				this.totBill += this.price;
			}
			
			public void displauBill() {
				System.out.println("Thanks for shopping");
				System.out.println("tot bill ="+totBill);
			}
		}
		Cart c1 = new Cart();
		c1.addBill("laptop", 45000.0f);
		c1.addBill("pendrive", 870.0f);
		c1.addBill("headphones",1000.0f);
		c1.displauBill();
	}
}
public class LocalInnerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mall m1 = new Mall();
		m1.doShopping();
	}

}
