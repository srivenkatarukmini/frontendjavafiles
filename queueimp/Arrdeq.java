package queueimp;

import java.util.ArrayDeque;
import java.util.Iterator;
public class Arrdeq {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
		arr.add(19);
		arr.add(20);
		arr.offerFirst(35);
		arr.addFirst(34);
		arr.offer(23);
		arr.offer(45);
		System.out.println(arr);
			Iterator it=arr.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			

		}

	}


