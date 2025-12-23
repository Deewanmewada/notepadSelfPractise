// Write a method to calculate the total price of items in a shopping cart.

public class Shopping{
	int mobile;
	int laptop;
	int facewash;
	
public int totalPrice(){
	return mobile + laptop + facewash;
}
public static void main(String [] args){

	Shopping shopping = new Shopping();

	shopping.mobile = 50000;
	shopping.laptop = 50000;
	shopping.facewash = 50000;

	int res = shopping.totalPrice();
	System.out.println(res);

	}
}