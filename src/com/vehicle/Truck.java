package com.vehicle;

public class Truck  extends Vehicle{
	
	
	private String bedSize;
	private int towingCapacity;
	
	public Truck(String color, String make, String model, int year,String bedSize,int towingCapacity) {
		super(color, make, model, year);
		
		this.bedSize=bedSize;
		this.towingCapacity=towingCapacity;
		
	}
	

	@Override
	public void start() {
		System.out.println("Starting the Truck....");
		
	}
	
	public void displayTruckInfo()
	{
		
		displayInfo();
		System.out.println("Bed Size: " + bedSize);
		System.out.println("Towing Capacity: " + towingCapacity + " 1bs");
		
	}
	
	
	

}
