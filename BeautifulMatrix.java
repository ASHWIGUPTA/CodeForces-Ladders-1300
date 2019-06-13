import java.util.Scanner;

public class BeautifulMatrix {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
int p=0;
	for (int j = 0; j < 5; j++) {
	for (int j2 = 0; j2 < 5; j2++) {
		if(1==scan.nextInt()) {
			
			p=Math.abs(2-j2)+Math.abs(2-j);
		}
		
	}
	}

System.out.println(p);
}
}
