package _14_Constructor_Employee;

public class Photographer extends Employee{

public String cameraType;
	
	public Photographer(String name, double salary, int startYear, int birthYear, String department, String cameraType) {
		super(name, salary, startYear, birthYear, cameraType);
		this.cameraType = cameraType;
	}
	
	
}
