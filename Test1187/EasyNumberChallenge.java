package Test1187;

import java.math.BigInteger;
import java.util.Scanner;
 
public class EasyNumberChallenge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();	
		int j=in.nextInt();	
		int m=in.nextInt();	
		int mod=1073741824;
		BigInteger sum=BigInteger.ZERO;
		for (int i = 1; i <= n; i++) {
				for (int k = 1; k <= j; k++) {
					for (int l = 1; l <= m; l++) {
						BigInteger r=BigInteger.valueOf(i).multiply(BigInteger.valueOf(k).multiply(BigInteger.valueOf(l)));
					//	System.out.println(sum.toString()+" i: "+i+"jk: "+k+"l: "+l+" r "+r.toString());
						
						sum=sum.add(BigInteger.valueOf(div(r.intValue())));
				//		System.out.println(sum.toString()+" sum");
					sum=sum.mod(BigInteger.valueOf(mod));
					
					}}		
				
			}
		System.out.println(sum.toString());
	}
	static long div(int n) 
    { long c=0;
        for (int i=1;i<=n;i++) 
            if (n%i==0) 
               c++; 
    
        return c;
    } 
 
}