class neonNUm 
{
	public static void main(String[] args) 
	{
		/*int n=5;
		int sq=n*n;
		int sum=0;
		while (sq>0)
		{
			int dig=sq%10;
			sum+=dig;
			sq/=10;
		}
		if (sum==n)
		{
			System.out.println(sum+" "+n);
		}*/
		int n=625;
		for (int i=1; true;i++ )
		{
			if(i*i==n)
			{
				System.out.println("perfect SQ : "+i*i);
				break;
			}
		}
	}
}
