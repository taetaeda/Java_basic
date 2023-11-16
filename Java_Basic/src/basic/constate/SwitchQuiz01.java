package basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		
		
		/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("연산을 선택하세요. [+,-,*,/]");
		String operator = sc.next();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		int result = 0;
		boolean flag = true;   //boolean의 기본 값은 false
		
		switch(operator) {
		
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.print("너 븅신이야? \n");
				flag = false;
				break;
			}
			result = num1 / num2;
			break;
		
		default: // else 느낌 
			System.out.println("연산 기호를 정확하게 입력하세요.");
			System.out.println("[+,-,*,/]");
		}
		if(flag) {
		System.out.printf("%d %s %d = %d\n", num1,operator,num2,result);
		}
		
		
		/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
        */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수1 : ");
//		int jong1 = sc.nextInt();
//		
//		System.out.println("(+,-,*,/) 중에 하나를 입력하세요 : ");
//		String eq = sc.next();
//		
//		System.out.println("정수2 : ");
//		int jong2 = sc.nextInt();
//		int result = 0;
//		
//		boolean flag = false;
//		
//		
//		switch(eq) {
//		
//		case "+" :  
//			result = jong1 + jong2;
//				break;
//		
//		case "-" :
//			result = jong1 - jong2;
//				break;
//		
//		case "*" :
//			result = jong1 * jong2;
//				break;
//		
//		case "/" :
//			result = jong1 / jong2;
//				break;
//		
//		default :
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
