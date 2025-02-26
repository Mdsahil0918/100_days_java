import java.util.Scanner;
class  patterns
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = sc.nextInt();
		int sum=0,p=1,temp = num;

		while (temp>0)
		{
			int digit =temp%10;
			sum+=digit;
			p*=digit;
			temp/=10;
		}
		if (sum==p)
		{
			System.out.println(num+"is a spy number ");
		}
		else{
			System.out.println(num+"is not a spy number ");
		}

}
}
