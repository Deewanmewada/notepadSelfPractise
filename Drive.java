//check driving eligibility(eg age > 18 && age < 70);

public class Drive {
	public static void main(String args[]){
		int age = 50;
		
		if((age >= 18) && (age <= 70 )){
			System.out.println("yes , you are eligiable to drive  ");
		}
		else{
			System.out.println("Not");
		}
	}
}