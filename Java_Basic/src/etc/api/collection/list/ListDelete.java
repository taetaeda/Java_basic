package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> honmopan = new ArrayList<>();
		Collections.addAll(honmopan, "원정욱","성삼경","강희수","정재현","김한솔");
		System.out.println("현재 저장된 친구들:" + honmopan);
		System.out.println("삭제할 친구를 입력하세요: ");
		String name = sc.next();
		
		/*
		  -입력받은 이름을 리스트 내에서 삭제하세요.
		  삭제 후 결과도 출력하세요
		  없으면 없는 이름이라고 출력하세요.
		 */
		
		System.out.println(honmopan);
		
		if(honmopan.contains(name)) {
		honmopan.remove(name);
		System.out.println("삭제 후 정보:" + honmopan);
		}else {
			System.out.println("없는데여~");
		}
	}

}
