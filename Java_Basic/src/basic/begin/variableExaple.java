//변수 선언 연습//

package basic.begin;

public class variableExaple {

	public static void main(String[] args) {
		
		/*
        # 변수 (Variable)
        
        1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
        --------------------------------------------
        2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
        적당한 데이터 타입을 선언해야 합니다.
        ex) int: 4바이트의 정수, String: 문자열(문장)
        ------------------------ 자바스크립트랑 자바랑 다른점 -
        3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
        4. 변수 내부의 값은 언제든지 변경이 가능합니다.
        */
		
		//변수의 선언 :[자료형(데이터 타입)] [변수명];
		int age; // int : 정수를 가르킬 때 나타내는 정의값 (나이);
		
		//변수의 초기화: [변수명] = [값];
		age = 40;  // = :대입연산자 좌항(age):area 우항(40):value
		
		//변수의 값 참조(사용 use)
		System.out.println(age); // = syso + cntl + space
		
		//변수는 선언과 초기화를 동시에 할 수 있습니다.
		//(처음 만들 때 한 번만 가능합니다.)
		///변수의 선언 = 변수 값 지정;
		int score = 90;
		//int score = 95; 밑에 빨간 줄이 뜬다면 실행(confile)이 되지 않는다.
		
		score = 95; //int score ≠ score
		//score =95; 중복이 아니라 score인 값 95를 넣기만 한다는 뜻.
		System.out.println(score);
		
		//변수에는 다른 변수의 값도 저장이 가능합니다.
		int myScore = score - 20;
		System.out.println(myScore);
		
		//변수의 자료형에 맞지 않은 데이트는 저장이 불가능합니다.
		//int count = "한번"; (x) int 는 정수값을 나타내기때문에 문자열은 에러 뜸.
		//System.out.println(count);
		//int count = 23.5; (x) 정수가 아닌 실수기 때문에 에러 뜸.
		//System.out.println(count);
		//String str = 100;(x)
		
		//변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면
		//중복 선언 할 수 없다.
		String name = "홍길동";
		//int name = 1004;
		// 변수명이 같으면 중복선언이 되지 않는다.
		
		//선언 및 초기화하지 않은 변수는 사용이 불가능합니다.
		//int result = myScore + num;
		//myScore는 변수값을 지정했지만 num한테는 변수값을 지정하지 않았기때문에 나올 수 없다.
		int result;
		//System.out.println(result); 값을 주지 않았으니까 결과값에 명시되지 않는다.
		
		
		
		
		
	}

}
