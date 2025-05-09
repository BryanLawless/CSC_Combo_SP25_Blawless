package LinkedList;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = node;
		}
	}

	public void insertAt(int data, int index) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			node.next = head;
			head = node;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1 && current != null; i++) {
				current = current.next;
			}
			
			if (current != null) {
				node.next = current.next;
				current.next = node;
			}
		} 
	}

	public void insertStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public void show() {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();
	}
}