package uebung10;

public class Node {
	private int value;

	private Node nextNode;

	public Node(int value) {
		this.value = value;
		this.nextNode = null;
	}

	public void setNextNode(Node next) {
		this.nextNode = next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public int getValue() {
		return value;
	}
	public boolean hasNextNode(){
		return this.nextNode != null;
	}

	public String toString() {
		String ret = "[" + value + "]";
		if (this.nextNode != null) {
			ret += "-> " + nextNode;
		}
		return ret;
	}
}
