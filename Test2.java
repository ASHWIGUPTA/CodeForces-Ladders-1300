import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) throws IOException {
	Reader scan=new Reader();
Scanner s=new Scanner(System.in);
	int t=scan.nextInt();
for (int i = 0; i < t; i++) {
int x=scan.nextInt();
int y=scan.nextInt();
int a[][]=new int[x][y];
//System.out.println(x);
for (int j = 0; j <x; j++) {
	String r=s.nextLine();
	
	for (int j2 = 0; j2 < y; j2++) {
	//	System.out.println(r.charAt(j2)+"--");
		a[j][j2]=r.charAt(j2);
	}}
System.out.println("ensd");
int o=0;
for (int j = 0; j <x; j++) {
	int r=0;
	for (int j2 = 0; j2 < y; j2++) {
		if(a[j][j2]=='*') {
			r++;
		}
		}
	if(o<r) {
		o=r;
	}
}
System.out.println("rr");
int v=0;
for (int j = 0; j <y; j++) {
	int r=0;
	for (int j2 = 0; j2 < x; j2++) {
		if(a[j2][j]=='*') {
			r++;
		}
		}
	if(v<r) {
		v=r;
	}
}
System.out.println(x+y-v-o);
}
}
public static class Reader {
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
