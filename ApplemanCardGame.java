import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ApplemanCardGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int n = scan.nextInt();
		String s = scan.next();
		int arr[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int z = s.charAt(i) - 'A';
			arr[z]++;
		}
		Arrays.sort(arr);
		BigInteger sum=BigInteger.ZERO;
		for (int i = arr.length-1; i >-1; i--) {
			long d=arr[i];
			if(n>=d) {
				sum=sum.add( BigInteger.valueOf(d).pow(2));
				n-=d;
			}else {
				sum=sum.add(BigInteger.valueOf( n).pow(2));
				break;
			}
		}
		System.out.println(sum.toString());
		
	}
}
