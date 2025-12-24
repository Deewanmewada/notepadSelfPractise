
// same pagkage

public class Order{
	
public static void main(String [] args){

// cretate object  of Customer class 
	Customer customer = new Customer();

// accessing Default acesss member within the same package 	
	customer.sayHello("kodewala");
	System.out.println("Customer name : " + customer.customerName);
	}
}
