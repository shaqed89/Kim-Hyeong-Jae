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

		
		
		

		System.out.printf("%4s%4s%4s%4s%4s\n","����","����","����","�հ�","���");
		for (int row=0; row<jumsu.length; row++)
		{
			int sum=0;
			for (int col=0; col<jumsu[row].length; col++)
			{
				System.out.printf("%6d",jumsu[row][col]);
				sum+=jumsu[row][col]; // �հ�
			}
			double ave=(double)sum/(jumsu.length); //���
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
����
����	����	����	�հ�	���
50	90	12	-	-
70	80	50	-	-
60	70	33	-	-
*/