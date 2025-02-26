import java.util.Scanner;
class prime_types 

{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n=sc.nextInt();
	/*for (int i=n+1;true ;i++ )
	{
			int count=0;
		for (int j=2;j<=i;j++ )
		{
			if (i%j==0)
			{
				count++;
			}
		}
		if (count==1)
		{
			System.out.println(i);
			break;
		}*/
		int sum=0;
		while (n!=0)
		{
			int temp=n%10;
			if (temp%2==0)
			{
				sum+=temp;
			}
			n/=10;
		}
		System.out.println(sum);
	}
}

