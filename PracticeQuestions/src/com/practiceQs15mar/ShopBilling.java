package com.practiceQs15mar;

import java.util.Arrays;

class Customer{
	static String shopName = "copona";
	private int custId;
	private String custName;
	private float totBill;
	private int noOfOrders;
	private Order order[];
	Customer(){
		
	}
	
	Customer(int custId, String custName, Order[] order, int noOfOrders) {
		this.custId = custId;
		this.custName = custName;
//		this.totBill = totBill;
		this.order = order;
		this.noOfOrders = noOfOrders;
	}
	public static String getShopName() {
		return shopName;
	}
	public static void setShopName(String shopName) {
		Customer.shopName = shopName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public float getTotBill() {
		return totBill;
	}
	public void setTotBill(float totBill) {
//		this.totBill = totBill;
		for(int i=0; i<order.length; i++) {
			this.totBill += (order[i].getUnitPrice()*order[i].getQuantity());
		}
		
	}
	public Order[] getOrder() {
		return order;
	}
	public void setOrder(Order[] order) {
		this.order = order;
//		setNoOfOrders(order.length);
	}

	public int getNoOfOrders() {
		return noOfOrders;
	}

	public void setNoOfOrders(int noOfOrders) {
		this.noOfOrders = noOfOrders;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", totBill=" + totBill + ", noOfOrders="
				+ noOfOrders + ", order=" + Arrays.toString(order) + "]";
	}
	
		
}
class Order{
	private int id;
	private String title;
	private float unitPrice;
	private int quantity;
//	int count = Order.length;
	Order(){
		
	}
	Order(int id, String title, float unitPrice) {
		this(id,title,unitPrice,1);
	}
	Order(int id, String title, float unitPrice,int quantity) {
		this.id = id;
		this.title = title;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", title=" + title + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}

	
	
	
}
public class ShopBilling {

	public static void listCust(Customer c[]) {
		for(Customer cust:c) {
			System.out.println(cust);
		}
		System.out.println("-----------------------------------");
	}
	public static void maxOrder(Customer c[]) {
		
		int maxO = Integer.MIN_VALUE;
		int index = 0;
		for(int i=0; i<c.length; i++) {
			if(c[i].getNoOfOrders()>maxO) {
				maxO = c[i].getNoOfOrders();
				index = i;
//				System.out.println(i);
			}
		}
	    System.out.println("Maximum order by");
	    System.out.println(c[index]);
	}
	public static void main(String[] args) {
		
		Order o[] = new Order[3];
		o[0]=new Order(1023,"FountainPen",100.0f);
		o[1]=new Order(43423,"WashiTape",50.0f,2);
		o[2]=new Order(4354,"MechanicalPencil",70.0f,5);
		
		Customer c[] = new Customer[4];
		c[0] = new Customer(2342,"Billy",new Order[]{o[0],o[1]},2);
		c[1] = new Customer(2345,"Alice",new Order[]{o[1],o[2]},2);
		c[2] = new Customer(2312,"Pradhosh",new Order[]{o[0],o[1],o[2]},3);
		c[3] = new Customer(2352,"Dave",new Order[]{o[0],o[2]},2);
		
//		System.out.println(c[0].getOrder());
		listCust(c);
		 maxOrder(c);
		
	}

}
