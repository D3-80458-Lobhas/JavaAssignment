package javaassignment.q1;

public class CreditLimit {

	private int accno;
	private int pendingBal;
	private int itemsCharged;
	private int creditApplied;
	private int creditAllowed;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getPendingBal() {
		return pendingBal;
	}
	public void setPendingBal(int pendingBal) {
		this.pendingBal = pendingBal;
	}
	public int getItemsCharged() {
		return itemsCharged;
	}
	public void setItemsCharged(int itemsCharged) {
		this.itemsCharged = itemsCharged;
	}
	public int getCreditApplied() {
		return creditApplied;
	}
	public void setCreditApplied(int creditApplied) {
		this.creditApplied = creditApplied;
	}
	public int getCreditAllowed() {
		return creditAllowed;
	}
	public void setCreditAllowed(int creditAllowed) {
		this.creditAllowed = creditAllowed;
	}
	
	public void displayBalance()
	{
		int newBalance = pendingBal + itemsCharged - creditApplied ;
		System.out.println("--------------------------");
		System.out.println("Account No. : "+ accno);
		System.out.println("New Balance = "+ newBalance);
		if(newBalance<creditAllowed)
		{
			System.out.println("limit not exceeded");
			
		}
		else
		{
			System.out.println("Credit limt Exceeded !!");
		}
		System.out.println("--------------------------");
	}
	
	
}
	

