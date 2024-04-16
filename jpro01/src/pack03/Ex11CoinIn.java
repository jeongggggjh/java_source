package pack03;

public class Ex11CoinIn {
	private int coin;
	private int jandon;
	
	public void setCoin(int coin) {
		this.coin = coin;
	}

	public String calc(int cupCount) {
		String msg = "";
		if(coin < 200) {
			msg = "요금이 부족합니다.";
		}
		else if(cupCount * 200 > coin) {
			msg = "요금이 부족합니다.";
		}
		else {
			jandon = coin - (cupCount * 200);
			msg = "커피 " + cupCount + "잔과 잔돈 " + jandon + "원";
		}
		return msg;
	}
}
