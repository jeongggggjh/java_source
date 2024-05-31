package pack02;

public class Ex08SingletonClass {
	int kor = 90;
	
	public Ex08SingletonClass() {
		
	}
	
	// 객체의 인스턴스가 오직 1개만 생성되는 패턴을 만들기
	// 장점 : 메모리 절약, 데이터 공유 편리
	// 단점 : 테스트가 불편, 유연성이 떨어짐
	
	private static Ex08SingletonClass class1 = new Ex08SingletonClass();
	
	public static Ex08SingletonClass getInstance() {
		return class1;
	}
}
