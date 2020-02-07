package learning;
import java.util.*;

public class Retirement {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money you want to make until retirement? ");
		double goal = in.nextDouble();
		
		System.out.print("How much money you earn every year? ");
		double earn = in.nextDouble();
		
		System.out.print("How much money you spent every year? ");
		double use = in.nextDouble();
		
		System.out.print("interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		double year = 0;
		
		while (balance < goal)
		{
			
			balance += earn - use;
			double interest = balance * interestRate / 100;
			balance += interest;
			year++;
			
		}
		System.out.print("you can retire in " + year + " years. ");
	}
}