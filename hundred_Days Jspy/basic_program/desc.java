class desc 
{
	public static void main(String[] args) 
	{
		int m=654654;
		int des=0;
		for (int i=0;i<=9 ;i++ )
		{
			int n=m;
			while (n!=0)
			{
				int dig=n%10;
				if (dig==i)
				{
				des=des*10+dig;
				}
			n/=10;
			}
		}
		System.out.println(des);
	}
}
