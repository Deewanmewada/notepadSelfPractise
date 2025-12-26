// Write a program to calculate the shipping cost based on the order amount:
// -> Order above Rs 5000 : Free shipping 
// -> Order between Rs 2000 and 5,000: Rs 100 shipping fee.
//-> Orders below Rs 2000: Rs 200 shipping fee



public class ShippingCost {

public static void calculateShippingCost(int cost){
	
	if(cost > 5000){
		System.out.println(" Free shipping on this order......" );
	}
	else if(cost >= 2000 && cost <= 5000){
		System.out.println(" Shipping cost is Rs 100 on this order...... " );

	}
	else{
		System.out.println(" Shipping cost is Rs 200 on this order...... " );

	}
}

public static void main(String [] args){
	
	ShippingCost.calculateShippingCost(100);
	ShippingCost.calculateShippingCost(3000);
	ShippingCost.calculateShippingCost(100000);



	}
}