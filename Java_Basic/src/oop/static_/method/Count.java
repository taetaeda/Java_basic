package oop.static_.method;

public class Count {

	
	// static 은 같은 패키지 안에 함수 값으로써 공통되게 필요한 함수라면 static으로 지정할 수있다.
	// 정답은 없다 . 본인 판단
	public int a;
	public static int b;
	
	/*
    # 인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
     인스턴스 메서드 안에서는 정적(static) 변수와
     인스턴스 변수 모두를 참조할 수 있습니다.
    */
	
	
	public int method1() {
		return this.a + Count.b;
	}
	
	/*
    - static블록(메서드, 정적 초기화자) 내부에서는
     static이 붙은 변수나 메서드만 사용할 수 있습니다.
     this는 사용할 수 없습니다. -> 나타낼 주소값이 없기 때문 -> 객체 생성 없이도 호출되기 때문.
     
    - static 블록 내부에서 non-static멤버를 사용하려면
     반드시 객체를 생성해서 주소값을 통해 참조해야 합니다.
    */
	
	public static int method2() {
		Count ccc = new Count(); /// this가 안되기 떄문에 객체 지정해서 객체 안에 a를 지정한다.
		return ccc.a + Count.b; //static 지정하면 this를 지정할 수 없다.
		// count.method2(); : 객체생성없이 정의할 수 있는 것
	}
}
