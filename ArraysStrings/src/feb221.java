public class feb221 {
    public static void main(String[] args) {
    	
        // 1. Prime Number Check
        /*int[] a = {2, 3, 8, 87, 17, 34};
        for (int i = 0; i < a.length; i++) {
            boolean isprime = true;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(a[i]);
            }
        }*/
    	

        // 2. Sum of First and Last Element
    	
    	
        /*int[] a={2,4,7,88,55,3};
         * int sum = a[0] + a[a.length - 1];
        System.out.println("Sum of first and last element: " + sum);
        
        

        // 4. Strong Number Check
       
       
        int[] strong = {145, 454, 656, 24};
        for (int i = 0; i < strong.length; i++) {
            int prod = 1;
            int temp = strong[i];
            int org = temp;
            int sumStrong = 0;
            while (temp != 0) {
                int dig = temp % 10;
                prod = 1; // Reset prod for each digit
                for (int j = 1; j <= dig; j++) {
                    prod *= j;
                }
                sumStrong += prod;
                temp /= 10;
            }
            if (sumStrong == org) {
                System.out.println("This is a Strong Number: " + org);
            } else {
                System.out.println(org + " is not a strong number");
            }
        }*/
    }
}

