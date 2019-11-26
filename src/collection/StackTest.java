package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우넛");
		
		while(!s.isEmpty())
		{
			String str = s.pop();
			System.out.println(str);
		}
		
		// s.pop(); // 스택은 비어있는 경우 StackException이 발생한다.
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우넛");
		
		System.out.println(s.pop());
		System.out.println(s.peek()); // 꺼내지 않고 맨 위에 뭐가 있는지 들여다봄
		System.out.println(s.pop());

	}

}
