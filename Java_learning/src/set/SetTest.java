package set;
import java.util.*;
/**
 * this program uses set to print out the amount of unique words in a file
 * @version 1.0 2020-3-2
 * @author owenxu
 *
 */

public class SetTest {
	public static void main(String[] args)
	{
		Set<String> words = new HashSet<>();//HashSet implements Set
		long totalTime = 0;
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime += callTime;
		}
		
		Iterator<String> iter = words.iterator();
		for(int i = 0; i < 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		System.out.println("...");
		System.out.println(words.size() + " unique words, " + totalTime + " miliseconds used.");
	}

}
