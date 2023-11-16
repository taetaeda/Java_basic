package oop.constructor;

public class Person {
	String name;
	int age;
	int height;
	
	Person(){}
	
	Person(String pName, int pAge, int pHeight){
		System.out.println("생성자 호출!");
		name = pName;
		age = pAge;
		height = pHeight;
	}
	
	void info() {
		System.out.println("*** 정보 ***");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("신장: " + height + "cm");
	}
}
