class strongNum
{
	public static void main(String[] args) 
	{
		for (int j=1;j<150;j++ )
		{
		int org= j;
		int sum=0;
		int dig=j;
		while(dig!=0)
		{	
			int temp=dig%10;
			int prod=1;
			for (int i=1;i<=temp ;i++ )
			{
				prod*=i;
			}
				sum+=prod;
			dig/=10;
		}
		if (sum==org)
		{
			System.out.println(sum+ "is StrongNum");
		}

		}
	
	}
}
