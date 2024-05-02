package pack08gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex50Packman extends JFrame implements KeyListener {
	Image image;
	int x = 100, y = 100;
	int selImage = 1;
	
	
	public Ex50Packman() {
		super("상하좌우 화살표를 사용하세요");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack1.jpg"));
		
		setLayout(null); // 배치관리자 없음.
		setResizable(false);
		setBounds(200, 200, 300, 300);
		setBackground(Color.WHITE);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addKeyListener(this);
		
		x = super.getWidth() / 2; // frame의 너비 절반
		y = super.getWidth() / 2; // frame의 높이 절반
	}
	
	@Override
	public void paint(Graphics g) {
		// Frame에 뭔가를 그려주는 메소드로 자동 호출
		switch(selImage) {
		case 1 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack1.jpg");
			break;
		case 2 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack2.jpg");
			break;
		case 3 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack3.jpg");
			break;
		case 4 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack4.jpg");
			break;
		case 5 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack5.jpg");
			break;
		case 6 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack6.jpg");
			break;
		case 7 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack7.jpg");
			break;
		case 8 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\pack8.jpg");
			break;
		}
		
		g.clearRect(0, 0, getWidth(), getHeight()); // 화면전체를 선택 후 클리어 : 잔상 해결
		
		g.drawImage(image, x - image.getWidth(this) / 2, y - image.getHeight(this) / 2, this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		// System.out.println("key : " + key);
		
		// 오른쪽 화살표
		if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_NUMPAD6) {
			// System.out.println("go");
			selImage = (selImage == 1) ? 2 : 1; // 삼항 연산자
			// x = x + 10;
			x = (x < getWidth() ? x += 10 : -image.getWidth(this));
		}
		if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_NUMPAD4) {
			// System.out.println("go");
			selImage = (selImage == 3) ? 4 : 3; // 삼항 연산자
			// x = x + 10;
			x = (x > 0 ? x -= 10 : getWidth() + 100);
		}
		if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_NUMPAD2) {
			// System.out.println("go");
			selImage = (selImage == 5) ? 6 : 5; // 삼항 연산자
			// x = x + 10;
			y = (y < getHeight() ? y += 10 : -image.getHeight(this));
		}
		if(key == KeyEvent.VK_UP || key == KeyEvent.VK_NUMPAD8) {
			// System.out.println("go");
			selImage = (selImage == 7) ? 8 : 7; // 삼항 연산자
			// x = x + 10;
			y = (y > 0 ? y -= 10 : getHeight() + 100);
		}
		repaint(); // paint() 호출
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex50Packman();
	}

}
