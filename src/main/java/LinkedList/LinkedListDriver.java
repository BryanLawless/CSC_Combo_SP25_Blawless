package LinkedList;

public class LinkedListDriver {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertStart(4);
		list.insertAt(55, 2);

		list.show();
	}
}
