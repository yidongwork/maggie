package vehicle;

public class Vehicle {
	int seats = 0;
	int wheels = 0;
	int speed = 0;
	String Energy_Source = "";
	String Vehicle_Type = "";
	
	public int getNumOfSeats() {
		if(this.Vehicle_Type.equals("Wheelchair")){
			return 1;
		}
		else if(this.Vehicle_Type.equals("Wagons")){
			return 4;
		}
		else if (this.Vehicle_Type.equals("Bicycle")){
			return 1;
		}
		else if (this.Vehicle_Type.equals("Motorcycle")){
			return 2;
		}
		return seats;
	}
	
	public int getNumOfWheels(){
		return wheels;
		
	}
	
	public int speedUp(){
		return speed;
		
	}
	
	public String getCostOfEngery(){
		return Energy_Source;
		
	}
	
	public String getVehicleType(){
		return Vehicle_Type;
	}

	public int getNumofWheels() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
