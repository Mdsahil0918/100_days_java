class uniqueNum 
{
	public static void main(String[] args) 
	{
		boolean unique=true;
		int n=4793;
		int org=n;
		while(n!=0)	
		{
			int temp=n%10;
			n/=10;
			int temp2=n;
			while(temp2!=0)
			{
				int temp3=temp2%10;
				if (temp2==temp3)
				{
					unique=false;
				}
			}
		}
		if(unique)
		{
			System.out.println("is Unique");
		}
	}
}
