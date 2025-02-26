class reverse_string {
	public static void isempty(String s) {
		if (s.isEmpty())
		{
			System.out.println("null in put is not accepted , please provide a input");
		}
	}
public static void main(String[] args) {
	String s="sahil";
	isempty(s);
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		char c= s.charAt(i);
		rev=rev+c;
	}
	System.out.println(" Reverse  of "+s+" is "+rev);
	
	if(s.equals(rev)) {
		System.out.println("it is palindrom ");
	}
}
}