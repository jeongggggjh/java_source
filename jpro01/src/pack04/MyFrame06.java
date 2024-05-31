package pack04;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame06 extends Frame {
	
	public MyFrame06(String msg) {
		super(msg);
		
		setTitle("내부 클래스");
		
		setSize(300, 250);
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// setBackground(new Color(0, 0, 255));
				setBackground(Color.BLUE);
			}
		});
	}

	public static void main(String[] args) {
		// 내부 무명 클래스 
		new MyFrame06("내부 무명 클래스");

	}

}
