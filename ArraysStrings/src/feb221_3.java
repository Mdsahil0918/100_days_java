import java.util.Scanner;
public class feb221_3 {
	//code for find revserse a num and sum it and check if it is palindrom ir not 
	
	public static int reverseNum(int num ) 
	{
		int rev=0;
		while(num!=0)
		{
			int dig=num%10;
			rev=(rev*10)+dig;
			num/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number : ");
		int n = sc.nextInt();
		int temp=n;
		int iteration=0;
		boolean isdone=false;
		
		
		while(isdone==false)
		{
			int rev1=reverseNum(n);
			int sum=n+rev1;
			int rev2=reverseNum(sum);
			
			
			if(sum==rev2)
				{
					System.out.println(temp+" is plindrom at iteration "+iteration+" and the palindrome is "+sum);
					isdone=true;
				}
			else 
				{
					iteration++;
					n=sum;
				}
		} sc.close();
	}
}
