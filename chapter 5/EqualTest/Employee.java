package equals;
import java.util.*;

public class Employee 
{
	private String name;
	private double salary;
	private Date hireDay;
	
	//constructor
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		hireDay = calendar.getTime();
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public Date getHireDay()
	{
		return hireDay;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public boolean equals(Object otherObject)
	{
		//check if the objects are identical
		if (this == otherObject) return false;
		//return false if the explicit parameter is null
		if (otherObject == null) return false;
		//if they are not same class
		if (getClass() != otherObject.getClass()) return false;
		
		Employee other = (Employee) otherObject;
		return Objects.equals(name, other.name) && salary == other.salary &&
				Objects.equals(hireDay, other.hireDay);
	}
	
	public int hashCode()
	{
		return Objects.hash(name, salary, hireDay);
	}
	
	public String toString()
	{
		return getClass().getName() + "[name=" + name + ", salary="
				+ salary + ", hireDay=" + hireDay + "]";
	}
}
