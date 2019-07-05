import java.util.Scanner;

public class BigSegment {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int r=-1;
	for (int i = 0; i < n; i++) {
		int k=scan.nextInt();
		int l=scan.nextInt();
		if(k<=min && l>=max) {
			min=k;
			max=l;
			r=i+1;
		}else if(k<min) {
			min=k;
			r=-1;
		}else if(l>max) {
			r=-1;
			max=l;
		}
		
	}
	System.out.println(r);
	}
	
}
