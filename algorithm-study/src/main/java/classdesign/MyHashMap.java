package classdesign;


public class MyHashMap {

	private int capacity = 100000;
	private final Node[] bucket = new Node[capacity];

	public MyHashMap() {
	}

	public void put(int key, int value) {
		int idx = getIndex(key);
		if (bucket[idx] == null) {
			bucket[idx] = new Node(-1, -1);
		}

		Node prev = findPrev(idx, key);
		if (prev.next == null) {
			prev.next = new Node(key, value);
		} else {
			prev.next.value = value;
		}
	}

	public int get(int key) {
		int idx = getIndex(key);
		if (bucket[idx] == null) {
			return -1;
		}

		Node prev = findPrev(idx, key);
		if (prev.next == null) {
			return -1;
		} else {
			return prev.next.value;
		}
	}

	public void remove(int key) {
		int idx = getIndex(key);
		if (bucket[idx] != null) {
			Node prev = findPrev(idx, key);
			if (prev.next != null) {
				prev.next = prev.next.next;
			}
		}
	}

	private Node findPrev(int idx, int key) {
		Node root = bucket[idx];
		Node prev = root;

		while (root.next != null && root.key != key) {
			prev = root;
			root = root.next;
		}
		return prev;
	}

	private int getIndex(int key) {
		return Integer.hashCode(key) % capacity;
	}

	static class Node {

		int key;
		int value;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
}
