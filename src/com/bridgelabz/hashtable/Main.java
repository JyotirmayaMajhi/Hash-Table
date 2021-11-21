package com.bridgelabz.hashtable;

public class Main {

	public static void main(String[] args) {
		String string = "To be or not to be";
		String[] words = string.split(" ");

		LinkedHashMap linked_Hash_Map = new LinkedHashMap();

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			Integer value = linked_Hash_Map.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			linked_Hash_Map.put(word, value);
		}
		System.out.println(linked_Hash_Map);

	}

}
