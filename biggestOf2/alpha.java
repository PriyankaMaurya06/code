package biggestOf2;

public class alpha {
	public static void main(String[] args)
	{
		char ch = 'h';
		String chr=getAlpha(ch);
		System.out.println(ch+" is "+chr);
	}

	public static String getAlpha(char a)
	{
		return (a>='a'&& a<='z') || (a>= 'A' && a<='Z')? "Alphabet." : "Not an alphabet.";
	}
}
