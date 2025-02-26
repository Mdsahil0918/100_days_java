 class even_words {
public static void even_word(String s) {
	String[] s1=s.split(" ");
			for (int i=0;i<=s1.length-1;i++)
			{
				if(i%2==0)
				{
					System.out.print(s1[i]+" ");
				}
			}
}
public static void isempty(String s) {
	if (s.isEmpty())
	{
		System.out.println("null in put is not accepted , please provide a input");
	}
}
public static void main(String[] args) {
	String str=" hi i am sahil from jbiet and now , i am in jspyders ";
	isempty(str);
	even_word(str);	}
}
 