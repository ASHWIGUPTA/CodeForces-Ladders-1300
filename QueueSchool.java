import java.util.Scanner;

public class QueueSchool {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		char b[] = scan.next().toCharArray();
		while (t >0) {
			for (int i = 0; i < b.length - 1; i++) {
				if (b[i] == 'B' && b[i + 1] == 'G') {
					
					b[i] = (char) (b[i] ^ b[i + 1]);
					b[i + 1] = (char) (b[i] ^ b[i + 1]);
					b[i] = (char) (b[i] ^ b[i + 1]);
				i++;
				}
			}
			t--;

		}
		String r="";
		for (int i = 0; i < b.length; i++) {
			r=r+b[i];
		}
		System.out.println(r);
	}
}
