package a;

public class Pattern {
public static void main(String[] args) {
	int j=5;
	boolean flag=true;
boolean r=false;
	for (int i = 0; i < 5; i++) {
		char star='*';
		char hash='#';
		if(i>=j/2&&!r) {
			star='#';
			hash='*';
		r=true;
		}
		if (flag) {
			for (int k = 0; k <=i%j; k++) {
				System.out.print(star+" ");
			}
			for (int k = i%j; k <j; k++) {
				System.out.print(hash+" ");
			}
		}else {
			for (int k = j; k >i%j; k--) {
				System.out.print(hash+" ");
			}
			for (int k = 0; k <=i%j; k++) {
				System.out.print(star+" ");
			}
			
			
		}
		flag=!flag;
		System.out.println();
	}
}
}
