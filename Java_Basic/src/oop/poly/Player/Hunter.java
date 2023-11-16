package oop.poly.Player;

public class Hunter extends Player {
	
	String pet;
	
	Hunter(String name) {
		super(name);
		this.pet = "재규어";
	}
	
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("펫 이름 : " + pet);
	}

}
