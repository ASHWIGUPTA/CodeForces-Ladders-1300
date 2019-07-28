import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
 
public class KuriyamaMiraiStones {
	static Long t[];
	static Long s[];
	public static void main(String[] args) throws IOException {
		Reader scan = new Reader();
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int[] sort = ar.clone();
		Arrays.parallelSort(sort);
		int l=(int) (Math.ceil(Math.log(ar.length)/Math.log(2)));
		long g=pow(2, l);
		t=new Long[(int) ((g<<1)-1)];
		s=new Long[(int) ((g<<1)-1)];
		construct(ar,0,ar.length-1,0);
		
		constructSort(sort,0,sort.length-1,0);
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int c = scan.nextInt();
			int k = scan.nextInt()-1;
			int r = scan.nextInt()-1;
		if(c==1)
			System.out.println(call(t,k,r,0,ar.length-1,0));
		else
			System.out.println(call(s,k,r,0,ar.length-1,0));
		}
		
 
	}
 
	private static long pow(int i, int l) {
		if(l==0)
			return 1;
		if(l==1)
			return i;
		long r= pow(i,l/2);
		if(l%2==0)
			return r*r;
		else
			return r*r*i;
	}
 
	private static long call(Long[] t2, int k, int r, int i, int j, int l) {
		// TODO Auto-generated method stub
	if(k<=i &&r>=j)
		return t2[l];
	else if(j<k ||i>r )
		return 0;
	int mid=(i+j)/2;
	
		return call(t2,k,r,i,mid,(l<<1)+1)+ call(t2,k,r,mid+1,j,(l<<1)+2);
	}
 
	private static void construct(int[] ar, int i, int j, int k) {
		// TODO Auto-generated method stub
		if(j==i) {
			t[k]=(long) ar[i];
			return;}
		
		int mid=(i+j)/2;
		construct(ar,i,mid,(k<<1)+1);
		construct(ar,mid+1,j,(k<<1)+2);
		t[k]=t[(k<<1)+2]+t[(k<<1)+1];
	}
 
	
	private static void constructSort(int[] ar, int i, int j, int k) {
		// TODO Auto-generated method stub
	//	System.out.println("call");
		if(j==i) {
			s[k]=(long) ar[i];
			return;}
		int mid=(i+j)/2;
		constructSort(ar,i,mid,(k<<1)+1);
		constructSort(ar,mid+1,j,(k<<1)+2);
		s[k]=s[(k<<1)+2]+s[(k<<1)+1];
	}
	
 
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;
 
		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
 
		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
 
		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}
 
		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
 
			if (neg)
				return -ret;
			return ret;
		}
 
		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
 
		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
 
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
 
			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}
 
			if (neg)
				return -ret;
			return ret;
		}
 
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
 
		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
 
		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
 
}
















/*
 * import java.io.BufferedReader; import java.io.IOException; import
 * java.io.InputStreamReader; import java.io.PrintWriter; import
 * java.util.Arrays; import java.util.StringTokenizer;
 * 
 * public class KuriyamaMiraiStones {
 * 
 * public static void main(String[] args) throws IOException { FastReader scan =
 * new FastReader(); PrintWriter pr = new PrintWriter(System.out);
 * 
 * int n = scan.nextInt(); long[] ar = new long[n]; long[] r = new long[n]; for
 * (int i = 0; i < n; i++) { r[i] = ar[i] = scan.nextLong();
 * 
 * } // long[] r = ar.clone(); Arrays.sort(r); for (int i = 1; i < r.length;
 * i++) { ar[i] += ar[i - 1]; r[i] += r[i - 1]; } int q = scan.nextInt(); //
 * System.out.println(q); for (int i = 0; i < q; i++) { int c = scan.nextInt();
 * int k = scan.nextInt()-1; int l = scan.nextInt()-1; if (c == 1) { if (k != 0)
 * System.out.println(ar[l] - ar[k - 1]); else System.out.println(ar[l]); }
 * 
 * else { if (k != 0) System.out.println(r[l] - r[k - 1]); else
 * System.out.println(r[l]); } }
 * 
 * }
 * 
 * static class FastReader { BufferedReader br; StringTokenizer st;
 * 
 * FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
 * 
 * String next() throws IOException { while (st == null || !st.hasMoreTokens())
 * st = new StringTokenizer(br.readLine()); return st.nextToken(); }
 * 
 * String nextLine() throws IOException { return br.readLine(); }
 * 
 * int nextInt() throws IOException { return Integer.parseInt(next()); }
 * 
 * long nextLong() throws IOException { return Long.parseLong(next()); }
 * 
 * boolean hasNext() throws IOException { // if input is terminated by EOF
 * String s = br.readLine(); if (s == null) return false; st = new
 * StringTokenizer(s); return true; } } }
 */