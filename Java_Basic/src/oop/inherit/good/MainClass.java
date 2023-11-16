package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();
		
		System.out.println("------");
		
		Hunter w2 = new Hunter();
		w2.level = 1;
		w2.atk = 10;
		w2.hp = 20;
		w2.name = "헌터1";
		w2.pet = "wolf";
		w2.characterInfo();
		
		System.out.println("------");
		
//		Mage w3 = new Mage();
//		w3.level = 3;
//		w3.atk = 1;
//		w3.hp = 15;
//		w3.name = "마법사1";
//		w3.mana = 30;
//		w3.characterInfo();
	}

}
