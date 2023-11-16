package oop.poly.car;

public class Tesla extends Car{


	@Override
	void run() {
		System.out.println("테슬라가 나간다 다 비켜 !! 도지코인간다!");
	}
	
	void activeAutopilot() {
		System.out.println("테슬라의 오토파일럿이 켜집니다.!");
	}
}
