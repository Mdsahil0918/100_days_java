class reverse_string {
	public static void isempty(String s) {
		if (s.isEmpty())
		{
			System.out.println("null in put is not accepted , please provide a input");
		}
	}
	public static String reverses(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char c= s.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
		return rev;
	}
	public static void palindrom(String s,String rev) {
		if(s.equals(rev)) {
			System.out.println("it is palindrom ");
			}
		else {
            System.out.println("It is not a palindrome.");
            }
	}
	
	
public static void main(String[] args) {
	String s="color";
	
	isempty(s);
	String rev=reverses(s);
	palindrom(s,rev);
	}
}
