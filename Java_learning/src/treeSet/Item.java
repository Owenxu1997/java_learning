package treeSet;
import java.util.*;
/**
 * an item with a description and a part number
 * @author owenxu
 *
 */

public class Item implements Comparable<Item>
{
	private String description;
	private int partNumber;
	
	public Item(String aDescription, int aPartNumber)
	{
		description = aDescription;
		partNumber = aPartNumber;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String toString()
	{
		return "[description=" + description + ", part number=" + partNumber + "]";
	}
	
	public int getPartNumber()
	{
		return partNumber;
	}
	
	public boolean equals(Object otherObject)
	{
		if(this == otherObject) return true;
		if(otherObject == null) return false;
		if(this.getClass() != otherObject.getClass()) return false;
		Item other = (Item) otherObject;
		return Objects.equals(description, other.description) && partNumber == other.partNumber;
	}
	
	public int hashCode()
	{
		return Objects.hash(description, partNumber);
	}
	
	public int compareTo(Item other)
	{
		return Integer.compare(partNumber, other.partNumber);
	}
	
	
}
