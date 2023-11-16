package etc.enum_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Developer won = new Developer();
		won.name = "원정욱";
		won.carrer = 3;
		won.lang = Languages.JAVA;
	 // won.lang = "한국어"; (x)
		//한계가 있다?? won.lang = "메롱"; JAVA를 변경할 순 없지만  추가가된다. 막아줄 순 없다.
		
		Developer hun = new Developer();
		hun.name = "유훈모";
		hun.carrer = 1;
		hun.lang = Languages.PYTHON;
		
		Developer sung = new Developer();
		sung.name = "성삼경";
		sung.carrer = 100;
		sung.lang = Languages.JAVASCRIPT;
		
		System.out.println("won의 주력 언어: " + won.lang.getName());
		System.out.println("won의 주력 언어: " + hun.lang.getName());
		System.out.println("won의 주력 언어: " + sung.lang.getName());
		
//      values(); : 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴
		for(Languages lang : Languages.values()) {
			System.out.println(lang);
		}
		
		//ordinal(): 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴 (lang에 몇번째니?)
		System.out.println(won.lang.ordinal()); // index : 0번쨰
		System.out.println(hun.lang.ordinal()); // index : 3번쨰
		
		//valueOf(str) : 매개값으로 전달된 문자열과 일치하는 요소를 리턴
		System.out.println(Languages.valueOf("CPP"));
//		System.out.println(Languages.valueOf("Merong")); (x)
		
		
		
	}

}
