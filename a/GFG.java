package a;

public class GFG
{ 

	static void breakLine() 
	{ 
		System.out.print("\n---------------------------------\n"); 
	} 
	static int MAX = 10; 

	static int arr[] = new int[MAX], no; 

	// Function to check queens placement 
	static void nQueens(int k, int n) 
	{ 

		for (int i = 1; i <= n; i++) 
		{ 
			if (canPlace(k, i)) 
			{ 
				arr[k] = i; 
				if (k == n) 
				{ 
					display(n); 
				} 
				else
				{ 
					nQueens(k + 1, n); 
				} 
			} 
		} 
	} 

	// Helper Function to check if queen can be placed 
	static boolean canPlace(int k, int i) 
	{ 
		for (int j = 1; j <= k - 1; j++) 
		{ 
			if (arr[j] == i || 
				(Math.abs(arr[j] - i) == Math.abs(j - k))) 
			{ 
				return false; 
			} 
		} 
		return true; 
	} 

	// Function to display placed queen 
	static void display(int n) 
	{ 
		breakLine(); 
		System.out.print("Arrangement No. " + ++no); 
		breakLine(); 

		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = 1; j <= n; j++) 
			{ 
				if (arr[i] != j) 
				{ 
					System.out.print("\t_"); 
				} 
				else
				{ 
					System.out.print("\t"+arr[i]); 
				} 
			} 
			System.out.println(""); 
		} 

		breakLine(); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		int n = 4; 
		nQueens(1, n); 
	} 
} 






/*
 * package a;
 * 
 * import java.util.ArrayList; import java.util.LinkedHashSet;
 * 
 * package whatever //do not write package name here
 * 
 * public class GFG { public static void main(String[] args) { int x = 35; int m
 * = 2,count=0; LinkedHashSet<Integer> a=new LinkedHashSet<Integer>(); a.add(m);
 * while(count<15){ ArrayList<Integer> ab=new ArrayList<Integer>(); for(int b:a)
 * { ab.add(b+m); } count++; m=m<<2; a.addAll(ab); a.add(m);
 * 
 * } System.out.println(a.size()); //
 * System.out.println(a.toString().indexOf(2<32));
 * 
 * 
 * 
 * int m = 1; int y = x; int e = Integer.highestOneBit(x); int ex = (int)
 * (Math.log10(e) / Math.log10(2)); System.out.println(y + " " +
 * Integer.toBinaryString(y) + " " + e + " " + ex); while (count < ex) { y = y ^
 * m; if (y > x) { y = y ^ m; } m = m << 2; count++; } System.out.println(y +
 * " " + Integer.toBinaryString(y)); m = 2; int p = y; count = 0; e =
 * Integer.highestOneBit(p); ex = (int) (Math.log10(p) / Math.log10(2));
 * System.out.println("dsd" + ex + " " + e); int z = 1 << ex + 2;
 * System.out.println(z);
 * 
 * while(count < ex) { y = y ^ m;
 * 
 * m = m << 2; count++;
 * 
 * } int z=y<<1; y = p; m = 2; while (y <= x) { System.out.println(" before y "
 * + y + " m " + m);
 * 
 * y = y | m; m = m << 2; System.out.println("y " + y + " m " + m); }
 * System.out.println(Math.min(y, z) + " " + y); // } } }
 */