public class feb221_2 {
	    
	    public static void compareArrayLengths(int[] arr1, int[] arr2) {
	        if (arr1.length == arr2.length) {
	            System.out.println("Arrays have the same length.");
	        } else {
	            System.out.println("Arrays have different lengths.");
	        }
	    }

	    public static void sumEquals(int[] arr1, int[] arr2) {
	        int sum1 = 0;
	        int sum2 = 0;

	        for (int i = 0; i < arr1.length; i++) {
	            sum1 += arr1[i];
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            sum2 += arr2[i];
	        }

	        if (sum1 == sum2) {
	            System.out.println("Sum of both arrays are equal.");
	        } else {
	            System.out.println("Sum of both arrays are not equal.");
	        }
	    }

	    public static void countEvenNumbers(int[] arr) {
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {
	                count++;
	            }
	        }
	        System.out.println("Even numbers in the array: " + count);
	    }

	    public static void compareEvenCounts(int[] arr1, int[] arr2) {
	        int evenCount1 = 0;
	        int evenCount2 = 0;

	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] % 2 == 0) {
	                evenCount1++;
	            }
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            if (arr2[i] % 2 == 0) {
	                evenCount2++;
	            }
	        }

	        if (evenCount1 == evenCount2) {
	            System.out.println("Both arrays have the same number of even numbers.");
	        } else {
	            System.out.println("Both arrays have different number of even numbers.");
	        }
	    }
	
	public static void main(String [] args) {
	        int[] array1 = {1, 2, 3, 4, 5, 6};
	        int[] array2 = {2, 4, 6, 8};

	        compareArrayLengths(array1, array2);
	        sumEquals(array1, array2);
	        countEvenNumbers(array1);
	        compareEvenCounts(array1, array2);
	    }
		//5.merge 2 arrays if the number at a[i] is even if not dont merge 
		
		/*int[] a= {1,2,4,6,73,85};
		int[] b = {33,66,84,2,4,};
		int [] c= new int[a.length+b.length];
		int index=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
				{
					c[index]=a[i];
					index++;
				}
		}
		for (int i=0;i<b.length;i++)
			{
				if(b[i]%2==0)
				{
					c[index]=b[i];
					index++;
				}
			}
		for (int i=0;i<index;i++) 
		{
			System.out.println(c[i]);	
		}*/
		

		
	
}
