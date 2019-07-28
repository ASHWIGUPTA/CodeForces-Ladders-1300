import java.util.Scanner;

public class Chips {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	int k=scan.nextInt();
	int sum=n*(n+1)/2;
	int r=k%sum;
	//	System.out.println(r);
	for (int i = 1; i < n+1; i++) {
		if(r<i) 
			break;
		r=r-i;
	}
	System.out.println(r);
	}
}
