package etc.exception.throw_;

public class ThrowExample {

	static int calcTotal (int num ) throws Exception {
		
		/*
        # 예외를 강제로 발생시키는 키워드 throw
        
        - 메서드나 생성자 실행 도중에 throw 키워드를 만나면
         즉시 throw로 생성한 예외가 발생합니다.
         
        - 예외가 발생되면 실행되던 코드는 즉시 중단되고 예외를 처리할 수 있는
         catch문으로 바로 이동하게 됩니다.
         
        - 이를 적절히 활용하면 void가 아닌 메서드를
         강제로 종료시킬 때 사용할 수 있습니다.
         또한, 에러 상황은 아니지만 프로그램 실행에 적절치 못한 상황에서
         코드의 흐름을 바꿔 줄 수가 있습니다.
        */
		
		
		if(num <= 0) {
			// 이 시점에서 강제로 새로운 에러를 발생시킴!
			throw new Exception(); 
			// -120이라면 if문이 true기 때문에 8번째 예외문이 발동된다. catch가 발생된다
		}
		int total = 0;
		for(int i = 1; i <=num; i++ ) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		try {
			System.out.println(calcTotal(100));  // 5050
			System.out.println(calcTotal(-120)); //0
			//  i(1) <= num(-120); 포문이 1바퀴도 안되니까 0이 된다.
		}catch(Exception e){
			System.out.println("매개값을 양수로 좀 바꿔주세요");
		}


	}

}
