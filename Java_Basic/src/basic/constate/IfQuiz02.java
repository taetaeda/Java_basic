package basic.constate;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		         # 스캐너를 사용하여 정수를 하나 입력받으세요.
		         
		         - 입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
		         - 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다." 를 출력.
		         - 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
		        */
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하시오 : ");
			int xxx = sc.nextInt();
		
			if(xxx == 0 ) {
				System.out.println("0입니다.");
			}else if(xxx % 7 != 0 ) {
				System.out.println("7의 배수가 아닙니다.");
			}else if(xxx % 7 == 0 ) {
				System.out.println("7의 배수입니다.");
			}
				
				
			sc.close();
	}

}
