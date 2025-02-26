import java.util.Scanner;
class sunnyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the nth prime: ");
		int n=sc.nextInt();
		boolean issunny=false;
		n++;
		for (int i=1;i*i<=n ;i++ )
		{
			if(i*i==n)
			{
				issunny=true;
			}
		}
		if( issunny==true)
			{
				System.out.println("is Sunny");
			}
			else{
				System.out.println("Not Sunny");
			}
	}
}

