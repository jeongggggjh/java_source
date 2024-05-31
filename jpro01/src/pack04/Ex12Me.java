package pack04;

public class Ex12Me extends Ex12Father {
	public Ex12Me() { // 멤버 필드에 final 붙이면 값 수정 불가.
		// super(); // 생략 가능
		System.out.println("내 생성자");
		// score = 80; 에러
	}
	
	public void biking() {
		System.out.println("자전거로 전국일주");
	}
	/*
	public String getHouse() { // 부모에서 final을 붙여서 오버라이딩 불가.
		return "집";
	}
	*/
}
