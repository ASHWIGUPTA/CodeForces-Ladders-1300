import java.util.Scanner;

public class JeffDigits {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = 0, f = 0;
		for (int i = 0; i < n; i++) {
			int c = scan.nextInt();
		//	System.out.println(c+" dd");
			if (c == 0)
				r++;
			else if (c == 5)
				f++;
		}
		//System.out.println(r+" "+f);
		
		if(r==0)
			{System.out.println("-1");
			//return;
			}	
		else if(f<9) {
			System.out.println(0);
		}else {
			f=f-f%9;
			for (int i = 0; i <f; i++) {
				System.out.print(5);
			}	for (int i = 0; i <r; i++) 
					System.out.print(0);
					
		}
	}
	
}
