
public class string_dupilcate {
public static void main(String[]args) {
	String s="java";
	String s1="";
	for(int i=0;i<=s.length()-1;i++)
	{
		int count=0;
		char c=s.charAt(i);
		for (int j=0;j<=s.length()-1;j++)
		{
			if(s.charAt(j)==c) {
				count++;
			}
			
		}
		}
		if(count==2) {
		s1=s.charAt(j);}
		
		if(count==1) {
			s1+=s.charAt(j);
		}
		}
	System.out.println(s1);
}
}
