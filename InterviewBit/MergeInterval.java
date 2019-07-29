package InterviewBit;

import java.util.ArrayList;

public class MergeInterval {
	public static void main(String[] args) {
		ArrayList<Interval> b = new ArrayList<Interval>();
		b.add(new Interval(6037774, 6198243)); b.add(new Interval(6726550, 7004541));
		b.add(new Interval(8842554, 10866536)); b.add(new Interval(11027721, 11341296));
		b.add(new Interval(11972532, 14746848)); b.add(new Interval(16374805, 16706396));
		b.add(new Interval(17557262, 20518214)); b.add(new Interval(22139780, 22379559));
		b.add(new Interval(27212352, 28404611)); b.add(new Interval(28921768, 29621583));
		b.add(new Interval(29823256, 32060921)); b.add(new Interval(33950165, 36418956)); 
		b.add(new Interval(37225039, 37785557)); b.add(new Interval(40087908, 41184444));
		b.add(new Interval(41922814, 45297414)); b.add(new Interval(48142402, 48244133));
		b.add(new Interval(48622983, 50443163)); b.add(new Interval(50898369, 55612831));
		b.add(new Interval(57030757, 58120901)); b.add(new Interval(59772759, 59943999));
		b.add(new Interval(61141939, 64859907)); b.add(new Interval(65277782, 65296274));
		b.add(new Interval(67497842, 68386607)); b.add(new Interval(70414085, 73339545)); 
		b.add(new Interval(73896106, 75605861)); b.add(new Interval(79672668, 84539434));
		b.add(new Interval(84821550, 86558001)); b.add(new Interval(91116470, 92198054));
		b.add(new Interval(96147808, 98979097));
		
		
		b = insert(b, new Interval(36210193,61984219));
		/*
		 * for (Interval x : b) { System.out.println(x.start + " " + x.end); }
		 */
	}

	static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int j = 0;
		for (Interval b : intervals) {
			if (b.start > newInterval.start) {
				break;
			}
			j++;
		}
		System.out.println(j);
		//j = j > 0 ? j  : 0;
		// System.out.println(intervals.size());
		intervals.add(j, newInterval);
		// System.out.println(intervals.size());
		ArrayList<Interval> b = new ArrayList<Interval>();
		b.add(intervals.get(0));
		
		  for (Interval f:intervals) { System.out.println(f.start+"++++"+f.end); }
		 
		//System.out.println(b.size()+" -----"+b.get(b.size()-1).end);

		for (int i = 1; i < intervals.size(); i++) {
			if (b.get(b.size() - 1).end <= intervals.get(i).start)
			{	b.add(intervals.get(i));
		//	System.out.println(b.get(index));
			}else {
				int z = Math.max(b.get(b.size() - 1).end, intervals.get(i).end);
				b.set(b.size() - 1, new Interval(b.get(b.size() - 1).start, z));
			}
			System.out.println(b.size()+" -----"+b.get(b.size()-1).start+" "+b.get(b.size()-1).end);

		}
		return b;
	}
}