package day7;

public class WrapperClass {

	public static void main (String[] args) {
	
			int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);
		
		
		long salar1=91716;
		// Long is greater value then long because it is a class
		//Long salary2=917161;
		
		
		
		// Boxing is the process of converitn a primitive to oits wrapper class
			int grade=100;
			Integer newGrade= new Integer(grade);//boxing
			Integer newGrade2 = grade;//auto boxing
			
			Double budget = 945424.23;
			double budget1= Double.valueOf(budget);// unboxing <jdk1.5
			double budget2= budget; 		/// autounboxing
			
		
		
}
}
	