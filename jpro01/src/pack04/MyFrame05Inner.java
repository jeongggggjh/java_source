package pack04;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame05Inner extends Frame {
	// private Wevent wevent = new Wevent();
	// private Wevent wevent;
	private int x, y; // mouseClicked 에서 발생한 x, y 좌표를 기억
	private String[] names = {"정재형", "이원재", "지명기", "김성하", "김서현"};
	
	public MyFrame05Inner() {
		setTitle("내부 클래스");
		
		setSize(300, 250);
		setLocation(200, 200);
		setVisible(true);
		
		// wevent = new Wevent();
		// addWindowListener(wevent);
		
		addWindowListener(new Wevent());
		addMouseListener(new Mevent());
	}
	
	class Wevent extends WindowAdapter { // 내부 클래스
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	class Mevent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// int x = e.getX(); // 지역변수에 값 치환
			// int y = e.getY();
			x = e.getX();
			y = e.getY();
			setTitle("x : " + x + ", y : " + y);
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			setBackground(new Color(r, g, b));
			
			paint(getGraphics()); // 자동호출되는 paint()을 명시적으로 호출
			repaint(); // Graphics 객체를 가진 paint()를 호출. refresh 됨
		}
	}
	
	@Override
	public void paint(Graphics g) { // 자동 호출이 기본
		// Graphics : Frame이 제공하는 그림그리기 객체
		// g.drawString("홍길동", 100, 100);
		g.setFont(new Font("굴림", Font.BOLD, (int)(Math.random() * 50 + 8)));
		
		int n = (int)(Math.random() * 5);
		// g.drawString("홍길동", x, y);
		g.drawString(names[n], x, y);
	}
	
	public static void main(String[] args) {
		new MyFrame05Inner();

	}

}
