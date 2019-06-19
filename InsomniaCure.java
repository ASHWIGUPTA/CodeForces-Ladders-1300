import java.util.Scanner;

public class InsomniaCure {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int k=scan.nextInt();
	int l=scan.nextInt();
	int m=scan.nextInt();
	int n=scan.nextInt();
	int d=scan.nextInt();
	boolean [] a=new boolean[d];
	int count=d;
	for(int i=0;i<=a.length;i++) {
		if(i%k!=0&&i%l!=0&&i%m!=0&&i%n!=0) {
	//System.out.println(i);
			count--;
		}
		
	}
	System.out.println(count);
	}
}
