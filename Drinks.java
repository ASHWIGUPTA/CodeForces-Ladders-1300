import java.text.DecimalFormat;
import java.util.Scanner;

public class Drinks {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	double sum=0;
	for (int i = 0; i < t; i++) {
		sum+=scan.nextInt();
	}
	 DecimalFormat decim = new DecimalFormat("0.00");
	    Double price2 = Double.parseDouble(decim.format(sum/t));
	  
	System.out.println(String.format ("%.12f", sum/t));
	}
}
