package Heap;

public class Heap {

}

class Node {
	int size;
	int[] heap;
	int capacity;

	public Node(int size) {
		super();
		this.capacity = size;

		heap = new int[size + 1];
	}

	public int left(int p) {
		return 2 * p + 1;

	}

	public int right(int p) {
		return 2 * p;

	}

	public int parent(int p) {
		return p / 2;

	}

	public void insert(int r) {
		if (size < capacity) {
			heap[++size] = r;
			int c = size;
			while (heap[c] < heap[parent(c)]) {
				swap(c, parent(c));
				c = parent(c);
				meanHeap(c);

			}
		}
	}

	private void swap(int c, int parent) {
		int temp = heap[c];
		heap[c] = heap[parent];
		heap[parent] = temp;
	}

	private void meanHeap(int i) {
		// TODO Auto-generated method stub
		if (!isLeaf(i)) {
			if (heap[i] > heap[left(i)] || heap[i] > heap[right(i)]) {
				if (heap[i] > heap[left(i)]) {
					swap(heap[left(i)], i);
					meanHeap(heap[left(i)]);
				} else {
					swap(heap[right(i)], i);
					meanHeap(heap[right(i)]);
				}
			}
		}
	}
	
	private  void delete(int r) {
		heap[1]=heap[size--];
		meanHeap(1);
	}
	private boolean isLeaf(int i) {
		if (i > size / 2 && i < size)
			return true;
		return false;
	}

}
