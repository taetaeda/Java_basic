package oop.inter.Basic;

//클래스가 상속 가능한 것처럼 인터페이스도 extends를 사용하여
//인터페이스 간의 상속을 구현할 수 있습니다.
//인터페이스들 끼리는 다중 상속이 가능합니다.

public interface Inter2 extends ParentInter{

	int I = 5; // static final 자동으로 된다.
	
	void method2(); // abstract
}
