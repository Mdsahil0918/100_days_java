import java.util.Scanner;
class auto 
{
	//AutomMorphic Number //
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number : ");
		int n=sc.nextInt();
		int org=n;
		int pro=0;
		while (n!=0)
		{
			int temp= n%10;
			pro+=temp*temp;
			n/=10;
		}
		if (pro==org)
		{
			System.out.println("I am Arm Stroong");
		}
		else{
			System.out.println("i am not strong ");
		}
		/*
		for (int i=1;i<=1000 ;i++ )
		{
			boolean isauto=true;
			int temp=i;
			int sq=temp*temp;
			while(temp!=0){
			if(temp%10!=sq%10)
			{
				isauto=false;
				break;
			}
			temp/=10;
			sq/=10;
			}
			if(isauto)
			{
				System.out.println(i);
			}

		}	*/

}
}
