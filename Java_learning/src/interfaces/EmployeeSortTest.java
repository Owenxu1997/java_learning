package interfaces;
import java.util.*;
/**
 * this program demonstrates the use of interface
 * @date 2020-2-19
 * @author owenxu
 *
 */

public class EmployeeSortTest 
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Owen Xu", 80000);
		staff[1] = new Employee("Carl Hacker", 75000);
		staff[2] = new Employee("Tony Stark", 35000);
		
		Arrays.sort(staff);
		
		//print information about all Employee objects
		for(Employee e : staff)
			System.out.println("Name=" + e.getName() + ", salary=" + 
		e.getSalary());
	}
}
