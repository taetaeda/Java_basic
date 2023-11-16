package oop.poly.Player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	Player() {

		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	
	Player(String name){
		this();   
		
		this.name = name; // this 붙치면 이 열에게 집중해라 느낌
	}
	
	void attack(Player target) {
		

		System.out.println("----------------------------------------");
		
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		
		System.out.printf("%s(이)가 %s(을)를 공격합니다.\n",this.name,target.name);
		
		
		
		target.hp -= 10; 
		this.hp += 5; 
		System.out.printf("정욱오크1(님) 체력: %d, 훈모zl존1(님) 체력: %d\n",
				this.hp,target.hp);
		
		
		
		
	}
	
	Player(String name, int hp){
		this(name);
		//System.out.println("Player 의 3번 생성자 호출!");
		//this.name = name;
		this.hp = hp;
	}
	
	
	
	
	void characterInfo(){
		
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디 : "+ name);
		System.out.println("# 레벨 : "+ level);
		System.out.println("# 공격력 : "+ atk);
		System.out.println("# 체력 : "+ hp);
//		System.out.println("이 메서드를 호출한 객체의 이름은: "+ this.name);
		
		
	}
}
