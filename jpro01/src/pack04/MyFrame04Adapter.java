package pack04;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 어댑터 클래스를 이용한 이벤트 처리 연습
// WindowAdapter 추상 클래스는 WindowListener 인터페이스를 구현한 클래스
// WindowListener의 추상 메소드가 WindowAdapter에서 일반 메소드로 오버라이드(재정의)

public class MyFrame04Adapter extends WindowAdapter { // 상속
	private Frame frame;

	MyFrame04Adapter() {
		frame = new Frame("Adapter 연습"); // 포함

		frame.setSize(300, 250);
		frame.setLocation(200, 200);
		frame.setVisible(true);

		frame.addWindowListener(this);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 선택적으로 필요한 메소드를 오버라이딩 할 수 있다.
		System.exit(0);
	}

	public static void main(String[] args) {
		new MyFrame04Adapter();
	}
}
