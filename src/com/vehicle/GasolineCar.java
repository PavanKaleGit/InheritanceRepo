package com.vehicle;

public class GasolineCar  extends Car{
	
	private int fuelCapacity;
	private int mpg;
	
	public GasolineCar(String color, String make, String model, int year,int numDoors,String transmissionType) {
		super(color, make, model, year,numDoors,transmissionType);
		this.fuelCapacity=fuelCapacity;
		this.mpg=mpg;
		
	}
	
	public void start()
	{
		System.out.println("Starting the gasoline car");
	}
	
	public void displayGasolineCarInfo()
	{
		displayCarInfo();
		
		System.out.println("Fuel Capacity :" + fuelCapacity + " gallons");
		System.out.println("Miles per Gallon : " + mpg + "mpg");
	}
	

}
