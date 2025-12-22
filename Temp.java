// Given a range of temperature (pass from command line)  , identify days where the temperature was both above 30 degree and humidity below 50% ?

public class Temp {

public static void main(String[] args){
		int temperature = Integer.parseInt(args[0]);
		int humidity = Integer.parseInt(args[1]);
		
		if((temperature > 30) && (humidity < 50)){
            		System.out.println("Condition matched: Hot day with low humidity");

		}
		else {
			System.out.println("Condition NOT matched");

			}
		
	}
}