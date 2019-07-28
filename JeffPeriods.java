import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JeffPeriods {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		int[] next=new int[100001];
		int[] period=new int[100001];
		int count=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<=n;i++)
		{
			if(next[a[i]]==0)
			{
				next[a[i]]=i;
			}
			else if(next[a[i]]>0)
			{
				if(period[a[i]]==0)
				{
					period[a[i]]=i-next[a[i]];
					next[a[i]]=i;
				}
				else if(period[a[i]]==i-next[a[i]])
				{
					next[a[i]]=i;
				}
				else next[a[i]]=-1;
			}
		}
		for(int i=1;i<100001;i++)
		{
			if(next[i]>0)
				count++;
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(count);
		for (int i = 1; i < 100001; i++)
			if (next[i] > 0)
				pw.println(i + " " + period[i]);
		pw.close();
		/*System.out.println(count);
		for(int i=1;i<100001;i++)
		if(next[i]>0)
		System.out.println(i+" "+period[i]);*/
	}
} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	Reader scan = new Reader();
		int n = scan.nextInt();
		String s = "";
		int ar[] = new int[n];
		TreeMap<Integer, Node> a = new TreeMap<Integer, Node>();

		for (int i = 0; i < n; i++) {
			int r = scan.nextInt();
			if (!a.containsKey(r)) {
				a.put(r, new Node(i, 0));
			} else {
				Node o = a.get(r);
				if (o.diff == 0) {
					a.put(r, new Node(i, i - o.i));
				} else if (i - o.i != o.diff) {
					a.put(r, new Node(i, Integer.MAX_VALUE));
				} else {
					a.put(r, new Node(i, i - o.i));
				}
			}

		} int c = 0;
		for (Map.Entry<Integer, Node> b : a.entrySet()) {
			if (b.getValue().diff == Integer.MAX_VALUE)
				c++; // a.remove(b.getKey());
		}
		System.out.println(a.size() - c);
		for (Map.Entry<Integer, Node> b : a.entrySet()) {
			if (b.getValue().diff != Integer.MAX_VALUE)
				System.out.println(b.getKey() + " " + (b.getValue().diff));
		}

	}

	static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
}

class Node {
	int i;
	int diff;
	int data;

	public Node(int i, int j) {
		this.diff = j;

		this.i = i;
	}
}
*/