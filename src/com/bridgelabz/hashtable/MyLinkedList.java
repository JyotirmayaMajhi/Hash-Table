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
	
	public boolean remove(K key) {
		
		INode<K> temp =head;
		INode<K> prev = null;
		while(temp != null) {
			if(temp.getKey() == key) {
				prev.setNext(temp.getNext());
				return true;
			} 
			prev = temp;
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}
}
