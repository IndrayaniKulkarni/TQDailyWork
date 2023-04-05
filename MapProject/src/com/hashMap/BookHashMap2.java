package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class BookHashMap2 {

	public static void main(String[] args) {

		HashMap<Book, String> bmap = new HashMap<>();

		bmap.put(new Book(101, "Ramayan", 890f), "Religious");
		bmap.put(new Book(102, "HarryPotter", 1090f), "Fiction");
		System.out.println(bmap.put(new Book(102, "HarryPotter", 1090f), "Fantasy"));

		for (Map.Entry<Book, String> en : bmap.entrySet()) {
			System.out.println(en.getKey() + " ->" + en.getValue());
		}

	}

}