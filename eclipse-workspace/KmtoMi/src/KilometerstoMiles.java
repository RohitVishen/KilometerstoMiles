
public class KilometerstoMiles {
	
	public static void main(String args[]) {
		double kilometers, miles;
		int counter;
		
		counter = 0;
		for (kilometers = 1; kilometers <= 30; kilometers++) {
			miles = kilometers * 0.621371; //Conversion to miles
		
		
		System.out.println(kilometers +  " kilometers is " +  miles +  " miles.");
		
		counter++;
		if(counter == 10) {
			System.out.println();
			counter = 0; //reset the line counter
			}
		}
	}
}


