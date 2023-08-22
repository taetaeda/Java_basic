package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		/*
        # 변수 (Variable)
        
        1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
        2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
        적당한 데이터 타입을 선언해야 합니다.
        ex) int: 4바이트의 정수, String: 문자열(문장)
        3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
        4. 변수 내부의 값은 언제든지 변경이 가능합니다.
        */
		
		//변수의 선언: [자료형(데이터 타입)] [변수명];
		int age;
		
		//변수의 초기화: [변수명] = [값];
		age = 40;
		
		//변수의 값 참조(사용)
		System.out.println(age);
		
		//변수는 선언과 초기화를 동시에 할 수 있습니다.
		//(처음 만들 때 한 번만 가능합니다.)
		int score = 90;
		// int score = 95;//이러면 안돼. 두개를 만들어버리면
		// 데이터 파일이 있으니까, 새로 만드는거니까 안돼
		
		score = 95; // 이건 가능해. 데이터 파일 만드는게 아니라 기존의 score를 지목해 새로운 값을 넣었을 뿐이니까
		System.out.println(score);
		// 변수 하나당 값을 하나밖에 대입할 수 없기 때문에
		// 기존 값이 소멸하고 새로운 값이 할당됩니다.
		
		//변수에는 다른 변수의 값도 저장이 가능합니다.
		int myScore = score - 20;
		// area = value myScore라는 영역에 score라는 변수가 가진 값에서 -20 한 값을 저장하겠다.
		System.out.println(myScore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
		//int count = "한번"; (x)
		//int count = 23.5; (x) 정수가 아니라서 안됨
		//string str = 100; (x) 문자가 아니라 안됨
		
		//변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면
		//중복 선언할 수 없습니다.
		String name = "홍길동";
		// int name = 1004;
		// 계속 스택 stack 형태로 저장 되어가고 있음 - 이름 동일하면 중복선언되서 안됨
		
		//선언 및 초기화되지 않은 변수는 사용이 불가능합니다.
		// int result = myScore + num; //num이란 변수를 선언한 적 없기 때문에 안됨
		int result;
		// System.out.println(result); (x) //초기화가 필요
	}

}
