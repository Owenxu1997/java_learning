package learning;


public class CompoundInterest {
	
	public static void main(String[] args)
	{
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		//给第一行利率赋值:10%-15%
		double[] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++ )
			interestRate[j] = (STARTRATE + j) / 100;
		
		double[][] balances = new double[NYEARS][NRATES];
		
		//将初始余额设置为10000
		for(int i = 0; i < balances[0].length; i++)
			balances[0][i] = 10000;
		
		//给剩余余额赋值
		for(int i = 1; i < balances.length; i++ )
		{
			for(int j = 0; j < balances[i].length; j++)
			{
				double oldBalances = balances[i-1][j];
				double interest = oldBalances * interestRate[j];
				balances[i][j] = oldBalances + interest;
			}
		}
		//打印一行利率
		for(int j = 0; j < interestRate.length; j++)
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		
		System.out.println();
		
		for(double[] row : balances)
		{
			for(double b : row)
				System.out.printf("%10.2f", b);
			System.out.println();
		}
		
	}

}
