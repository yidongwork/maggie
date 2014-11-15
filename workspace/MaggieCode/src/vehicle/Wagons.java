package vehicle;

public class Wagons {
	int wheels = 4;
	int speed = 0;
	String Energy_Source = "house power";
	
	void numOfWheels (int num){
		wheels = num;
	}
	
	void speedUp(int whipTheHorse){
		speed = speed + whipTheHorse;
	}
	
	void breaks(int holdTheHorse){
		speed = speed - holdTheHorse;
	}
}
