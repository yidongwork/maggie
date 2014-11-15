package vehicle;

public interface Interface_Vehicle {
	int seats = 0;
	int wheels = 0;
	int speed = 0;
	String Energy_Source = "";
	String Vehicle_Type = "";
	
	public int getNumOfSeats();
	
	public int getNumOfWheels();
	
	public int speedUp();
	
	public String getCostOfEngery();
	
	public String getVehicleType();


}
