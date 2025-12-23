// sample calculator 

public class Calcultor{

	public static int add(int a, int b){
		return a+b;
	}
	public static int subtraction(int a, int b){
		return a-b;
	}
	public static int multipication(int a, int b){
		return a+b;
	}

	public static int divide(int a, int b){
		return a/b;
	}



	public static void main(String [] args){
		Calcultor cal = new Calcultor();

		System.out.println(cal.add(5,5));
		System.out.println(cal.subtraction(5,5));
		System.out.println(cal.multipication(5,5));
		System.out.println(cal.divide(5,5));



		
		
	}
}