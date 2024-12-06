package biggestOf2;

public class vowel {
        public static void main(String[] args)
        {
        	char a ='E';
        	String b = getVowel(a);
        	System.out.println(b);
        	
        	
        }
        public static String getVowel(char a)
        {
        
        	String b=(a=='e'||a=='i'||a=='o'||a=='u'||a=='a'||a=='A'||a=='I'||a=='O'||a=='E'||a=='U')?"character is vowel":"character is  not vowel";
        
        	return b;
        }
        
}

