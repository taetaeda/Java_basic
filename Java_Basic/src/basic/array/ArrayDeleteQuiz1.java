package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] won = {"원정욱1","원정욱2","원정욱3","원정욱4","원정욱5"};
		System.out.println("내 복제본: "+ Arrays.toString(won));
		
		
		/* 
		 1. 삭제할 친구들 입력을 받아서 삭제를 진행해주세요.
		 
		 2. 입력받은 이름이 없다면 없다고 얘기해주세여.
		 
		 3. 배열의 길이가 0이 될 때까지 삭제를 반복해주세요.
		 더 이상 지울 친구가 없다면 프로그램 종료
		 
		 */
		
		
		for(int i=0; i < won.length-1; i++) {
			won[i] = won[i+1];
		}
		System.out.println(Arrays.toString(won));

		
		String [] wons = new String[won.length-1];
		
	
		while(true) {
			
			if(won.length == 0) {
				System.out.println("더 이상 삭제할 친구가 없네요");
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.print("삭제를 원하는 친구들 입력하세요: ");
			String name = sc.next();
			boolean flag = false;
			for(int i=0; i<won.length; i++) {
				if(name.equals(won[i])) {
					flag = true;
					for(int j=i; j<won.length-1; j++) {
						won[j] = won[j+1];
					}
					break;
				}
			}
			if(!flag) { // flag가 false?
				System.out.println(name + "(은)는 없는 이름입니다.");
			}else {
				String []temp = new String[won.length-1];
				for(int k=0; k<temp.length; k++) {
					temp[k] = won[k];
				}
				won = temp; temp = null;
				
				System.out.println("삭제 후 정보: " + Arrays.toString(won));
			}
		}
		
		
		sc.close();
	}

}
