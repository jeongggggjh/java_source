package pack02;

public class Ex02Main {

	public static void main(String[] args) {
		// getter, setter 연습
		System.out.println("프로그램을 실행하다가 ...");
		
		// Ex02Car 객체를 만들기
		System.out.println();
		Ex02Car tom = new Ex02Car();
		tom.showData();
		System.out.println("이름은 " + tom.irum);
		tom.irum = "미스터 톰"; // private 이 아니므로 접근 가능.
		System.out.println("이름은 " + tom.irum);
		System.out.println("겟터, 셋터 확인");
		// tom.speed = 80; // private 이므로 접근 불가.
		// tom.abcd(80, 123); // 예를 들어, 비밀번호에 의해 수정 결정
		tom.setSpeed(80); // speed 에만 집중
		tom.showData();
		System.out.println("속도는 " + tom.getSpeed());
		int result = tom.getSpeed();
		System.out.println("속도는 " + result);
		
		
	}

}
