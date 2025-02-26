import java.util.Scanner;
class array2
{
	public static void main(String[] args) 
	{
		int[] a={1,3,5,7};
		int[] b={2,4,6,8,44};
		int []c= new int[a.length+b.length];
		for (int i=0;i<c.length ;i++ )
		{
			if (i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-a.length];
			}
		}
		for (int i=0;i< c.length;i++ )
			{
				System.out.println(i+" --> "+c[i]);
			}
			}


		/*Scanner sc= new Scanner(System.in);
		System.out.print("enter the size of array :");
		int size=sc.nextInt();
		int [] a= new int[size];
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.println("ENTER the value at index : "+i);
			a[i]=sc.nextInt();
		}
		for (int i=1;i<=a.length-1 ;i++ )
		{
				if (i%2==0 && 
					a[i]%2!=0)
				{
					System.out.println(a[i]);
				}
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array :");
		int size=sc.nextInt();
		int [] a= new int[size];
		//int[] a={1,2,3,4,6};
		int sum=0;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.println("ENTER the value at index : "+i);
			a[i]=sc.nextInt();
		}
		for (int i=0;i<=a.length-1 ;i++ )
		{
			sum+=a[i];
			//sum=sum+a[i];
		}
		System.out.println("the sum of numbers on array is : "+sum);*/
}
