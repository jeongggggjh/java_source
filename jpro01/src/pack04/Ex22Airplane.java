package pack04;

public class Ex22Airplane implements Ex22Flyer {
	@Override
	public void fly() {
		System.out.println("커다란 엔진 소리를 내며 인천공항에서 이륙함");
		
	}
	@Override
	public boolean isAnimal() {
		return false;
	}
	@Override
	public void happy() {
		// TODO Auto-generated method stub
		
	}
}
