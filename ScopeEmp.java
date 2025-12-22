// create a class Employee with member variables like name , id and salary . Write methods to update and display the values  of these variables.

public class ScopeEmp {
	// instance variable 

	String name;
	int id ;
	int salary;

// update method 	
void updateDetails(String empName,int  empId,int  empSalary){
	name = empName;
	id = empId;
	salary = empSalary;	
}


// method to display details
void display(){
	System.out.println("Emp name is : " + name);
	System.out.println("Emp id is : " + id);
	System.out.println("Emp salary is  : " + salary);
        System.out.println("-----------------------------");



}

	
public static void main(String [] args){
	
	ScopeEmp emp1 = new ScopeEmp();

	//update
	emp1.updateDetails("Deewan" , 88, 400000); 

	emp1.display();

	}
}