package com.customerTreeMap;

public class Customer implements Comparable<Customer> {

	private int custId;
	private String custName;
	private long mobileNo;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int custId, String custName, long mobileNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobileNo = mobileNo;
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", mobileNo=" + mobileNo + "]";
	}

	@Override
	public int compareTo(Customer o) {
		if(this.custId==o.custId) {
			return 0;
		}
		else {
			if(this.custId>o.custId) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
	
	
}
