package inheritanceday6classdemo;

public class Employeee {
	int employeeId;
	String employeeName;
	int salary=9000;
	
	public Employeee() {
		System.out.println("Employee default constructor");
	}
	
	public void submitDocuments () {
		System.out.println("Submitting documents");
	}
	
	public Employeee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
