import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class TheChildToy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String r[] = br.readLine().split(" ");
		int n = Integer.parseInt(r[0]);
		int q = Integer.parseInt(r[1]);
		int arr[] = new int[n];
		int val[]=new int [n];
		r = br.readLine().split(" ");
		@SuppressWarnings("unchecked")
		LinkedList<Integer>[] list=new LinkedList[n];
		for (int i = 0; i < list.length; i++) {
			list[i]=new LinkedList<Integer>();
		}
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(r[i]);
		}
		int l=0,h=0;
		for (int i = 0; i < q; i++) {
			r = br.readLine().split(" ");
			h=Integer.parseInt(r[0])-1;
			l=Integer.parseInt(r[1])-1;
			list[h].add(l);
			list[l].add(h);
			val[h]+=arr[l];
			val[l]+=arr[h];
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(val[i]+" ");
		}
		System.out.println();
		int sum=0;
		for (int i = 0; i < list.length; i++) {
			int min =Integer.MAX_VALUE-1;
			int we=Integer.MIN_VALUE;
			int j=0;int f=0;
			for ( j = 0; j < list.length; j++) {
				if(min>val[j]) {
					min=val[j];
					f=j;
					we=arr[j]*list[j].size();
				}else if(min==val[j] &&we<arr[j]*list[j].size()) {
					min=val[j];
					f=j;
					we=arr[j]*list[j].size();
		//	System.out.println(we+" ");
				}
			}System.out.println(val[f]+" "+f);
			if(i!=list.length-1)
				sum+=val[f];
		//	System.out.println(val[f]);
			val[f]=Integer.MAX_VALUE;
			for (int k = 0; k < list[f].size(); k++) {
				val[list[f].get(k)]-=arr[f];
			}
		}
		System.out.println();
		System.out.println(sum);
		

	}
}
