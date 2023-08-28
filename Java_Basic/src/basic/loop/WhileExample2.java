package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		// 48~150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?
		
		// 이 부분 못썼어요
		
//		int a = 48;
//		while(a <= 150) {
//			if(a%8 == 0) {
//				System.out.println(a + "");
//			}
//			a++;
//		}
//		
		// 1~100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
//		int i = 1;
//		while(i<=100) {
//			if(i%4==0 && i%8 !=0) {
//				System.out.println(i + "");
//			}
//			i++;
//		}
//		
//		
		// 1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
//		int j = 1;
//		int count = 0; // 배수의 개수를 세 줄 변수
//		while(j<=30000) {
//			if(j%258 == 0) {
//			count++;	
//			}
//			j++;
//		}
//		System.out.println("1~30000중 258의 배수의 개수: " + count + "개");
//		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		int k = 1 ;
		int con = 0; // 약수의 개수를 세어 줄 변수
		while(k<=1000) {
			if(1000 % k == 0) {
			con++;
			}
			k++;
		}
		System.out.println("1000의 약수의 개수: " + con + "개");
//		System.out.println("1000의 약수의 개수: %d개\n", con); 이거 왜 안되는거지?
	}

}
