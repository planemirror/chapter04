package chapter04;

public class ObjectTest {
	
	public static void main(String[] args) {
		
		Point p = new Point(10,20);
		
		System.out.println(p.getClass()); // reflection // 객체가 어떻게 생겨났나, 클래스 정보
		System.out.println(p.hashCode()); // hashCode값, // Reference Value (X), address (X), address 기반의 해싱값 (O)
		System.out.println(p);
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
	}

}
