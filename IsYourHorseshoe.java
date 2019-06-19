import java.util.Scanner;

public class IsYourHorseshoe {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		
		int count=a<=b?(b<=c?(c<=d?3:2):1):0;
		System.out.println(count);
		}	
}
