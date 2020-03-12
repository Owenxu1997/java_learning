package map;
import java.util.*;
/**
 * this program demonstrates the use and operations of Map
 * @version 1.0 2020-3-6
 * @author owenxu
 *
 */

public class MapTest
{
	public static void main(String[] args)
	{
		Map<String, Employee> staff = new HashMap<>();
		staff.put("123", new Employee("Owen", 1));
		staff.put("321", new Employee("Jack", 2));
		staff.put("469", new Employee("Daniel", 3));
		System.out.println(staff);
		
		//移除一个元素
		staff.remove("321");
		System.out.println(staff);
		
		//替换321的值
		staff.put("321", new Employee("Kyrie", 12));
		
		//查找123的值
		System.out.println(staff.get("123"));
		
		//迭代
		for(Map.Entry<String, Employee> entry : staff.entrySet())
		{
			String key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}
}

class Employee
{
	private String name;
	private int id;
	
	public Employee(String n, int i)
	{
		name = n;
		id = i;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	@Override
	public String toString()
	{
		return "[name=" + name + ", id=" + id + "] ";
	}
}
