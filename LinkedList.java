package uebung10;

public class LinkedList {
	private Node start;

	private Node end;

	private int size;

	public LinkedList(int value) {
		start = new Node(value);
		end = start;
		size = 1;
	}

	public void addValue(int value) {
		Node newNode = new Node(value);
		end.setNextNode(newNode);
		end = newNode;
		size = size + 1;
	}

	public int getValue(int position) {

		Node tmp = start;
		while (position > 0) {
			tmp = tmp.getNextNode();
			position = position - 1;
		}
		return tmp.getValue();
	}

	public int getSize() {
		return size;
	}

	public int getNumberOfElements(int value) {
		Node tmp = start;
		int count = 0;
		while (tmp.hasNextNode()) {
			if (tmp.getValue() == value) {
				count = count + 1;
			}
			tmp = tmp.getNextNode();
			//System.out.println(tmp);
		}
		return count;
	}

	public void insert(int position, int value) {
		Node newNode = new Node(value);
		if (position == 0) {
			newNode.setNextNode(start);
			start = newNode;
		} else {
			// because List starts at position 0.
			position = position - 1;
			Node tmp = start;
			while (position > 0) {
				tmp = tmp.getNextNode();
				position = position - 1;
			}
			Node nextNode = tmp.getNextNode();
			tmp.setNextNode(newNode);
			newNode.setNextNode(nextNode);
		}
		size = size + 1;
	}

	public boolean contains(int value) {
		Node tmp = start;
		while (tmp.getNextNode() != null) {
			if (tmp.getValue() == value) {
				return true;
			}
			tmp = tmp.getNextNode();
		}
		return false;
	}

	public String toString() {
		return "" + start;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList(125);
		System.out.println(list);
		list.addValue(222);
		System.out.println(list);
		System.out.println(list.getValue(1));
		for (int i = 0; i < 2500; ++i) {
			list.addValue(222);
		}
		System.out.println(list);
		System.out.println(list.getValue(2500));
		System.out.println(list.contains(888));
		System.out.println(list.contains(22888));
		list.insert(0, 111);
		list.insert(2, 123);
		System.out.println(list.contains(222));
		System.out.println(list.getNumberOfElements(125));
	}

}
