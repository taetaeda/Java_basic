package oop.inter.Basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성 할 수 없는 추상적인 개념이다.
//		Inter i1 = new Inter();
		
		System.out.println("상수: " + inter.NUM);
		inter.staticMethod(); // static 데이터 호출은 가능합니다.
		
		ImpClass1 i1 = new ImpClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.ParentMethod();
		
		System.out.println("---------------------------------");
		
		/*
        - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
         예외로 인터페이스와 클래스간의 구현 관계에서도
         다형성 발생을 허용합니다.
         인터페이스 변수 = new 객체();
        */
		
		inter it1 = new ImpClass1();
		it1.method1();
		it1.ParentMethod();
		
		//연산자의 우선순위
		//괄호() -> 참조(.) -> 단항 -> 2항 -> 3항 -> 대입
		((ImpClass1)it1).method2(); 
		// () : 점이 더 빠르기 떄문에 앞이 더 먼저 수행하기 위한  ()를 더 쳐준다.

		
		/*
        - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
         정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.
         
        - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
         구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
        */
//		((ImpClass1)it1).method2();  = ((Inter2)it1).method2();
		
		Inter2 it2 = new ImpClass1();
		it2.method2();
		it2.ParentMethod();
		
		((inter)it2).method1();
		
		inter it3 = new ImpClass2();
		Inter2 it4 = new ImpClass3();
		
		ParentInter[] inters = {it1,it2,it3,it4};
		
		
	}

}





















