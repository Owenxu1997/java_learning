package interfaces;


public class Employee implements Comparable<Employee>
{
	private String name;
	private double salary;
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	/**
	 * compares employees by salary
	 * @param other another Employee object
	 * @return a negative value if this employee's salary is lower than
	 * otherObject, 0 if the same, a positive value if larger
	 */
	
	public int compareTo(Employee other)
	{
		return Double.compare(salary, other.salary);
	}
}
