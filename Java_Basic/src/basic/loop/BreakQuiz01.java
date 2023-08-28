package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cCount = 0; // 맞춘 개수
		int iCount = 0; // 못 맞춘 개수
		
		System.out.println("*** 덧셈 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		while(true) {
			int rn1 = (int)((Math.random()*100) + 1);
			int rn2 = (int)((Math.random()*100) + 1);
			int num = (int)(Math.random()*2);
			
			int correct; //정답
			if(num == 0) {
				System.out.printf("%d + %d = ???\n", rn1, rn2);
				correct= rn1 - rn2;
			} else {
				System.out.printf("%d - %d = ???\n", rn1, rn2);
				correct= rn1 - rn2;
			}
			
			
			System.out.println(">");
			int answer = sc.nextInt();
			
			if(answer == rn1 + rn2) {
				System.out.println("정답입니다!");
				cCount++;
			} else if (answer==0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다~");
				iCount++;
			}
		}
		
	}

}
