package DailyCoding;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKArrray {
public static void main(String[] args) {
int j[][]= {{1,3,9},{4,5,6},{7,8,9}};
	
PriorityQueue<Node> q=new PriorityQueue<MergeKArrray.Node>(j.length, new Comparator<Node>() {

	@Override
	public int compare(Node o1, Node o2) {
		return o1.value-o2.value;
		//return 0;
	}
});

for (int i = 0; i < j.length; i++) {
//Node n=	new Node(j[i][0],i, 0);
	q.add(new Node(j[i][0],i, 0));
}
int arr[]=new int[j.length*j[0].length];
int c=0;
while (!q.isEmpty()) {
	Node n=q.poll();
	arr[c++]=n.value;
	if(j[n.i].length>(n.j+1)) {
		q.offer(new Node(j[n.i][n.j+1],n.i,n.j+1));
	}
	
}
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}

}

public static class Node{
	int value;
	int i;
	int j;
	public Node(int value, int i, int j) {
		super();
		this.value = value;
		this.i = i;
		this.j = j;
	}
	
}
}
