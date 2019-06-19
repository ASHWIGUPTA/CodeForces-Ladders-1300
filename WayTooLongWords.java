import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int i=scan.nextInt();
	for (int j = 0; j < i; j++) {
		String w=scan.next();
		if(w.length()>10) {
			System.out.println(w.charAt(0)+""+(w.length()-2)+""+w.charAt(w.length()-1));
		}else {
			System.out.println(w);
		}
	}
	}
}
