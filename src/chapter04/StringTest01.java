package chapter04;

public class StringTest01 {

	public static void main(String[] args) {	
		
		// Escape
		// \t -> 탭 컨트롤 문자
		// \n -> 개행 컨트롤 문자 (newLine)
		
		// c:\temp 를 출력하고 싶은 경우 Escape 문자\를 사용해야한다..

		System.out.println("c:\temp");
		System.out.println("c:\\temp");
		
		// "Hello" 에서 ""를 출력하고 싶은 경우 Escape 문자\를 사용해야한다.
		// System.out.println(""hello"");
		System.out.println("\"hello\"");
		
		// ' 를 출력하고 싶은 경우 Escape 문자\를 사용해야한다.
		//System.out.println(''');
		System.out.println('\'');
			
	}

}
