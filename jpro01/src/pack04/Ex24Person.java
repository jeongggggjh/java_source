package pack04;

public class Ex24Person {
	public Ex24Saram getSaram() {
		// return new Ex24Saram();
		
		return new Ex24Saram()
		{	// 내부 무명 클래스 
			public String getIr() { // Ex24Saram 클래스의 메소드를 오버라이딩
				return "홍길동";
			}
		};
	}
}
