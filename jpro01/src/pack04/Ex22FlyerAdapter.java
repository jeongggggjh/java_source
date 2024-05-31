package pack04;

// Adapter란 이름이 붙은 클래스는 인터페이스를 구현해 추상을 일반 메소드로 작성
// 그리고 자신은 추상클래스가 됨

abstract public class Ex22FlyerAdapter implements Ex22Flyer {
	@Override
	public void fly() {

	}

	@Override
	public boolean isAnimal() {
		return false;
	}

	@Override
	public void happy() {

	}

}
