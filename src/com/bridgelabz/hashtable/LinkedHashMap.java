package com.bridgelabz.hashtable;

import java.util.ArrayList;

public class LinkedHashMap<K,V> {
	
	private final int numberOfBucket;
	ArrayList<MyLinkedList<K>> arrayList;

	public LinkedHashMap() {

		numberOfBucket = 10;
		arrayList = new ArrayList<>();
		for (int i = 0; i < numberOfBucket; i++) {
			arrayList.add(null);
		}
	}

	public Integer get(K key) {

		int indexNumber = this.getBucketNumber(key);
		MyLinkedList<K> linkedList = arrayList.get(indexNumber);

		if (linkedList == null) {
			return null;
		}
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
		return mapNode == null ? null : mapNode.getValue();
	}

	private int getBucketNumber(K key) {

		int hashCode = Math.abs(key.hashCode());
		return hashCode % this.numberOfBucket;
	}

	public void put(K key, Integer value) {

		int index = this.getBucketNumber(key);
		MyLinkedList<K> linkedList = this.arrayList.get(index);
		if (linkedList == null) {
			linkedList = new MyLinkedList<>();
			this.arrayList.set(index, linkedList);
		}

		MyMapNode<K, V> my_Map_Node = (MyMapNode<K, V>) linkedList.search(key);
		if (my_Map_Node == null) {
			my_Map_Node = new MyMapNode<>(key, value);
			linkedList.append(my_Map_Node);
		} else {
			my_Map_Node.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "LinkedHashMap [arrayList=" + arrayList + "]";

}
}
