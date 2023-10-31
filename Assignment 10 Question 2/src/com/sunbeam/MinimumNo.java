package com.sunbeam;

public class MinimumNo {

	public MinimumNo() {
	
	}

	public static <T extends Number> void minimumNoFind(T[] arr)
	{
		T min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].doubleValue()<min.doubleValue())
				min=arr[i];
		}
		System.out.println("The minimum no is : "+ min);
	}
	public static void main(String[] args) {
		Integer []Arr1= new Integer[] {5,6,10,8,7,2,16,15};
		Double []Arr2= new Double[] {1.5,52.4,14.5,0.1,581.6};
		minimumNoFind(Arr1);
		minimumNoFind(Arr2);
		

	}

}
