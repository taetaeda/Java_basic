package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		/*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식.
        - Key는 중복 저장을 허용하지 않는다.
        */
		
		//Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정.
		Map<String, String> map = new HashMap<>();
		
		// Map에 데이터를 추가하는 메서드: put(key,value)
		map.put("근육몬", "유훈모");
		map.put("지니어스", "성삼경");
		map.put("빠가사리", "원정욱");
		System.out.println(map);
		
		// Map은 key의 중복 저장을 허용하지 않습니다.
		// 만약 중복 key를 사용하요 put을 호출하면 Value값만 수정됩니다.
		map.put("근육몬", "강희수"); // key 중복되면 value 값만 바뀐다.
		map.put("빡통대가리", "원정욱"); 
		// Value 중복되면 또 달리 나온다 빠가사리=원정욱, 빡통대가리=원정욱}
		System.out.println(map);
		
		//Map 내부에 key의 존재 유무를 확인하는 메서드: containskey(key)
		System.out.println(map.containsKey("근육몬"));
		// key 값이 있다면 true key 값이 없다면 false
		
		//Map 내부의 값을 참조하는 법 : get(key)
		String name = "근육몬";
		if(map.containsKey(name)) {
			System.out.printf("%s의 별명을 가진 학생은 %s입니다.\n",name,
					map.get(name));
		}else {
			System.out.println("그런 별명 가진 학생은 없습니다.");
		}
		
		//map안에 있는 key 값이라면 출력되고 없는 key값을 준다면 null
		System.out.println(map.get("근육몬"));
	
		//Map의 크기를 확인하는 메서드: size()
		System.out.println("Map의 크기 : "+ map.size());
		
		//Map에서 key들만 추출하는 메서드: keySet()
		//모든 key들을 Set으로 담아서 반환합니다.
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		//Map의 객체를 삭제: remove(key)
		//key를 주시면 value도 함께 제거됩니다.
		map.remove("빡통대가리");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		
		
		
		

	}

}
