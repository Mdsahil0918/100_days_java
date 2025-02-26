class asci_sum {
	public static void isempty(String s) {
		if (s.isEmpty())
		{
			System.out.println("null in put is not accepted , please provide a input");
		}
	}
public static void main(String[] args) {
	int sum=0;
	String s="Java";
	isempty(s);
	for (int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		sum+=c;
		}
	System.out.println(sum);
}
}
