// write a program to determine if a number is divisible by both 3 and 5 using logical and relational operators ?


public class CheckDivisible {
	public static void main(String[] args){
		int num = 15;

		if((num % 3 == 0) && (num % 5 == 0 )){
            		System.out.println("Number is divisible by both 3 and 5");
		}
		else{
            		System.out.println("Number is NOT divisible by both 3 and 5");

		}

		
	}
}