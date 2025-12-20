// write a program to use the instance and static variable and display the deatails. Instance variable can be employee detail like name , age  and department . use company code as static  variable . Display  the deatils in the console.

public class CompanyEmpDeatails {

		// static variable 
		static int companyCode = 466001;


		//instance variables
		String name ;
		int age;
		String deparment;

		// constructor : is special metod that is called at the time of object created.
		CompanyEmpDeatails(String name, int age, String deparment){
		this.name = name;
		this.age = age;
		this.deparment = deparment;
		}

		// display method 
		void display(){
			System.out.println("Employee name is : "  + name);
			System.out.println("Employee age is : " + age);
			System.out.println("Employee deparment is: " +  deparment);

			System.out.println("company code is : " + CompanyEmpDeatails.companyCode);
			System.out.println("----------------");

			


		}
		

		


	public static void main(String [] args){
		CompanyEmpDeatails emp1 = new CompanyEmpDeatails("Deewan" , 23, "javaDevelopment");
		CompanyEmpDeatails emp2 = new CompanyEmpDeatails("Rahul" , 23, "javaDevelopment");

		emp1.display();
		emp2.display();
		
		
	}
}
