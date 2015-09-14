import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{	// This program calculates a quarterback's passer rating
		// Declaring variables
		double a;
		double b;
		double c;
		double d;
		double rating;
		// Getting the passer information
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of touchdowns:");
			double touchdowns = input.nextDouble();
		System.out.print("Enter total yards:");
			double totalYards = input.nextDouble();
		System.out.print("Enter number of interceptions:");
			double interceptions = input.nextDouble();
		System.out.print("Enter number of completions:");
			double completions = input.nextDouble();
		System.out.print("Enter number of passes attempted:");
			double passesAttempted = input.nextDouble();
		
		// Calculating the individual components of the formula
		// and testing to make sure they meet the constraints
		a = ((completions/passesAttempted)-.3)*5;
			if (a>2.375)
				a=2.375;
			else if (a<0)
				a=0;
			
		b = ((totalYards/passesAttempted)-3)*.25;
			if (b>2.375)
				b=2.375;
			else if (b<0)
				b=0;
			
		c = (touchdowns/passesAttempted)*20;
			if (c>2.375)
				c=2.375;
			else if (c<0)
				c=0;
			
		d = 2.375 - ((interceptions/passesAttempted)*25);
			if (d>2.375)
				d=2.375;
			else if (d<0)
				d=0;
			
		// Calculating and displaying the Passer Rating
		rating = ((a+b+c+d)/6)*100;
		System.out.printf("The passer rating is %3.1f",rating);
		
		
		
		
		
			
				
		
		
		
				}

}
