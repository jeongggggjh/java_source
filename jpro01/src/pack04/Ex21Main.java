package pack04;

public class Ex21Main {

	public static void main(String[] args) {
		Ex21Radio radio = new Ex21Radio();
		radio.volOn();
		radio.volUp(5);
		radio.volDown(2);
		radio.showVol();
		radio.volOff();
		radio.showVol();

	}

}
