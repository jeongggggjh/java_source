package pack03;

import java.awt.Frame;

// 자바가 제공하는 Frame 클래스로 창 띄우기 : 포함 관계

public class MyFrame01 {
	private String title = "포함관계";
	private Frame frame;
	
	public MyFrame01() {
		frame = new Frame(title);
	}
	
	private void display() {
		frame.setSize(500, 300);
		frame.setLocation(200, 150);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame01().display();
		
	}

}
