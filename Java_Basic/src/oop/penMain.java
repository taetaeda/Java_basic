package oop;

public class penMain {

	public static void main(String[] args) {
		/*
		 설계도에 작성한 속성과 기능을 사용하려면
		 반드시 실체(객체)를 생성하셔야 합니다.
		 클래스만 제작된 채로는 아무 기능도 수행 할 수 없습니다.
		  */
		
		//객체 생성 문법: 클래스타입 변수명 = new 클래스 이름();
		pen redpen = new pen(); // 앞에 pen은 주소값을 의미한다.
		pen bluepen = new pen();// 앞에 pen 객체를 참조하고 있으므로 앞에 pen을 붙친다.
		pen greenpen = new pen();
		
		//창조 연산자(.)를 통해 객체로 접근한 뒤
		//속성을 지정하고 기능을 사용할 수 있습니다.
		redpen.color = "빨강";
		redpen.price = 500;
		bluepen.color= "파랑";
		bluepen.price= 600;
		greenpen.color= "초록";
		greenpen.price= 1000;
		
		redpen.write();
		bluepen.write();
		greenpen.write();
		redpen.priceInfo();
		bluepen.priceInfo();
		greenpen.priceInfo();
		
		System.out.println(redpen);
		System.out.println(bluepen);
		System.out.println(greenpen);
		
		
	}
}
