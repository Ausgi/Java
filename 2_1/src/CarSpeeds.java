import java.util.Scanner;

public class CarSpeeds {
	public static void main(String[] args) {
		String plateNr;
		int speed, sumSpeed=0;
		
		Scanner inputReader = new Scanner(System.in);
		
		Car[] cars = 
	{
	new Car  ("HGR-987"),
	new Car  ("EFX-395"),
	new Car  ("ACW-900")
};	
		for (int i=0; i < cars.length; i++ ){
		do{
			System.out.println("Enter the speeed of car " + cars[i].getPlateNr());
			speed = inputReader.nextInt();
			
			
			if(cars[i].setSpeed(speed)){
				sumSpeed += speed;
				
				break;
			}
			else 
				System.out.println("Invalid car speed");
		}while(true);
		
}
	System.out.println("The average speed of cars is " + (int)(sumSpeed/cars.length) + "km/h");

	}
}
