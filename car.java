//Create a car class, write a method that calculate the final price after applying a discount . use local variable to:
//-> store the discount rate (eg.10 %);
//-> calculate the discounted price and return it .

public class car {
	public static double calculateFinalPrice(double oringnalPrice){

		double discountRate = 0.10;
		double discount = oringnalPrice * discountRate;
		double finalPrice = oringnalPrice - discount;

		return finalPrice;
	}
public static void main(String [] args){
		car c1 = new car();
		double price = 50;
		double finalResult = c1.calculateFinalPrice(price);
		System.out.println("Discounted price is :" + finalResult);
		

	}
}
