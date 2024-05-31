package pack04;

abstract public class Ex18Animal {
	abstract public String name(); // 추상 메소드
	abstract public String eat(); 
	abstract public String action();
	
	public void animalPrint() {
		System.out.println("동물 추상 클래스의 일반 메소드");
	}
}
