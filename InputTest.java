package learning;
import java.util.*;

public class InputTest {
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		
		//get first input
		System.out.print("whats your name? ");
		String name = in.nextLine();
		
		//get second input
		System.out.print("how old are you? ");
		String age = in.nextLine();
		
		//display on console
		System.out.println("Hello, " + name + ". Next year youre going to be "+ (age + 1));
	}
	
}


