package com.arrayListPractice;

import java.util.ArrayList;
/*
 * Q.4 Create two arrayList of string and find the objects in second arraylist which are not present in first arraylist.
 */
public class ExclusionOfArrayElements {
    
    static void presentInBNotA(ArrayList<String> l1, ArrayList<String> l2) {

        ArrayList<String> excludeA = new ArrayList<>();
    
        for(String i:l2){
            if(!l1.contains(i)){
                excludeA.add(i);
            }
        }

        System.out.println("Answer = "+excludeA);
    }
    public static void main(String[] args) {
        
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        l1.add("Java");
        l1.add("C++");
        l1.add("C#");
        l1.add("Python");
        l1.add("HTML");

        l2.add("Java");
        l2.add("Ruby");
        l2.add("Go");
        l2.add("Python");
        l2.add("JavaScript");

        System.out.println("A = "+l1);
        System.out.println("B = "+l2);
        presentInBNotA(l1,l2);

    }

   
}
