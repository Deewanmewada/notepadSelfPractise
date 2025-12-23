// order tracking - write a method  trackOrder(int orderId) that simulates fetching the current status of an order.

public class TrackOrder{

// method 
public static void trackOrder(int orderId) {

	if (orderId == 101) {
            System.out.println("Order ID " + orderId + ": Order Placed");
        }
        else if (orderId == 102) {
            System.out.println("Order ID " + orderId + ": Shipped");
        }
        else if (orderId == 103) {
            System.out.println("Order ID " + orderId + ": Out for Delivery");
        }
        else if (orderId == 104) {
            System.out.println("Order ID " + orderId + ": Delivered");
        }
        else {
            System.out.println("Order ID " + orderId + ": Invalid Order ID");
        }
}

public static void main(String [] args){
		trackOrder(101);
		trackOrder(102);
		trackOrder(103);
	}
}