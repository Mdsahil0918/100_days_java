class fibonacci_of_3_num 
{
	public static void main(String[] args) 
	{
		int a=0,b=0,c=1,sum=1;
			for (int i=1;i<=10 ;i++ )
			{
			System.out.print(b+",");
			a=b;
			b=c;
			c=sum;
			sum=a+b+c;
			}
			System.out.println();
	}
}
