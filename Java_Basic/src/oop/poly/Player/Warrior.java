package oop.poly.Player;

public class Warrior extends Player { //player 에 최상위 부모는 object다

	int rage;
	
	Warrior(String name){
		// 비어있는 기본에 super(); 이 삽입이 되어있다 눈에는 안보인다.
		// 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		// 부모의 속성과 기능이 실존하게 되고, 물려 줄 수 있기 때문입니다.
		// player() 나 warrior() 다 부모 요소가 있다.
		super(name);
		this.rage = 30;
	}
	
	
		  
			 
	
	
	/*
    - 전사의 고유 기능인 rush 메서드를 작성합니다.
    
    - rush의 대상은 모든 직업들 입니다.
    
    - 만약 rush의 대상이 전사라면 10의 피해를 받고,
     마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
     
    - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
    
    - 남은 체력도 출력해 주세요.
    
    - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
    */
		public void rush(Player p) {
			int damage;
			if(p instanceof Warrior) {
				damage =10; 
				
			}else if(p instanceof Mage) {
				damage =20;
				
			}else {
				damage =15;
			}
			p.hp -=damage; 
			System.out.printf("%s 가 %s에게 %d 를 주었습니다.\n"
					,this.name,p.name,damage);
			System.out.println("남은체력: " + p.hp);
		}
	
		
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
}
