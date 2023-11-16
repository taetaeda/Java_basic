package etc.api.util.arrays;

import java.util.Arrays;
import java.util.Collections;

import javax.swing.RowFilter.ComparisonType;

public class ArraysQuiz {


	//		/*
	//        - 참가한 사람의 이름이 담긴 배열 participant와
	//        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
	//        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
	//        완주하지 못한 자는 1명이라고 가정합니다.
	//		 */
	//
	//		Arrays.sort(participant);
	//		Arrays.sort(completion);
	//
	//		for(int i = 0; i<completion.length; i++) {
	//			if(!participant[i].equals(completion[i])) {
	//				return participant[i];
	//			}
	//		}
	//
	//		return participant[participant.length-1];
	//
	//		
	//
	//	}
	//
	//	public static void main(String[] args) {
	//
	//		String [] participant = {"원정욱","성삼경","유훈모","김한솔","강희수"};
	//		String [] completion = {"성삼경","유훈모","김한솔","강희수"};
	//		System.out.println(participant.length);
	//		System.out.println(Arrays.toString(participant));
	//		System.out.println(Arrays.toString(completion));
	//		
	//		System.out.println("완주하지 못한 자: " + solution(participant, completion));
	//	}
	//
	//}
	/*
//      - 참가한 사람의 이름이 담긴 배열 participant와
//      완주한 사람의 이름이 담긴 배열 completion이 주어질 때
//      완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
//      완주하지 못한 자는 1명이라고 가정합니다.
//		 */	


	public static String solution(String[] participant,String [] completion){

		Arrays.sort(participant);
		Arrays.sort(completion);

		for(int i = 0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
				
			
		} 
		return participant[participant.length-1];



	}
	public static void main(String[] args) {


		String [] participant = {"원정욱","성삼경","유훈모","김한솔","강희수"};
		String [] completion = {"성삼경","유훈모","김한솔","강희수"};
		
		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));
		
		System.out.println("완주하지 못한자는: " + solution(participant, completion));













	}
}

