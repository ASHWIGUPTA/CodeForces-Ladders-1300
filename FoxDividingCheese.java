import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class FoxDividingCheese  {
	public static class t  implements Comparable<t>{
		int val;
		int l;

		public t(int val, int l) {
			super();
			this.val = val;
			this.l = l;
		}

		@Override
		public int compareTo(t o) {
			// TODO Auto-generated method stub
			return val-o.val;
		}

	}

	public static void main(String[] args) throws IOException {
		Reader r = new Reader();
		int a = r.nextInt();
		int b = r.nextInt();
		if (a == b) {
			System.out.println(0);
			return;
		}
		PriorityQueue<t> q = new PriorityQueue<t>();
		TreeSet<t> s = new TreeSet<t>(Collections.reverseOrder());
		TreeSet<t> f = new TreeSet<t>(Collections.reverseOrder());

		q.add(new t(a, 0));
		s = list(s, q);
		q.add(new t(b, 0));
		f = list(f, q);
		/*
		 * for (t d : s) { System.out.print(" s--> " + d.val + " " + d.l); }
		 * System.out.println();
		 * 
		 * for (t d : f) { System.out.print(" l--> " + d.val + " " + d.l); }
		 * System.out.println();
		 */
		int l = 0, h = 0;
	//	System.out.println("size "+f.size()+" "+s.size());
		while (l < f.size() && h < s.size()) {
			if (s.first().val == f.first().val) {
				System.out.println(s.first().l+f.first().l);
				return;
			} else if (s.first().val > f.first().val) {
				s.pollFirst();
			} else {
				f.pollFirst();
			}
			//System.out.print("-->"+l+" "+h);
		}
		System.out.println(-1);

	}

	private static TreeSet<t> list(TreeSet<t> s, PriorityQueue<t> q) {
		// TODO Auto-generated method stub
	int c=0;
		while (!q.isEmpty()) {
			c++;
			t b = q.poll();
				int j=b.val;
			if (j % 2 == 0 && !s.contains(new t(j/2,0))) {
				q.add(new t(j / 2, b.l + 1));
			}
			if (j% 3 == 0 && !s.contains(new t(j/3,0)))
				q.add(new t(j / 3, b.l + 1));
			if (j % 5 == 0 && !s.contains(new t(j/5,0)))
			{//System.out.println(j+" "+b.l);
			t a=new t(j / 5, b.l + 1);
			q.add(a);
			}
			s.add(b);
		}
		//System.out.println(c);
		return s;
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
