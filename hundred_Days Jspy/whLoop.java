class whLoop 
{
	public static void main(String[] args) 
	{//spy number
		int nums=339l;
		int sum=0;
		int pro=1;
		int num=nums;
		while(num!=0)
		{
			int n = num%10;
			sum+=n;
			pro*=n;
			num=num/10;
		}
		if (sum==pro)
		{
			System.out.println("Spy number "+nums);
		}
		else{
			System.out.println("not spy number");
		}
		
	/*	int i=123;
		int pro=1;
		while(i!=0)
		{
			int num=i%10;
			pro*=num;
			i=i/10;
				System.out.println(pro);
		}
	
		while (i<5)
		{
			System.out.println("hi ");
			i++;
		}
		for(;i<=7;){
			System.out.println(i++);
			i++;
		}*/

		/*sum of each number is the i=455 ie 4+5+5
		int sum=0;
		while(i!=0){
			int num=i%10;
			sum+=num;
			i=i/10;
		}
		System.out.println("the sum of each number is "+sum);

		count of no of numbers in i 455=count:3
		int count=0;
		while (i!=0)
			count++;
			i/=10;
		}
		System.out.println("the count is"+count);*/
	}
}
