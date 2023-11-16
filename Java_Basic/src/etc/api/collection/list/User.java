package etc.api.collection.list;

public class User {

	private String name;
	private int age;
	
	/*
    1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현
     User클래스의 생성자는 모든 필드값을 받는 생성자 1개.
     
    2. User 객체를 모음저장할 수 있는 ArrayList를 선언. (main method)
    3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)
    
    4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문)
    5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면 
          그 객체를 삭제해 주세요. (일반 for문)
    */
	
	public User(String name,int age) {
		super();
		this.name=name;
		this.age=age;
		
	}

	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age + "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
