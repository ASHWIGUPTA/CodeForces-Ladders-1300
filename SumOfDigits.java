import java.math.BigInteger;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//	BigInteger n = new BigInteger(scan.next());
		String r=scan.next();
		long c=0;
		int p=0;
		if(r.length()<2)
			{System.out.println(0);
			return;}
		for (int i = 0; i < r.length(); i++) {
			c+=r.charAt(i)-"0".charAt(0);
		}p++;
		while(c>9) {
			String w=""+c;
			c=0;
			for (int i = 0; i < w.length(); i++) {
				c+=w.charAt(i)-48;
			}
			p++;
		}
		
		System.out.println(p);
		
		//int c = 0;
		/*
		 * while (n.compareTo(BigInteger.valueOf(9)) > 0) { BigInteger r = n; BigInteger
		 * temp = BigInteger.ZERO; while (r.compareTo(BigInteger.ZERO) > 0) { temp =
		 * temp.add(r.mod(BigInteger.valueOf(10))); r =
		 * r.divide(BigInteger.valueOf(10)); } n = temp; c++; }
		 */
		//System.out.println(c);

	}
		  
}
