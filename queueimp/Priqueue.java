package queueimp;

import java.util.PriorityQueue;
public class Priqueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
		pr.offer(1);
		pr.offer(90);
		pr.offer(5);
		pr.offer(20);
		System.out.println(pr);
		System.out.println(pr.poll());
		System.out.println(pr.poll());
		System.out.println(pr.poll());
		while((pr.isEmpty()))
		{
			System.out.println(pr.poll());           //poll brings out the first element and 
			                                                    //checks for the priority
		}
		
		
		//for each
		for(Integer rr:pr)
		{
			System.out.println(rr);
		}
		System.out.println(pr.peek());
		
		
		/*pr.add("rukku");
		pr.add("ruk");
		pr.add("rukmini");
		System.out.println(pr);*/
	}

}
