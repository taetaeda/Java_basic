package oop.poly.car;

public class Driver {
	
	public void drive(Car c) {
		System.out.println("두라이부우우우 를 시작합니다.");
		c.run();
	}
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("3000에 구입합니다.");
			return new Sonata();
		}
		else if(name.equals("포르쉐")) {
			System.out.println("1억 5천에 구입합니다.");
			return new Porsche();
		}
		else if(name.equals("테슬라")) {
			System.out.println("9000에 구입합니다.");
			return new Tesla();
		}
		else {
			System.out.println("돈 없으면 꺼져");
			return null;
		}
	}
}
