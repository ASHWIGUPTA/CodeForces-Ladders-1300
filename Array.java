import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for (int i = 0; i <n; i++) {
			a.add(scan.nextInt());
		}
		Collections.sort(a);
		System.out.println(1+" "+a.get(0));
		
		int zeroIn=a.indexOf(0);
	//	System.out.println(zeroIn);
		if((n-zeroIn-1)==0) {
			System.out.print(2);
			for (int i = 1; i <= 2; i++) {
				System.out.print(" "+a.get(i));
			}
			System.out.println();
			System.out.print(zeroIn-2);
			for (int i = 3; i <= zeroIn; i++) {
				System.out.print(" "+a.get(i));
			}
			
		}else
		{	System.out.print(a.size()-zeroIn-1);
			for (int i = zeroIn+1; i < a.size(); i++) {
				System.out.print(" "+a.get(i));
			}
			System.out.println();
			System.out.print(zeroIn);
			for (int i = 1; i <= zeroIn; i++) {
				System.out.print(" "+a.get(i));
			}
			
				
		}
		
		
		
		/*
		 * StringBuilder b=new StringBuilder(""); int i=1; for ( ; i < a.size(); i++) {
		 * //int r=a. if(a.get(i)<=0) { b.append(" "+a.get(i)); break; }} int size=i;
		 * i++; StringBuilder c=new StringBuilder(""+(a.size()-i)); for ( ; i <
		 * a.size(); i++) { //int r=a. c.append(" "+a.get(i)); }
		 * System.out.println(c.toString()); System.out.println(size+b.toString());
		 */}
}
