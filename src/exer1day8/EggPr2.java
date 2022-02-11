package exer1day8;

import java.util.Scanner;

public class EggPr2 {
 
	public static void main(String[] args) {
		
		int dozen;
		int gross;
		int rem;
		
		System.out.println("How many eggs do you have? ");
		Scanner sc= new Scanner(System.in);
		int nume = sc.nextInt();
		
		gross = (nume/144);
		int rgross = (nume%144);
		
		dozen = (rgross/12);
		int rdozen = (12%nume);
		
		rem = (rgross % rdozen);
		
		System.out.println("gross is "+ gross + " dozen "+ dozen+ " remainder of eggs "+ rem);
		

	}

	

}
