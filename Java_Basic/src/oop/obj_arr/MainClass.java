package oop.obj_arr;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Person won = new Person("원정욱",26,"중성");
//		Person you = new Person("유훈모",25,"초인");
//		Person kang = new Person("강희수",29,"로인");

		
//		won.personInfo();
//		you.personInfo();
//		kang.personInfo();
		
		
//		int[] arr = new int[5];
//		Person [] people = new Person[3];
//		people[0] = new Person("원정욱",26,"중성");

		
//		int [] arr = {1,2,3,4,5};
		
		Person[] people = {
				new Person("원정욱",26,"중성"),
				new Person("유훈모",25,"초인"),
				new Person("강희수",29,"로인")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
//		for(int i = 0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p:people) {
			p.personInfo();
		}
		
	
 		
		
		
		
		
		
		
		
		
	}

}
