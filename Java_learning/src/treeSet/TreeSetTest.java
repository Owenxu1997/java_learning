package treeSet;
import java.util.*;
/**
 * this program demonstrates the tree set
 * @version 2020-3-2
 * @author owenxu
 *
 */

public class TreeSetTest 
{
	public static void main(String[] args)
	{
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("iPhone", 1234));
		parts.add(new Item("iPad", 1235));
		parts.add(new Item("Macbook Pro", 1236));
		System.out.println(parts);
		
		SortedSet<Item> sortByDescription = new TreeSet<Item>(new
				Comparator<Item>()
				{
					public int compare(Item a, Item b)
					{
						String descrA = a.getDescription();
						String descrB = b.getDescription();
						return descrA.compareTo(descrB);
					}
				});
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}
