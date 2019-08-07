class  Array2Ex
{
	public static void main(String[] args) 
	{
		int jumsu[][] = {{50,90,12},{70,80,50},{60,70,33}};

		for (int row=0; row<jumsu.length; row++)
		{
			for (int col=0; col<jumsu[row].length; col++)
			{
				System.out.printf("%5d",jumsu[row][col]);
			}
			System.out.println("\n");
		}

		
		
		

		System.out.printf("%4s%4s%4s%4s%4s\n","국어","영어","수학","합계","평균");
		for (int row=0; row<jumsu.length; row++)
		{
			int sum=0;
			for (int col=0; col<jumsu[row].length; col++)
			{
				System.out.printf("%6d",jumsu[row][col]);
				sum+=jumsu[row][col]; // 합계
			}
			double ave=(double)sum/(jumsu.length); //평균
			System.out.printf("%6d%8.2f\n",sum,ave);
		}
		System.out.println();
		

	}
}
/*
50 90 12
70 80 50
60 70 33
==========
실행
국어	영어	수학	합계	평균
50	90	12	-	-
70	80	50	-	-
60	70	33	-	-
*/