// write a program that reads multiple types of inputs, age , name , salary and validate them ?

import java.util.Scanner;
public class ScannerMethodValidate{

public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter age:" );
	
	while(!scanner.hasNextInt()){
		System.out.println("invalid interger pls Enter valid interger ");
		scanner.next();
            	System.out.print("Enter age:");

	}

	int age = scanner.nextInt();

	scanner.nextLine();


	

	System.out.print("Enter name: ");
	while(!scanner.hasNextLine()){
		System.out.println("invalid name pls Enter valid name ");
		

	}
	String name = scanner.nextLine();

	
	System.out.print("Enter salary:" );
	while(!scanner.hasNextDouble()){
		System.out.println("invaild salary! , pls Enter:  ");
		scanner.nextLine();
		System.out.print("Enter name: ");
		

	}

        double salary = scanner.nextDouble();

        // Display Output
        System.out.println("\n--- User Details ---");
        System.out.println("Age    : " + age);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);

        scanner.close();



	

	
	
	
	
	
	}
}