package basic.constate;

import java.util.Scanner;

public class ifQuiz03 {

	public static void main(String[] args) {
		
		
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min 이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1: ");
		int a = sc.nextInt();
		System.out.println("정수2: ");
		int b = sc.nextInt();		
		System.out.println("정수3: ");
		int c = sc.nextInt();
		int max = 0;
		int mid = 0;
		int min = 0;
		
		
		
		if(a>b && a>c) {
			max = a;
			if(b>c) {
				mid= b;
				min= c;
			}else {
				mid = c;
				min = b;
			}
		}
		if(a<b && b>c) {
			max = b;
			if(a>c){
				mid = a;
				min = c;
			}else {
				mid = c;
				min = a;
			}
		}
		if(a<c && b<c) {
			max = c;
			if(a>b) {
				mid = a;
				min = b;
			}else {
				mid = b;
				min = a;
			}
		}	
			
		
		
		System.out.printf("가장 큰 값: %d 중간 값 : %d 가장 작은 값:%d ",max,mid,min);
		
		sc.close();
		

	}

}
