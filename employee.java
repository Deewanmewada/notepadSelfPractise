// write a program to display empoyee details provide through command line arguments , ensuring  adhere to java name conventions ? 

public class employee {
	public static void main(String [] args){

		String employee_name = args[0];
		double  employee_id = Double.parseDouble(args[1]);
		int employee_salary = Integer.parseInt(args[2]);
		
		System.out.println("employee name  is : " + employee_name );
		System.out.println("employee id is : " + employee_id);
		System.out.println("employee salary is : " +  employee_salary);
		

	}
}