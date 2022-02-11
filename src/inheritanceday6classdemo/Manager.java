package inheritanceday6classdemo;

public class Manager extends Employeee{
	String departmentName;
	int salary = 18000;
	
	public Manager () {
		System.out.println("Manager default constructor");
	}
	
	public Manager(String departmentName) {
		super();
		System.out.println("Manager parametrized constructor");
		this.departmentName = departmentName;

	}
	
	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("Manager parametrized from superclass");
		
	}
	
	public void displayManagerDetails () {
		System.out.println("Manager ID: "+ employeeId);
		System.out.println("Manager name: "+ employeeName);
		System.out.println("Department Name: "+ departmentName);
		System.out.println("Local Salary: "+ salary);
		System.out.println("Manager Salary: "+ this.salary);
		System.out.println("Employee Salary: "+ super.salary);
		
		
}
		
	
}
