package com.vehicle;

public class Test {
	
	public static void main(String[] args) {
		Vehicle electricCar =new ElectricCar("Red", "TATA", "nexon ev",2022,4,"Automation");
		Vehicle GasolineCar =new GasolineCar("Blue","Toyota","Camry",2021,5,"Automation");
		Vehicle truck = new Truck ("Black","Ford","F-150",2022,"1",4);
		
		
		
		Vehicle[] vehicles= {electricCar,GasolineCar,truck};
		
		
		for(Vehicle v: vehicles)
		{
			v.start();
			v.displayInfo();
			System.out.println(v);
			
	
		}
		
		if(electricCar instanceof ElectricCar)
		{
			((ElectricCar) electricCar).displayElectricCarInfo();
		}
		
		
		if(GasolineCar instanceof GasolineCar)
		{
			((GasolineCar) GasolineCar).displayGasolineCarInfo();
		}
		
		if(truck instanceof Truck)
		{
			
	         ((Truck )truck).displayTruckInfo();
		}
		
		
		
	}

}
