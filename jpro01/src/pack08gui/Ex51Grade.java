package pack08gui;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex51Grade extends JFrame implements ActionListener {
	JTextField name, kor, eng, math;
	JLabel lblTotal, lblAvg, lblGrade;
	JButton btnCheck, btnReset;
	Image image;
	int x = 100, y = 100;
	int selImage = 1;
	
	public Ex51Grade() {
		setTitle("성적 출력");

		layoutInit();

		setBounds(200, 200, 400, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	/*
	@Override
	public void paint(Graphics g) {
		switch(selImage) {
		case 1 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\따봉흥민.jpeg");
			break;
		case 2 :
			image = Toolkit.getDefaultToolkit().getImage("C:\\work\\jsou\\jpro01\\src\\pack08gui\\지친흥민.jpeg");
			break;
		}
	
	}
	*/
	
	private void layoutInit() {
		setLayout(new GridLayout(5, 1));
		// 1행
		JLabel irum = new JLabel("이름 : ");
		name = new JTextField("", 10);
		JPanel panel1 = new JPanel();
		panel1.add(irum);
		panel1.add(name);
		add(panel1); 

		// 2행
		JLabel ko = new JLabel("국어 : ");
		JLabel en = new JLabel("영어 : ");
		JLabel ma = new JLabel("수학 : ");
		kor = new JTextField("", 5);
		eng = new JTextField("", 5);
		math = new JTextField("", 5);
		JPanel panel2 = new JPanel();
		panel2.add(ko);
		panel2.add(kor);
		panel2.add(en);
		panel2.add(eng);
		panel2.add(ma);
		panel2.add(math);
		add(panel2);
	
		// 3행
		lblTotal = new JLabel("총점 : ");
		lblAvg = new JLabel("평균 : ");
		lblGrade = new JLabel("평가 : ");
		JPanel panel3 = new JPanel();
		panel3.add(lblTotal);
		panel3.add(lblAvg);
		panel3.add(lblGrade);
		
		add(panel3);
	
		// 4행
		btnCheck = new JButton("확인");
		btnReset = new JButton("초기화");
		btnCheck.addActionListener(this);
		btnReset.addActionListener(this);
		JPanel panel4 = new JPanel();
		panel4.add(btnCheck);
		panel4.add(btnReset);
		

		add(panel4);
		
		// 5행
		
		JLabel img1 = new JLabel(new ImageIcon("C:\\work\\jsou\\jpro01\\src\\pack08gui\\따봉흥민.jpeg"));
		add(img1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 확인 버튼
		if (e.getSource() == btnCheck) {
			// 오류 검사
			if (name.getText().equals("")) {
				lblTotal.setText("이름 입력!");
				name.requestFocus();
				return;
			}
			if (kor.getText().equals("")) {
				lblTotal.setText("성적 입력!");
				kor.requestFocus();
				return;
			}
			if (eng.getText().equals("")) {
				lblTotal.setText("성적 입력!");
				eng.requestFocus();
				return;
			}
			if (math.getText().equals("")) {
				lblTotal.setText("성적 입력!");
				math.requestFocus();
				return;
			}

			// 숫자 = 정수
			int korsu = 0;
			try {
				korsu = Integer.parseInt(kor.getText());
			} catch (Exception e2) {
				lblTotal.setText("성적란엔 정수만 가능");
				kor.requestFocus();
				return;
			}
			int engsu = 0;
			try {
				engsu = Integer.parseInt(eng.getText());
			} catch (Exception e2) {
				lblTotal.setText("성적란엔 정수만 가능");
				eng.requestFocus();
				return;
			}
			int mathsu = 0;
			try {
				mathsu = Integer.parseInt(math.getText());
			} catch (Exception e2) {
				lblTotal.setText("성적란엔 정수만 가능");
				math.requestFocus();
				return;
			}
			// 총점, 평균, 평가 
			int res, av;
			res = korsu + engsu + mathsu;
			av = res / 3;
			String mes = "총점 : " + res;
			String mes1 = "평균 : " + av;
			if(av > 100) {
				JOptionPane.showMessageDialog(this, "평균이 100점을 넘었습니다.");
			}
			lblTotal.setText(mes);
			lblAvg.setText(mes1);
			
			switch(av) {
			case 90 : 
				lblGrade.setText("평가 : A");
				break;
			case 80 : 
				lblGrade.setText("평가 : B");
				break;
			case 70 : 
				lblGrade.setText("평가 : C");
				break;
			case 60 : 
				lblGrade.setText("평가 : D");
				break;
			default : 
				lblGrade.setText("평가 : E");
				break;
				}
				
			} else if (e.getSource() == btnReset) {
				name.setText("");
				kor.setText("");
				eng.setText("");
				math.setText("");
				lblTotal.setText("총점 : ");
				lblAvg.setText("평균 : ");
				lblGrade.setText("평가 : ");
			}
					
		}			
	
	public static void main(String[] args) {
		new Ex51Grade();

	}

}
