import java.util.Scanner;

public class PetrAndBook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int i=0;
		while(n>0) {
			for (i = 0; i < arr.length; i++) {
			n=n-arr[i];
			if(n<=0) {
				break;
			}
			}	
			
		}
		System.out.println(i+1);

	}
}
