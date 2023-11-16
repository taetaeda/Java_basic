package oop.abs.quiz;

public class Rect extends Shape{
	
	/*
    - Shape를 상속받는 Circle과 Rect 클래스를 생성해 주세요.
    
    - Circle 객체를 생성할 때, 반지름도 받아서 초기화 할 수 있는
     생성자를 선언해 주세요.
     Rect 객체를 생성할 때, 이름과 변의 길이를 받도록 처리해 주세요.
     
    - 오버라이딩이 강제되는 메서드에는 각 도형의 넓이를 구하는
     로직을 알아서 작성해 주세요.
     
    - MainClass에서 길이가 5인 정사각형,
     반지름이 4인 원의 모든 내용을 호출해 보세요.
    */
		
	private int width;
	private int height;
	private int side;
	
	public Rect(String name,int side) {
		super(name);
		this.side = side;
	}
	
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		if(side != 0) {
			return side * side;
		}else {
			return width * height;
		}
			
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private int width;
//		private int side;
//		private int height;
//		
//		public Rect(String name, int side) {
//			super(name);
//			this.side = side;
//		}
//		public Rect(String name, int width, int height) {
//			super(name);
//			this.width= width;
//			this.height= height;
//		}
//		
//		public double getArea() {
//			if(side != 0) {
//				return side * side ; //정사각형
//		}	else {
//			return width * height;     // 직사각형
//		}
//		}
//		public int getWidth() {
//			return width;
//		}
//		
//		public void setWidth(int width) {
//			this.width = width;
//		}
//		
//		public int getSide() {
//			return side;
//		}
//		
//		public void setSide(int side) {
//			this.side = side;
//		}
//		
//		public int getHeight() {
//			return height;
//		}
//		
//		public void setHeight(int height) {
//			this.height = height;
//		}
//		
		
		
	}

