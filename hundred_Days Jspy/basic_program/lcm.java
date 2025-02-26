class lcm 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=35;
		for (int i=1;true ;i++ )
		{
			int prod=1;
			if((a*i)%b==0)
			{
				System.out.println(a*i);
				break;
			}

		}
	}
}
