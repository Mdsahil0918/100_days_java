//n prime , check sum of digit in given is amstrong or not ,wptp next perfect number of  gievn no,nth fibinochi number ,
import java.util.Scanner;
class nprime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("ENTER THE NUMBER: ");
		int n = sc.nextInt();
		int count=0;
		//nth prime number
		for (int i=2;i<n ;i++ )
		{
			boolean isprime=true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					isprime=false;
					break;
				}

			}
			if (count<=n)
			{
			
			if (isprime)
			{
				System.out.println(i);
			}

		}
	}
}
