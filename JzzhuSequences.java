import java.util.Scanner;

public class JzzhuSequences {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();	
		int y=in.nextInt();	
		int n=in.nextInt();	
		double arr[]=new double [100000001];
		arr[1]=x;
		arr[2]=y;
		for (int i = 3; i <=n; i++) {
			arr[i]= (arr[i-1]-arr[i-2])% 1000000007;
		}
		System.out.println((int)arr[n]);
	System.out.println(121%1000000007);
	System.out.println(-1%10);
	
	}
}
