package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> language = new ArrayList<>();

		language.add("Java");
		language.add("Python");
		language.add("COBOL");
		language.add("LISP");
		language.add("C#");
		language.add("Java");
		language.add(null);
		language.add(null);

		//

		List<String> l2 = new ArrayList<>();

		l2.add("Java");
		l2.add("VBNet");
		l2.add("FORTRAN");

		// add at particular index Index
		language.add(2, "HTML");
		System.out.println(language);
		// add collection
		language.addAll(l2);

		System.out.println(language);

		// remove
		language.remove("Java");
		System.out.println(language);

		// retainAll
		language.retainAll(l2);
		System.out.println(language);

		language.add("COBOL");
		language.add("LISP");
		language.add("C#");
		language.add("Java");
		System.out.println(language);
		// removeAll
		language.removeAll(l2);
		System.out.println(language);
		language.add("Java");
		language.add("Java");
		language.removeAll(Collections.singleton("Java"));
	}

}
