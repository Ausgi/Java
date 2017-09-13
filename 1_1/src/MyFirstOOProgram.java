
public class MyFirstOOProgram {

	public static void main(String[] args) {
		int carSpeed;
		
		
		Car myCar = new Car("OOP-001");
		
		myCar.setCurrentSpeed(120);
		carSpeed = myCar.checkCurrentSpeed();
		
		System.out.println("The car with plate number " + myCar.getPlateNr() + " has a current speed of " + myCar.checkCurrentSpeed() + " km/h");

	}

}
