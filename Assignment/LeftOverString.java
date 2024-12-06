package Assignment;

public class LeftOverString {

	public static void main(String[] args) {
		String a ="AABBCC";
		String b = "AB";
		String result=leftOverLetter(a,b);
		System.out.println(result);
		
	}
	public static String leftOverLetter(String A, String B)
	{
		String rs="";
		for(int i=0;i<A.length();i++)
		{
			char ch = A.charAt(i);
			if(B.indexOf(ch)==-1)
				rs=rs+ch;
		}
		return rs;
	}

}
