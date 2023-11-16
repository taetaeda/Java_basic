package oop.this_super;

public class Hunter extends Player {
	String pet;
	
	Hunter(String name){
		super(name);
	}
	
	@Override
	void characterInfo() {
		
		super.characterInfo();
		System.out.println("# 펫 이름: " + this.pet);
	}
}
