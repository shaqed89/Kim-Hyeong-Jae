class ForEX4 
{
	public static void main(String[] args) 
	{
		System.out.println("������");
		for(int i=1;i<=9; i+=3){
			for(int a=1; a<=9 ;a++){
				for(int b=i; b<=i+2; b++){
					if(a==1){
						System.out.print("=="+b+"��==\t");
						}else{
							System.out.printf("%d*%d=%d\t",b,a,b*a);
							
					}
					
				}
				System.out.print("\n");
			}
		
		}

	}
}

					
	