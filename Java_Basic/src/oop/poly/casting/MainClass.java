package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2;  (x) 부모는 자식의 어떠한 정보도 알 수 없다.
		
		p.method1();
		p.method2();
//		p.method3();  (x) 부모는 자식의 어떠한 정보도 알 수 없다.
		
		System.out.println("----------------------------------------------");
		
		Child c = new Child();
		c.n1= 1;  // 부모에게 물려받은 속성
		c.n2 = 2; // 자식을 위에 선언했기 떄문에 자식이 바꾼 속성도 가능
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("----------------------------------------------");
		
		//다형성 적용(Promotion)
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2; (x)  
//		parent(참조함수) p2(데이터 함수) : p2에 Parent 값이 들어있기때문에 안된다.
		
		p2.method1();
		p2.method2();
//		p2.method3(); (x)
		
		/*
		 - 다형성이 적용되면 자식 클래스의
		 본래의 맴버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		 
		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */
//		Child c2 = p2; 
//		p2가 parent 타입을 가지고 있기 때문에 상위 클래스 parent를 child안에 넣지 못한다. 
		Child c2 = (Child) p2; 
		// 자식 타입 = (자식타입) 부모타입  : ()을 넣어서 자식타입으로 지정
		c2.n2 = 2;
		c2.method2();
		c2.method3();
		System.out.println("p2의 주소값" + p2); // 주소 값이 값다.
		System.out.println("c2의 주소값" + c2);
		
		Object o = new String("옥지얌 빵빵아 영차~~");
		String str = (String) o;
		System.out.println("문자열의 길이: " + str.length());
		
		// 다형성이 한 번도 발생하지 않은 경우에는
		// 강제 형 변환을 사용할 수 없습니다.
		
//		Parent ppp = new Parent();
//		Child ccc = (Child) ppp;  다형성 x  부모를 자식으로 내림
		
	}

}
