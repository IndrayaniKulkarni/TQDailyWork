package com.hashMapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Q.6 Write the logic to convert arraylist to arrya and viceversa.
 */
public class ConversionArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println("ArrayList = "+num);

        //convert arrayList to Array
        // Integer[] arr = num.toArray(); //not allowed error
        Integer[] arr = new Integer[num.size()];
        num.toArray(arr);
        System.out.println("ArrayList to arr = "+Arrays.toString(arr));

        //convert array to arraylist

        Integer []arr2 = {1,2,3,4,5};
        System.out.println("Array = "+Arrays.toString(arr2));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println("Array to ArrayList =" +num2);
    }
}
