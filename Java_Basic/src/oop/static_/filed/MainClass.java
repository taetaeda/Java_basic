package oop.static_.filed;

public class MainClass {

	public static void main(String[] args) {

		
		
		
		Count c1 = new Count();

		c1.a += 5; //얘는 그냥 public
		c1.b += 5; //얘는 public static

		System.out.println("인스턴스 변수 c1.a: " + c1.a);//5
		System.out.println("인스턴스 변수 c1.b: " + c1.b);//5

		System.out.println("-------------------------------------");

		Count c2 = new Count(); 

		c2.a += 7;
		c2.b += 7;

		System.out.println("인스턴스 변수 c2.a: " + c2.a);//7
		System.out.println("인스턴스 변수 c2.b: " + c2.b);// c1.b+c2.b = 12

		System.out.println("-------------------------------------");

		Count c3 = new Count(); 

		c3.a += 8;
		c3.b += 8;

		System.out.println("인스턴스 변수 c3.a: " + c3.a);//8
		System.out.println("인스턴스 변수 c3.b: " + c3.b);// c1.b+c2.b+c3.b = 20
		System.out.println("인스턴스 변수 c1.b: " + c1.b);// c1.b+c2.b+c3.b = 20
		System.out.println("인스턴스 변수 c2.b: " + c2.b);// c1.b+c2.b+c3.b = 20
		
		System.out.println("정적 변수 count b: "+ Count.b);
		//static 은 함수가 계속 쌓여서 하나로 정의된다 . 
		//그냥 public이라면 변수마다 다른 값을 저장하겠지만 static은 하나로 정의된다.
		// - 일반 맴버 변수(필드)와 혼동할 가능성이 있기 떄문에
		// 주소값으로 접근하지 않습니다 예를 들어 c2.b (x) count.b(o)
		
		Count.b++; // c2.b +=1; 이렇게 하지말구 Count.b++;로 해라! 
		Count.b++;
		
		System.out.println("정적 변수 count b: "+ Count.b);
	}

}
