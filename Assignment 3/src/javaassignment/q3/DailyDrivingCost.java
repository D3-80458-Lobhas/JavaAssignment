package javaassignment.q3;

public class DailyDrivingCost {
	private int totalMiles;
	private int costPerGallon;
	private int averageMilesPerGallon;
	private int parkingFees;
	private int tollsPerDay;
	
	public DailyDrivingCost() {	
		totalMiles=0;
		costPerGallon=0;
		averageMilesPerGallon=0;
		parkingFees=0;
		tollsPerDay=0;
	}
	public DailyDrivingCost(int totalMiles, int costPerGallon, int averageMilesPerGallon, int parkingFees,
			int tollsPerDay) {
		super();
		this.totalMiles = totalMiles;
		this.costPerGallon = costPerGallon;
		this.averageMilesPerGallon = averageMilesPerGallon;
		this.parkingFees = parkingFees;
		this.tollsPerDay = tollsPerDay;
	}
	public int getTotalMiles() {
		return totalMiles;
	}
	public void setTotalMiles(int totalMiles) {
		this.totalMiles = totalMiles;
	}
	public int getCostPerGallon() {
		return costPerGallon;
	}
	public void setCostPerGallon(int costPerGallon) {
		this.costPerGallon = costPerGallon;
	}
	public int getAverageMilesPerGallon() {
		return averageMilesPerGallon;
	}
	public void setAverageMilesPerGallon(int averageMilesPerGallon) {
		this.averageMilesPerGallon = averageMilesPerGallon;
	}
	public int getParkingFees() {
		return parkingFees;
	}
	public void setParkingFees(int parkingFees) {
		this.parkingFees = parkingFees;
	}
	public int getTollsPerDay() {
		return tollsPerDay;
	}
	public void setTollsPerDay(int tollsPerDay) {
		this.tollsPerDay = tollsPerDay;
	}
	
	public void calculateDailyDrivingCost()
	{
		 double totalCost=tollsPerDay+parkingFees+(totalMiles*costPerGallon)/averageMilesPerGallon;
		 System.out.println("The Total Daily Cost is :"+totalCost);
	}
}
