class alpha_numeric_Sort {
	public static void sort_char(String s)
	{
	int c_count=0;
	int s_count=0;
	for (int i=0;i<=s.length()-1;i++){
		char c= s.charAt(i);
		if(Character.isAlphabetic(c)) {
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='a'||c=='I'||c=='I'||c=='O'||c=='U')
			{
				c_count++;
			}
		}
		if(Character.isDigit(c)) {
			s_count++;
		}
	}
	System.out.println("The count of voswels is :"+c_count);
	System.out.println(" The count of digit  is :"+s_count);
	}
	
public static void main(String[] args) {
	String s="sahilkhan09";
	if (s.isEmpty()){
		System.out.println("String is empty no charecter in the String");
	}
	else {
		sort_char(s);
	}
}
}
