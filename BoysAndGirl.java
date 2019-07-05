import java.util.Scanner;

public class BoysAndGirl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String r="";
		while(n!=0 && m!=0) {
			r=r+"GB";
		n--;
		m--;
		}
		while(m!=0) {
			r=r+"G";
			m--;
		}
		while(n!=0) {
			r=r+"B";
			n--;
		}
		
		System.out.println(r);
	}
}
