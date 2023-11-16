package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		
Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("주민등록번호: ");
			String a = sc.nextLine();
			a = a.replace("-", "");
			if(a.length() != 13) {
				System.out.println("주민등록번호 13자리를 다시 입력해주세요.");
				continue;
			}
			
			// 주민등록번호에서 성별 구분
			char gender = a.charAt(6);
			if(gender == '1' || gender == '3') {
				System.out.println("남자입니다.");
			}else if(gender == '2' || gender == '4') {
				System.out.println("여자입니다.");
			}else {
				System.out.println("성별 정보를 알 수 없습니다.");
			}
			break;
			
			
			// 
		}
	}

}
