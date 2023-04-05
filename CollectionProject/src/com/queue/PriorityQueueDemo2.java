package com.queue;
import java.util.Comparator;
import java.util.PriorityQueue;

class IntComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
    
		return o2-o1;

	}
	
}

public class PriorityQueueDemo2 {

	public static void main(String[] args) {

      PriorityQueue< Integer> pq= new PriorityQueue<>(new IntComparator());
      pq.add(12);
      pq.add(89);
      pq.add(67);
      pq.add(65);
      
      System.out.println(pq);
      
      //pq.add(null); // throws null pointer exception
      
      System.out.println(pq);

	}

}
