package pack02;

public class Ex06Main {

	public static void main(String[] args) {
		// 같은 패키지에 있는 Ex6Bank 클래스를 사용
		Ex06Bank kildong = new Ex06Bank();
		kildong.deposit(5000);
		kildong.withDraw(2000);
		System.out.println("kildong 예금액 : " + kildong.getMoney());
		// kildong.money; // 에러 : private 멤버이므로 해당 클래스에서만 참조.
		System.out.println("a : " + kildong.a); // default 가능
		System.out.println("b : " + kildong.b); // public 가능

		System.out.println();
		Ex06Bank dajeong = new Ex06Bank(2000);
		dajeong.deposit(5000);
		dajeong.withDraw(2000);
		System.out.println("dajeong 예금액 : " + dajeong.getMoney());

		System.out.println("객체 주소 관련------------");
		System.out.println("kildong 주소 : " + kildong + " " + kildong.hashCode());
		System.out.println("dajeong 주소 : " + dajeong + " " + dajeong.hashCode());

		Ex06Bank tom = null;
		System.out.println("tom 주소 : " + tom);
		// System.out.println("tom 예금액 : " + tom.getMoney()); // NullPointerException
		tom = dajeong; // 주소 치환
		System.out.println("tom 예금액 : " + tom.getMoney());

		if (dajeong == tom) {
			System.out.println("둘은 같은 주소");
		} else {
			System.out.println("둘은 다른 주소");
		}
		
		System.out.println();
		if (dajeong == kildong) {
			System.out.println("둘은 같은 주소임을 알림");
		} else {
			System.out.println("둘은 다른 주소야");
		}
		
		System.out.println();
		if (dajeong instanceof Ex06Bank) {
			// instanceof : 객체 타입 비교 연산자
			System.out.println("Ex06Bank 타입이 맞아요.");
		} else {
			System.out.println("ㅠ ㅠ Ex06Bank 타입이 아니군요.");
		}

		System.out.println("\nString 타입의 값 비교----------");
		
		String ss1 = "kor"; // String 클래스 : 기본형 처럼 사용 할 수 있도록 자바가 배려.
		String ss2 = new String();
		ss2 = "kor";
		String ss3 = new String("kor");
		
		System.out.println(ss1 + " " + ss2 + " " + ss3);
		
		if(ss1 == ss2) {
			System.out.println("같음1");
		}
		else {
			System.out.println("다름1");
		}
		
		if(ss1 == ss3) {
			System.out.println("같음2");
		}
		else {
			System.out.println("다름2");
		}
		
		// 그러므로 결론은 String은 주소 비교가 아니라, 값을 비교하는 것이 목적이므로 equals() 사용
		
		if(ss1.equals(ss2)) { // 값 비교
			System.out.println("같음3");
		}
		else {
			System.out.println("다름3");
		}
		
		if(ss1.equals(ss3)) { // 값 비교
			System.out.println("같음4");
		}
		else {
			System.out.println("다름4");
		}
		
		if(ss2.equalsIgnoreCase(ss3)) { // 값 비교 (영문 대소문자 구분 안 함)
			System.out.println("같음5");
		}
		else {
			System.out.println("다름5");
		}
		
	}

}
