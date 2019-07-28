import java.math.BigInteger;
import java.util.Scanner;

public class EffectiveApproach {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			arr[scan.nextInt()-1] =i;
		}
		int q=scan.nextInt();
		
		BigInteger l=BigInteger.ZERO;
		BigInteger r=BigInteger.ZERO;
		
		for (int i = 0; i < q; i++) {
			int j=scan.nextInt();
		int temp=arr[j-1];
			l=l.add(BigInteger.ONE.add(BigInteger.valueOf(temp)));
			r=r.add(BigInteger.valueOf(a).subtract(BigInteger.valueOf(temp)));
			
		}
		
			
			/*
			 * int h=a-1; int j2=0;
			 */
			
			
			/*
			 * for (j2 = 0; j2 < arr.length; j2++,h--) { if(arr[j2]==j) break; if(arr[h]==j)
			 * break; } if(arr[j2]==j) { l=l+1+j2; r=r+a-j2; }else { l=l+h+1; r=r+a-h; }
			 */
		
		System.out.println(l+" "+r);
	}
}
