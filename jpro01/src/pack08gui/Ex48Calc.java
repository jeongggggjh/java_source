package pack08gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex48Calc extends JFrame implements ActionListener {
	JTextArea txtArea = new JTextArea("", 10, 5);
	JButton btnCalc, btnReset, btnExit;
	JTextField int1, int2;
	ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton add, min, div, mul;
	JLabel lblResult;

	public Ex48Calc() {
		setTitle("미니 계산기");

		layoutInit();

		setBounds(200, 200, 400, 300);  
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

	}

	private void layoutInit() {
		setLayout(new GridLayout(5, 1));

		// 1행
		JLabel lbl1 = new JLabel("숫자 1 : ");
		int1 = new JTextField("", 10);
		JPanel panel1 = new JPanel();
		panel1.add(lbl1);
		panel1.add(int1);
		add(panel1); // Frame에 등록

		// 2행
		JLabel lbl2 = new JLabel("숫자 2 : ");
		int2 = new JTextField("", 10);
		JPanel panel2 = new JPanel();
		panel2.add(lbl2);
		panel2.add(int2);
		add(panel2); // Frame에 등록

		// 3행
		JLabel lbl3 = new JLabel("연산 선택  : ");
		add = new JRadioButton("+", true);
		min = new JRadioButton("-", false);
		mul = new JRadioButton("*", false);
		div = new JRadioButton("/", false);
		buttonGroup.add(add); // JRadioButton은 그룹화
		buttonGroup.add(min);
		buttonGroup.add(mul);
		buttonGroup.add(div);
		JPanel panel3 = new JPanel();
		panel3.add(lbl3);
		panel3.add(add);
		panel3.add(min);
		panel3.add(mul);
		panel3.add(div);
		add(panel3);
		// 4행
		lblResult = new JLabel("결과 : ", JLabel.CENTER);
		add(lblResult);

		int1.requestFocus();

		// 5행

		btnCalc = new JButton("계산");
		btnReset = new JButton("초기화");
		btnExit = new JButton("종료");
		btnCalc.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);

		JPanel panel4 = new JPanel();
		panel4.add(btnCalc);
		panel4.add(btnReset);
		panel4.add(btnExit);

		add(panel4);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 계산 버튼
		if (e.getSource() == btnCalc) {
			// 오류 검사
			if (int1.getText().equals("")) {
				lblResult.setText("숫자 입력!");
				int1.requestFocus();
				return;
			}
			if (int2.getText().equals("")) {
				lblResult.setText("숫자 입력!");
				int2.requestFocus();
				return;
			}

			// 숫자 = 정수
			int su1 = 0;
			try {
				su1 = Integer.parseInt(int1.getText());
			} catch (Exception e2) {
				lblResult.setText("숫자는 정수만 가능");
				int1.requestFocus();
				return;
			}

			int su2 = 0;
			try {
				su2 = Integer.parseInt(int2.getText());
			} catch (Exception e2) {
				lblResult.setText("숫자는 정수만 가능");
				int2.requestFocus();
				return;
			}

			// 라디오 버튼 계산
			int calc = 0;
			if (add.isSelected()) {
				calc = su1 + su2;
			} else if (min.isSelected()) {
				calc = su1 - su2;
			} else if (mul.isSelected()) {
				calc = su1 * su2;
			} else if (div.isSelected()) {
				if(su1 == 0) {
					lblResult.setText("0으로 나누기 불가능");
					int1.setText("");
					return;
				}
				else if(su2 == 0) {
					lblResult.setText("0으로 나누기 불가능");
					int2.setText("");
					return;
				} else
				calc = su1 / su2;
				
			}

			String res = "결과 : " + calc;
			
			lblResult.setText(res);
			
		} 
		// 초기화 버튼
		else if (e.getSource() == btnReset) {
			int1.setText("");
			int2.setText("");
			add.setSelected(true);
			min.setSelected(false);
			mul.setSelected(false);
			div.setSelected(false);
			lblResult.setText("결과 : ");
			
		} 
		// 종료 버튼
		else if (e.getSource() == btnExit) {
			int result = JOptionPane.showConfirmDialog(this, "정말 종료 하시겠습니까 ?", "", JOptionPane.YES_NO_OPTION);
			switch (result) {
			case JOptionPane.YES_OPTION:
				System.exit(0);
				break;
			case JOptionPane.NO_OPTION:
				break;
			}
		}

	}

	public static void main(String[] args) {
		new Ex48Calc();

	}

}
