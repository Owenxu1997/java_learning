package linkedList;
import java.util.*;
/**
 * this program demonstrates the linked list
 * @versin 1.0 2020-2-27
 * @author owenxu
 *
 */

public class LinkedListTest 
{
	public static void main(String[] args)
	{
		List<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Owen");
		
		List<String> b = new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		//merge the words from b to a
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while(bIter.hasNext())
		{
			if(aIter.hasNext()) aIter.next();
			aIter.add(bIter.next());
		}
		
		System.out.println(a);
		
		//remove every second word from b
		bIter = b.iterator();
		while(bIter.hasNext())
		{
			bIter.next();
			if(bIter.hasNext())
			{
				bIter.next();
				bIter.remove();
			}
		}
		System.out.println(b);
	}

}
