package oop.abs.quiz1;

public class Score {
	
	/*
	         - Score 객체를 담을 수 있는 배열을 선언하세요.
	          배열의 크기는 넉넉하게 100개로 하겠습니다.
	          
	         - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
	         입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
	         총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
	         (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
	         객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
	         이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.
	         
	         - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
	          scoreInfo()를 모두 불러주세요. (반복문)
	          주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
	          모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
	         */
	
	

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public Score() {}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = this.total /3.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	public void scoreInfo() {
		System.out.printf("이름 : %s\n 국어: %d점\n 영어: %d점\n 수학: %d점\n총점: %d\n점 평균 : %.2f점\n" ,
				name,kor,eng,math,total,average);

	}
	
	
	
}
