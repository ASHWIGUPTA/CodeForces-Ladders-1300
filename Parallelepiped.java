import java.util.Scanner;

public class Parallelepiped {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int a,b,c;
		 a=(int) Math.sqrt(x*y/z);
		 b=(int) Math.sqrt(z*y/x);
		 c=(int) Math.sqrt(x*z/y);
			System.out.println((a+b+c)*4);
	}
}
