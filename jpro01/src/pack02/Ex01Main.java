package pack02;

public class Ex01Main {

	public static void main(String[] args) { // 응용 프로그램의 시작. 즉, main을 위한 클래스일 뿐.
		System.out.println("이런 저런 작업을 하다가..");
		int a = 1;
		System.out.println("기본형 변수 a가 기억한 값 : " + a);
		// 자동차 객체를 만들고 싶음

		Ex01Car car1 = new Ex01Car(); // 클래스 --> 인스턴스화 --> 인스턴스(객체)

		// Ex01Car : 보조기억장치에 있는 Ex01Car.class를 주기억장치로 로딩
		// car1 : 객체 변수 - 객체의 주소를 기억
		// new : 인스턴스화를 위한 키워드
		// Ex01Car() : 생성자를 호출

		System.out.println("Ex01Car 타입의 생성된 객체 주소 : " + car1);
		System.out.println("바퀴 수 : " + car1.wheel);
		car1.abc();

		// car1.def(); private이므로 호출 불가.

		System.out.println("객체 하나 더 생성");

		Ex01Car car2 = new Ex01Car();
		System.out.println("Ex01Car 타입의 생성된 객체 주소 : " + car2);
		System.out.println("바퀴 수 : " + car2.wheel);
		car2.abc();

		System.out.println();
		System.out.println(car1.getClass());
		System.out.println(car2.getClass());
		System.out.println(car1.getClass() == car2.getClass());
		System.out.println(car1 == car2);

	}

}
