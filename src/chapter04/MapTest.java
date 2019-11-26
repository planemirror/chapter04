package chapter04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1); // Auto Boxing
		map.put("two", 2); // Auto Boxing
		map.put("three", 3); // Auto Boxing
		
		int i = map.get("two"); // Auto UnBoxing
		System.out.println(i);
		
		map.put("three", 333);
		System.out.println(map.get("three")); // Set이므로 같은 값이 들어갈 수 없어서 덮어 씌운다.
		
		Set<String> s = map.keySet();
		for(String key : s)
		{
			int value = map.get(key);
			System.out.println(value);
		}

	}

}
