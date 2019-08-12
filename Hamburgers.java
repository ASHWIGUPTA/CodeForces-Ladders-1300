import java.math.BigInteger;
import java.util.Scanner;

public class Hamburgers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int[] av = new int[3];
		int[] p = new int[3];
		int si[] = new int[3];
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'B')
				si[0]++;
			else if (a.charAt(i) == 'S')
				si[1]++;
			else
				si[2]++;

		}
		int max = 0;
		for (int i = 0; i < p.length; i++) {
			av[i] = scan.nextInt();
			if (max < av[i])
				max = av[i];
		}
		int sum = 0;
		for (int i = 0; i < p.length; i++) {
			p[i] = scan.nextInt();
			sum += p[i]*si[i];
		}

		BigInteger r = scan.nextBigInteger();
		double count = 0;
		boolean falg = false;
	//	System.out.println(max);
		for (int j = 0; j < max; j++) {
			for (int i = 0; i < si.length; i++) {
			//System.out.println(av[i]+" -"+j+"- "+si[i]+" "+r+" "+count);
				if (av[i] < si[i] && r.compareTo(BigInteger.valueOf((si[i]-av[i])*p[i]))>= 0) {
			//	System.out.println((si[i]-av[i])*p[i]);
					r = r.subtract(BigInteger.valueOf((si[i]-av[i])*p[i]));
					av[i]=0;
				} else if (av[i] >= si[i]) {
					av[i] -= si[i];
				} else {
					falg = true;
				}
			}
			if (falg) {
				//System.out.println("------");
				System.out.println(String.valueOf(count).split("\\.")[0]);
				return;
			} else
				count++;
		}
		//System.err.println(sum +" "+ (r)+" "+(r/sum));
		
		System.out.println(r.divide(BigInteger.valueOf(sum)).add(BigInteger.valueOf((long) count)));
	}
}
