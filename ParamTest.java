package learning;

public class ParamTest {
	
	public static void main(String[] args)
	{
		//test one: methods can't modify numeric parameters
		System.out.println("Testing triple value:");
		double percent = 10;
		System.out.println("Before: percent=" + percent);
		tripleValue(percent);
		System.out.println("After: percent=" + percent);

		//test two: methods can change the state of object parameters
		System.out.println("\nTesting tripleSalary");
		Employee owen = new Employee("owen", 50000);
		System.out.println("Before: salary=" + owen.getSalary());
		tripleSalary(owen);
		System.out.println("After: salary=" + owen.getSalary());

		//test three: method can't attach new objects to object parameters
		System.out.println("\nTesting swap");
		Employee a = new Employee("浥萱宝贝", 50000);
		Employee b = new Employee("许航爸爸", 50000)
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());
	}


	public static void tripleValue(double x)//don't work
	{
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}

	public static void tripleSalary(Employee x)//should work
	{
		x.raiseSalary(300);
		System.out.println("End of method: salary=" + x.getSalary());
	}

	public static void swap(Employee x, Employee y)
	{
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
	}

}

class Employee
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
		double  raise = salary * byPercent / 100;
		salary += raise;
	}
}
