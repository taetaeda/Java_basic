package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Box<Integer, String> b = new Box<>(1, "원정욱");
		String name = b.get(1);
		b.put(10, "유훈모");
		System.out.println(b);
		

	}

}
