//1. what happen if the first condition in a logical AND (&&) operation is false ?

public class LogicalOperator{

public static void main(String [] args){
	int a = 5;
	int b = 10;
	
	if(a>b && b>a)
		System.out.println("True");
	}
}