import java.util.Scanner;
class autoMorpic 

{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=sc.nextInt();
	boolean isauto=false;
	int s=n*n;
	int org=n;
	while (s!=0)
	{
		if (s%10==n%10)
		{
			isauto=true;
		}
		n/=10;
		s/=10;
	}
	if (isauto)
	{
		System.out.println(org+" is autoMorhic number.");
	}
	else {
		System.out.println(org+" is not autommorphic ");
	}
	}
}
