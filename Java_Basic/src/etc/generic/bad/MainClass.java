package etc.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
        Object타입으로 선언하면 무엇이든 저장할 수는 있지만
        반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야하는
        문제가 발생합니다.
        잘못 형 변환 했을 시에는 예외가 발생할 수도 있습니다.
        */
		
		
		Box box = new Box();
		box.setObj(new String("원정욱"));
		
		System.out.println(((String) box.getObj()).charAt(0));
		//                      2          1          3

		
		Box p = new Box();
		box.setObj(new Person());
		
		Person p2 = (Person) p.getObj();   // person 객체가 되야지 들어갈 수 있으니 앞에 person붙침
	}

}
