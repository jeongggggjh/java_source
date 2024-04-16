package pack03;

import java.util.Scanner;

public class Ex11Machine {
	private int cupCount;
	private Ex11CoinIn coinIn = new Ex11CoinIn(); // 포함 관계
	
	public Ex11Machine() {
		
	}
	
	public void showData() {  
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		coinIn.setCoin(sc.nextInt());
		System.out.print("몇 잔을 원하세요 : ");
		cupCount = sc.nextInt();
	
		System.out.println(coinIn.calc(cupCount));
	}

	public int getCupCount() {
		return cupCount;
	}

	public void setCupCount(int cupCount) {
		this.cupCount = cupCount;
	}
		
}
