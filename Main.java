
//package SegmentTree;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public  class Main {
	public static void main(String[] args) throws IOException {
		//Reader scan = new Reader();
		Scanner scan=new Scanner(System.in);
		StringBuffer b = new StringBuffer();

		int n = scan.nextInt();

		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			r[i] = scan.nextInt();
		}
		int g = (int) Math.ceil(Math.log(n) / Math.log(2));
		int j[] = new int[(int) (2 * Math.pow(2,g) - 1)];
		//System.out.println(g+" "+j.length);
		
		boolean flag = n % 2 == 0 ? false : true;
		createHeap(r, j, 0, r.length - 1, 0, new HashSet<Integer>());
		int w = scan.nextInt();

	//	System.out.println(w+"-----");
		for (int i = 0; i < w; i++) {
			int p = scan.nextInt() - 1;
			int d = scan.nextInt()-1;
		System.out.println(printre(0, r.length - 1, p, d, 0, j));

			//System.out.println(j[0]);
		}
		call("aa".value);

	}

	private static void call(char[] string) {
		// TODO Auto-generated method stub
		
	}

	private static int printre(int i, int j, int p, int d, int k, int[] j2) {
		if (j < i)
			return 0;
		if(p<=i && j<=d) {
			return j2[k];
			
		}
		if(i>d || j<p)
			return 0;
		
		int mid =(i+j)/2;
		return Math.max(printre(i, mid, p, d, 2*k+1, j2),printre(mid+1, j, p, d, 2*k+2, j2));
		
	}
		
		
		/*
		 * IF (J == I) { RETURN J2[K]; } ELSE { INT MID = I + (J - I) / 2; IF (I <= P &&
		 * MID >= P) { PRINTRE(I, MID, P, D, 2 * K + 1, J2); } ELSE { PRINTRE(MID + 1,
		 * J, P, D, 2 * K + 2, J2); }
		 * 
		 * J2[K] = FLAG ? J2[2 * K + 1] | J2[2 * K + 2] : J2[2 * K + 1] ^ J2[2 * K + 2];
		 * }
		 */
	//}/

	private static HashSet<Integer> createHeap(int[] r, int[] j, int i, int length, int k, HashSet<Integer> b) {

		if (i == length) {
			b.add(r[i]);
			j[k] =1;// b.size();
			return b;
		}
		int mid = (i + length) / 2;
		HashSet<Integer> w = createHeap(r, j, i, mid, 2 * k + 1, b);
		HashSet<Integer> q = createHeap(r, j, mid + 1, length, 2 * k + 2, b);
		w.addAll(q);
		j[k] = j[2 * k + 1]+j[2 * k + 2];
		return w;
	}

	
}