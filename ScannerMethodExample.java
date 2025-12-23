//user input - interactive way

import java.util.Scanner;

public class ScannerMethodExample {

public static void main(String [] args){
		
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your age : "); // prompt user to enter their age 
	int age = scanner.nextInt();     // Read a integer input

	// clear buffer
	scanner.nextLine();

	System.out.print("Enter your name: ");
	String name = scanner.nextLine();  // using nextLine() to text as a input
	
	System.out.print("Enter your fav color: ");
	String color = scanner.next();

	System.out.print("Enter your weight in kg: ");
	double weight = scanner.nextDouble();


	System.out.println("--- Collected Input ---");
	System.out.println("Enter age: " + age);
	System.out.println("Enter name: " + name);
	System.out.println("Enter color: " + color);
	System.out.println("Enter weight: " + weight);

	scanner.close();




	


	

	
	
	
	}
}