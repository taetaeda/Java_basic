package basic.loop;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
		
//		int dan = (int) (Math.random());
//		int count = 0;
//		
//		System.out.println("2가지의 정수를 입력하시오 : ");
//		
//		while()
//		sc.close();
		

		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int dcnt = 0;
		
		System.out.println("*** 덧샘 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해주세요.");
		
		while(true) {
		
			int rn1 = (int) ((Math.random()*100)+1);
			int rn2 = (int) ((Math.random()*100)+1);
			
			System.out.printf("%d + %d = ???\n" , rn1,rn2);
			int answer = sc.nextInt();

			if(answer == rn1+rn2) {
				System.out.println("정답입니다.");
				cnt++;
			}else if (answer == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("오답입니다.");
				dcnt++;
			}
				
			}
			
		
			System.out.println("--------------------------------");
		System.out.println("정답 횟수 : " + cnt + "개");
			System.out.println("오답 횟수 : " + dcnt + "개");
			
			
			
			
			while(true) {
				
				int rn1 = (int) ((Math.random()*100)+1);
				int rn2 = (int) ((Math.random()*100)+1);
				int num = (int) (Math.random()*2);
				
				int correct; //정답
				if(num == 0) {
					System.out.printf("%d + %d = ???\n" , rn1,rn2);
					correct= rn1 + rn2;
				}else {
					System.out.printf("%d - %d = ???\n" , rn1,rn2);
					correct= rn1 - rn2;
				}
				
				System.out.print(">");
				int answer = sc.nextInt();

				if(answer == correct) {
					System.out.println("정답입니다.");
					cnt++;
				}else if (answer == 0) {
					System.out.println("종료합니다.");
					break;
				} else {
					System.out.println("오답입니다.");
					dcnt++;
				}
					
				}
				
			
				System.out.println("--------------------------------");
				System.out.println("정답 횟수 : " + cnt + "개");
				System.out.println("오답 횟수 : " + dcnt + "개");
		}
				
		
	}


