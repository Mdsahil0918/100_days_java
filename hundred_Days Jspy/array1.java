import java.util.Scanner;
class array1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY : ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i=a.length-1;i>=0 ;i-- )
		{
			System.out.println("ENTER A NUMBER AT INDEX: "+i);
			a[i]=sc.nextInt();
		}
		for (int i=a.length-1;i>=0 ;i-- )
		{
			System.out.println(a[i]);
		}

		/*int[] a= new int[5];
		a[0]=3;
		a[2]=6
		a[1]=4;
		a[4]=8;
		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(a[2]);

		int[] s= new int[size];
	
		for (int i=0;i<=s.length-1;i++ )
		{
			System.out.println("enter a element in "+i);
			s[i]=sc.nextInt();
		}
		for (int i=0;i<s.length-1 ;i++ )
		{
			System.out.println(s[i]);
		}
*/

	}
}
