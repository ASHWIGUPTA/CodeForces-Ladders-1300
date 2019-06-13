import java.util.Scanner;

public class PanoramixPrediction {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int j = scan.nextInt();
	int m=scan.nextInt();
	int w=0;
	for(int p=j+1;;p++) {
		int co=0;
		for(w=2;w<p;w++) {
			if(p%w==0) {
			break;
			
			}}
		if(p==w) {
			break;
		}
		
	}
	if(w==m) {
		System.out.println("YES");
	
	}else {
		System.out.println("NO");
	}

}
}
