import java.util.Scanner;

public class Translation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String b=scan.next();
	String r="";
	for (int i = 0; i < b.length(); i++) {
		r=b.charAt(i)+r;
	}
	String z=scan.next();
	if(r.equals(z)) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	}
}
