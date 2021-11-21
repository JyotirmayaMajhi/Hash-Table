package com.bridgelabz.hashtable;

public class MyLinkedList<K> {
	private INode<K> head;
	private INode<K> tail;

	public INode<K> search(K key) {
		INode<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void append(INode<K> myNode) {

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}
}
