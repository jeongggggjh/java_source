package pack03;

public class Ex11MyCoinIn {
	private int coin, jandon;

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public String calc(int cupCount) {
		String msg = "";
		if(coin < 200) {
			msg = "요금이 부족합니다.";
		}
		return msg;
	}

}
