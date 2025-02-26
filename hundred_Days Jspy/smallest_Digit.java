import java.util.Scanner;

class smallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a digit : ");
        int n = sc.nextInt();
        int sd = 9;
            int temp = n;
            while (temp > 0) {
                int d = temp % 10;
                if (d<sd) {
                    sd = d;
                }
                temp /= 10;
            }
            System.out.println(sd);
    }
}