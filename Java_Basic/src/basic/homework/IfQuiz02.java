package basic.homework;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		
		if(a == 0) {
			System.out.println("0입니다.");
		} else if (a%7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
	}

}
