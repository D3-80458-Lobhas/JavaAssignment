package jav.assignment1;

import java.util.Scanner;

public class Invoice {
	 String partNo;
	 String partDesc;
	 int qty;
	 double price; 
	
	 public Invoice() {
		 this.partNo = "";
		 this.partDesc = "";
		 this.qty = 0;
		 this.price = 0;
	 }
	
	 public Invoice(String partNo, String partDesc, int qty, double price) {
		 this.partNo = partNo;
		 this.partDesc = partDesc;
		 this.qty = qty;
		 this.price = price;
	 }
	

	public String getPartNo() {
		return partNo;
	}


	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}


	public String getPartDesc() {
		return partDesc;
	}


	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateAmount()
	{
		double amount;
		if(qty<0)
		{
			setQty(0);			
		}
		if(price<0)
		{
			setPrice(0);
		}
		amount=qty*price;
		return amount;
	}

	
	

}
