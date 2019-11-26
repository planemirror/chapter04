package chapter04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("도우넛");
		
		while (!q.isEmpty())
		{
			String s = q.poll();
			System.out.println(s);
		}
		
		System.out.println(q.poll()); // Queue는 비어있는 경우 Null을 Return한다
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("도우넛");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());

	}

}
