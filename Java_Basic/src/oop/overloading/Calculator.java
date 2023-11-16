package oop.overloading;

public class Calculator {

	
	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
     
    - 오버로딩 적용 조건:
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
    */
	
	void inputData() {}
	
	
	void inputData(int a) {}
	
	
	void inputData(int a, int b) {}
	
//	void inputData(int b, int a) {}    //종류가 같다면 중복 수칙이 불가능하다.
	
	void inputData(String s) {} 
	
	void inputData(int a, double d) {}  // 종류 순서를 달리하면 중복 수칙이 가능하다
	
	void inputData(double d, int a) {} 
	
//	void inputData(int number) {} // 정수 매개값 1개를 받는 메서드가 이미 선언함
	
//	int inputData(int number) {
//		return 0;
//	}  // return 타입은 오버로딩을 무시한다.(중복선언 안됨)

	
	
	
	
	int calcRectArea(int a) {
		return a * a;
		
	}
	int calcRectArea(int b,int c) {
		return b * c;
	}
	double calcRectArea(int down,int up,int height) {
		return (down + up)* height / 2.0;
	}
	
		 
		 
		 
		 
		 
		 
		 
		 
	
	
}
