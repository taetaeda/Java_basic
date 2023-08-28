package basic.homework;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("비교할 정수를 입력하세요: ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a + "이(가) 큰 수입니다.");
		}else if(a < b) {
			System.out.println(b + "이(가) 큰 수입니다.");
		}else {
			System.out.println("같은 수 입니다");
		}
	}

}
