package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		// my.year = 1992; 제대로 된 값도 막아버린다
		my.setYear(1992);
		my.setMonth(8);
		my.setDay(22);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", my.getYear("aaa1111!"), my.getMonth(), my.getDay());
	}

}
