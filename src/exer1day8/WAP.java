package exer1day8;

import java.util.Scanner;

public class WAP {

	public static void main(String[] args) {
		System.out.println("Enter your gender: ");
		Scanner sc= new Scanner(System.in);
		String gender=sc.next();

	if (gender ==" Female") {
		System.out.println("\nEnter your income: ");
		double income = sc.nextInt();

			if ( income<=190000) {
			System.out.println("No tax payable.");
				} else if (income <= 500000 ) {
					double result= (income * (.10));
					System.out.println("Amount " + result  + "is your tax payable.");
				}else if (income<= 800000 ) {
					double result2= (income * (.20));
					System.out.println("Amount " + result2  + "is your tax payable.");
				}else if (income > 800000) {
					double result3= (income * .30);
					System.out.println("Amount " + result3  + "is your tax payable.");
			}
		
	System.out.println("Thanks for using my tax calculator");
		
	}else if (gender == "male");
		
		System.out.println("\nEnter your income: ");
		double income2 = sc.nextInt();
		
		 if ( income2<=180000) {
				System.out.println("No tax payable.");
			} else if (income2 <= 500000 ) {
					double result= (income2 * (.10));
					System.out.println("Amount " + result  + "is your tax payable.");
			}else if (income2<= 800000 ) {
				double result2= (income2 * (.20));
				System.out.println("Amount " + result2  + "is your tax payable.");
		}else if (income2 > 800000) {
					double result3= (income2 * .30);
					System.out.println("Amount " + result3  + "is your tax payable.");
			
	}
	System.out.println("Thanks for using my tax calculator");
			
	
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
