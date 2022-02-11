package day7;

public class DemoD7{
	public void add (int num1, int num2) {
		System.out.println("Adding two numbers"+ (num1+num2));
	}
	public void add1 (String num11, String num12) {
		System.out.println("Adding two numbers"+ (num11+num12));
	}
	public void add (int num1, String num2) {
		System.out.println("Adding two numbers"+ (num1+num2));
	}
	public void add (String firstName,String lastName) {
		System.out.println("Adding two numbers"+ (firstName + lastName));
	}
public static void main (String []args) {
	DemoD7 d= new DemoD7();
	d.add(10,10);
	d.add(10,"10");
	d.add1("Kami", "Ruebush");
	
	System.out.println(90);
	System.out.println(true);
	System.out.println("HEloo");
	
}
}