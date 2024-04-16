package pack02other;

import pack02.Ex06Bank; // 다른 패키지에 있는 클래스 읽기
// import pack02.*; pack02의 모든 클래스 읽기 : 비권장 - 메모리 낭비

public class Ex06Main2 {

	public static void main(String[] args) {
		// 프로젝트는 같으나 다른 패키지에 있는 Ex06Bank 클래스를 사용
		Ex06Bank kildong = new Ex06Bank();
		// System.out.println("a : " + kildong.a); // default 불가능 
		System.out.println("b : " + kildong.b); // public 가능

	}

}
