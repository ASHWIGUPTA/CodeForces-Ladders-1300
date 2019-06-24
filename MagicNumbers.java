import java.util.Scanner;

public class MagicNumbers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String b=scan.next();
	while(b.length()!=0) {
		if(b.indexOf("144")==0) {
			b=b.substring(3);
		}else if(b.indexOf("14")==0) {
			b=b.substring(2);
		} else if(b.indexOf("1")==0) {
			b=b.substring(1);
		}else {
			break;
		}
	}
	if (b.length()==0) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
}
}
