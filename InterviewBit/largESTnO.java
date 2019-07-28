package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class largESTnO {
public static void main(String[] args) {
	List<Integer> b=new ArrayList<Integer>();
	b.add(0);
	b.add(0);
		/*
		 * b.add(34); b.add(5); b.add(9);
		 */
	System.out.println(largestNumber(b));
}  public static String largestNumber(final List<Integer> A) {
	List<Integer> b=new ArrayList<>();
	b=A;
	Collections.sort(b, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
		String r=""+o1+""+o2;
		String v=""+o2+""+o1;
		return r.compareTo(v)>0?-1:1;
		}
	});
	StringBuilder x=new StringBuilder("");
		/*
		 * if(b.get(0)==0) return "0";
		 */for (int z:b) {
	x.append(z);
	}
	//System.out.println(x);
	return x.toString();
}
}
