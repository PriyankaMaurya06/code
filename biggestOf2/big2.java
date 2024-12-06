package biggestOf2;

public class big2 {
        public static void main(String[] args)
        {
        	int x = 33;
        	int y = 43;
        	int big = getBig(x,y);
            System.out.println("bigger from " +x+ " and " +y+ " is : " + big);
        }
        public static int getBig(int a, int b)
        {
        	return (a>b)?a:b;
        }
}
