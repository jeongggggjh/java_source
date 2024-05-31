package pack04;

import pack04.Ex23Outer.Inner;

public class Ex23Main {

	public static void main(String[] args) {
		// 내부 클래스 연습용
		Ex23Outer outer = new Ex23Outer();
		outer.aa();
		outer.bb();
		// outer.cc();

		System.out.println();
		// Inner inner = new Inner(); // 내부 클래스는 독립적인 인스턴스 불가

		// 아래의 소스는 수행은 가능하나 현실적으로 사용하지 않음.
		// Ex23Outer.Inner inner = outer.new Inner();
		// inner.cc();
		System.out.println("----------------");
		outer.aa();
	}

}
