package _14_Constructor_Employee;

public class Employee {

	//Properties
	
	public String name;
	double salary;
	int startYear;
	int birthYear;
	String department;
	
	
	//Constructor
	//A constructor is a method that has the same name as the class itself - it builds
	//our instances of objects of that class type
	public Employee(String name, double salary, int startYear, int birthYear, String department) {
		this.name = name;
		this.salary = salary;
		this.startYear = startYear;
		this.birthYear = birthYear;
		this.department = department;
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
