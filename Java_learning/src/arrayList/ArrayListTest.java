package arrayList;
import java.util.*;
/**
 * this program demonstrates the arraylist class
 * @author owenxu
 *
 */

public class ArrayListTest 
{
	public static void main(String[] args)
	{
		//fill the staff array list with three Employee objects
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Styles", 60000, 1998, 11, 21));
		staff.add(new Employee("Owen Xu", 90000, 1997, 3, 14));
		
		//raise everyone's salary by 5%
		for (Employee e : staff)
		{
			e.raiseSalary(5);
			System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay="
					+ e.getHireDay());
		}
			
			
		
		//print out information of all employee objects
		
	}
}
