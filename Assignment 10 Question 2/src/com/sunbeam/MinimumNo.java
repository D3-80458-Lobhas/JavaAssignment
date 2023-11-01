package com.sunbeam;

public class MinimumNo {

	public MinimumNo() {
	
	}

	public static <T extends Number> T minimumNoFind(T[] arr)
	{
		T min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].doubleValue()<min.doubleValue())
				min=arr[i];
		}
		return min;
	}
	public static void main(String[] args) {
		Integer []Arr1= new Integer[] {5,6,10,8,7,2,16,15};
		Double []Arr2= new Double[] {1.5,52.4,14.5,0.1,581.6};
		System.out.println("The minimum No is "+minimumNoFind(Arr1));
		System.out.println("The minimum No is "+minimumNoFind(Arr2));
		

	}

}
