package basic.loop;

import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
        # 사용자에게 구구단 단수를 입력받아서
        해당 단수의 구구단을 출력해 보세요.
        ex)
        
        구구단을 입력하세요: 4
        *** 구구단 4 단 ***
        4 x 1 = 4
        4 x 2 = 8
        4 x 3 = 12
        4 x 4 = 16 
        .
        .
        .
        4 x 9 = 36
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 입력하세요: ");
		int i = sc.nextInt();
		System.out.println("***구구단 " + i + "단 ***");
		
//			if (i<=9) {
//				int a = 1;
//				while(a<=9) {
//					System.out.println(i + "x" + a + "=" + i*a);
//					a++;
//				}
//			}
			
			int hang = 1;
			while(hang <= 9) {
				System.out.printf("%d x %d = %d\n", i, hang, i*hang);
				hang++; // 선생님이 알려준 방법
			}
			
			
		
	}

}
