//this java program is for demonstrate the features of ragged array
//Owen Xu 2020.2.3

package learning;

public class LotteryArray {
	
	public static void main(String[] args)
	{
		final int NMAX = 10;
		
		//allocate triangular array
		
		int[][] odds = new int[NMAX + 1][];
		for (int n = 0; n <= NMAX; n++)
			odds[n] = new int[n + 1];
		
		//fill triangular array
		
		for (int n = 0; n < odds.length; n++)
			for(int k = 0; k < odds[n].length; k++)
			{
				int lotteryOdds = 1;
				for(int i = 1; i <= k; i++)
					lotteryOdds = lotteryOdds * (n - i + 1) / i;
				
				odds[n][k] = lotteryOdds;
			}
		
		for(int[] row : odds)
		{
			for (int odd : row)
				System.out.printf("%5d", odd);
			System.out.println();
		}
	}

}
