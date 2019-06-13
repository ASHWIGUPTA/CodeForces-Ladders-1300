import java.util.Scanner;

public class Word {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String p=scan.next();
	int count=0;
	for(int i=0;i<p.length();i++) {
		char a=p.charAt(i);
		if(a>=65 && a<=90) {
			count++;
		}
	}
	if(p.length()/2>=count) {
		System.out.println(p.toLowerCase());
	}else {
		System.out.println(p.toUpperCase());
	}
}
}


/*
 * import java.util.Scanner;
 * 
 * public class Word { public static void main(String[] args) { Scanner scan =
 * new Scanner(System.in); String p=scan.next(); int count=0,z=0; for(int
 * i=0;i<p.length();i++) { char a=p.charAt(i); if(a>=65 && a<=90) { count++;
 * }else if(a>=97 && a<=122) { z++; } } if(p.length()/2==count &&
 * p.length()/2==z) { System.out.println(p.toLowerCase()); }else {
 * System.out.println(p.toUpperCase()); } } }
 */