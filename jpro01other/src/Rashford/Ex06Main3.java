package Rashford;

import pack02.Ex06Bank;

public class Ex06Main3 {

	public static void main(String[] args) {
		// 프로젝트가 다른곳에서 Ex06Bank를 사용하려면
		Ex06Bank kildong = new Ex06Bank();
		kildong.deposit(5000);
		kildong.withDraw(2000);
		System.out.println("kildong 예금액 : " + kildong.getMoney());
	}

}
