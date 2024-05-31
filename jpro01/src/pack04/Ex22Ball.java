package pack04;

// 인터페이스를 구현하고 모든 추상 메소드를 오버라이드 하는 지옥에서 벗어날 수 있음.
// 추상을 일반 메소드로 만들어 둔 어댑터 클래스를 상속받아 선택적으로 메소드를 작성.

// public class Ex22Ball implements Ex22Flyer {

public class Ex22Ball extends Ex22FlyerAdapter {
	@Override
	public void fly() {
		System.out.println("공이 관중석으로 날아감");
	}
}
