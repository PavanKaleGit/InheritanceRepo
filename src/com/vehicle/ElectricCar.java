package com.vehicle;

public class ElectricCar  extends Car{

	
	
	
	private int batteryCapacity;
	private int range;
	
	public ElectricCar(String color, String make, String model, int year,int numDoors,String transmissionType) {
		super(color, make, model, year,numDoors,transmissionType);
		this.batteryCapacity = batteryCapacity;
		this.range=range;
	}
	
	
@Override
public void start()
{
	System.out.println("Starting the electric car");
	
}


public void displayElectricCarInfo()
{
	displayCarInfo();
	System.out.println("Battery Capacity: "+ batteryCapacity);
	System.out.println("Range : " + range + "miles");
}

}
