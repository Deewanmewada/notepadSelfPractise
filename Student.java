public class Student{
	// static variable
	static String schoolName = "Oxford" ;

	// instance variable
	String name;
	int rollNum;
	int marks;

	// constructor
	Student(String name , int rollNum, int marks){
	this.name = name;
	this.rollNum = rollNum;
	this.marks =  marks;
	}
	
	// method 
	void display(){
		System.out.println("student name is : "  + name);
		System.out.println("student rollNum is : "  + rollNum);
		System.out.println("student marks is : "  + marks);
		System.out.println("School name is : "  + Student.schoolName);
		System.out.println("------------------------------ " );




	}
	
	public static void main(String [] args){
		Student s1 = new Student("Deewan" , 20, 99);
		Student s2 = new Student("Ram" , 20, 99);

		s1.display();
		s2.display();
	}
}