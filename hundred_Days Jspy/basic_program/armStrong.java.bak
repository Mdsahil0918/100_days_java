import java.util.Scanner;
class armStrong
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("ENTER THE first Nth number: ");
		int n=sc.nextInt();
		for (int temp=1;temp<=n ;temp++ )
		{
			int temp2=temp;
			int sum=0;
			int count=0;
		while (temp2!=0)
		{
			count++;
			temp2/=10;
		}
		temp2=temp;
		while (temp2!=0)
		{
			int multi=1;
			int dig=temp2%10;
			/*for (int i=1;i<=count ;i++ )
			{
				multi*=dig;
			}
			sum+=multi;*/
			sum+=Math.pow(dig,count);
			temp2/=10;
		}
			if (sum==temp)
		{
			System.out.println(temp+"  <-- IS A ARMSTRONG NUMBER");
		}
		}
		
	sc.close();

	}
}
