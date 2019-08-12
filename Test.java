import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double h=scan.nextDouble();
	double l=scan.nextDouble();
	
	double z=l*l-h*h;
	
	//System.out.println(z);
	z=z/h;
	z=z/2.0;
	System.out.println(z);
}

}
