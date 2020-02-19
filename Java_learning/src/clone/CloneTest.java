package clone;
import java.util.*;
/**
 * this program demonstrates cloning
 * @date 2020-2-19
 * @author owenxu
 *
 */
public class CloneTest 
{
	public static void main(String[] args)
	{
		try
		{
			Employee original = new Employee("John Q. Public", 50000);
			original.setHireDay(2020, 1, 1);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2021, 2, 1);
			System.out.println("Original=" + original);
			System.out.println("Copy=" + copy);
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
