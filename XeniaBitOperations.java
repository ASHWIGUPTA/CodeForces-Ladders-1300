
//package SegmentTree;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class XeniaBitOperations {
	public static void main(String[] args) throws IOException {
		Reader scan = new Reader();
		StringBuffer b=new StringBuffer();
	
		int n = scan.nextInt();
		int w = scan.nextInt();

		int[] r = new int[(int) Math.pow(2, n)];
		for (int i = 0; i < Math.pow(2, n); i++) {
			r[i] = scan.nextInt();
		}
		int j[] = new int[2 * r.length - 1];
		boolean flag = n % 2 == 0 ? false : true;
		createHeap(r, j, 0, r.length - 1, 0, flag);

		for (int i = 0; i < w; i++) {
			int p = scan.nextInt() - 1;
			int d = scan.nextInt();
			printre(0, r.length - 1, p, d, 0, j, flag);

			System.out.println(j[0]);
		}

	}

	private static void printre(int i, int j, int p, int d, int k, int[] j2, boolean flag) {
		if (j < i)
			return;
		if (j == i) {
			j2[k] = d;
			return;
		} else {
			int mid = i + (j - i) / 2;
			if (i <= p && mid >= p) {
				printre(i, mid, p, d, 2 * k + 1, j2, !flag);
			} else {
				printre(mid + 1, j, p, d, 2 * k + 2, j2, !flag);
			}

			j2[k] = flag ? j2[2 * k + 1] | j2[2 * k + 2] : j2[2 * k + 1] ^ j2[2 * k + 2];
		}
	}

	private static void createHeap(int[] r, int[] j, int i, int length, int k, boolean flag) {

		if (i == length) {
			j[k] = r[i];
			return;
		}
		int mid = (i + length) / 2;
		createHeap(r, j, i, mid, 2 * k + 1, !flag);
		createHeap(r, j, mid + 1, length, 2 * k + 2, !flag);
		if (flag) {
			j[k] = j[2 * k + 1] | j[2 * k + 2];
		} else {
			j[k] = j[2 * k + 1] ^ j[2 * k + 2];
		}

	}static class Reader {
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