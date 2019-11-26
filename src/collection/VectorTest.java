package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		
		
		// JAVA 1.4 이전
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");
		
		// 순회1
		int count = v.size();
		for(int i = 0 ; i < count ; i++)
		{
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		v.removeElementAt(1);
		
		// 순회2
		// 순회만 하는 역활의 객체, 뒤로 돌아가지 못함, 한번 사용 가능
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			String s = e.nextElement();
			System.out.println(s);
		}
		
	}

}
