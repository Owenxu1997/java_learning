package pair1;
/**
 * this program demonstrates the generic class
 * @version 1.00 2020-2-23
 * @author owenxu
 *
 */

public class PairTest1 
{
	public static void main(String[] args)
	{
		String[] words = {"Owen", "a", "Henry", "loop"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());
	}

}

class ArrayAlg
{
	/**
	 * gets the minimun and the maximum of an array of strings
	 * @param a: an array of strings
	 * @return a pair of max and min value, or null if it's a null empty
	 */
	public static Pair<String> minmax(String[] a)
	{
		if (a == null || a.length == 0) return null;
		String min = a[0];
		String max = a[0];
		for(int i = 0; i < a.length; i++)
		{
			if(min.compareTo(a[i]) > 0) min = a[i];
			if(max.compareTo(a[i]) < 0) max = a[i];
		}
		
		return new Pair<>(min, max);
	}
}

