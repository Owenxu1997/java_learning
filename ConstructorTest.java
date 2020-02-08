package learning;
import java.util.*;
// this program demonstrates object construction.
// @version 1.0
// @author: Owen Xu
public class ConstructorTest
{
	public static void main(String[] args)
	{
		//create three staff members and fill them with information
		//but with different constructor
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Owen", 50000);
		staff[1] = new Employee(40000);
		staff[2] = new Employee();

		//print out information about all EMployee objects

		for(Employee e : staff)
		{
			System.out.println("name=" + e.getName() + ", id=" + e.getId() + 
				", salary=" + e.getSalary());
		}

	}
}

class Employee
{
	private static int nextId;

	private int id;
	private String name = " ";//instance field initialization
	private double salary;

	//static initialization block
	static
	{
		Random generator = new Random();
		//set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}

	//object initialization block
	{
		id = nextId;
		nextId++;
	}

	//three overload constructor
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}

	public Employee(double s)
	{
		//calls the Employee(String, double) constructor
		this("Employee #" + nextId, s);
	}

	//default constructor
	public Employee()
	{
		//name set to " "
		//id set in the object initialization block
		//salary set to default--0
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public int getId()
	{
		return id;
	}
}
