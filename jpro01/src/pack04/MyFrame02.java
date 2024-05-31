package pack04;

import java.awt.Frame;

public class MyFrame02 extends Frame {
	public MyFrame02() {
		// 생성자
		super("상속 사용");
	}
	
	void display() {
		setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// 상속으로 Frame 띄우기
		MyFrame02 frame = new MyFrame02();
		frame.display();
	}
	
}
