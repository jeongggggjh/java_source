package pack;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DbTest08Damdang extends JFrame implements ActionListener {
	
	JTextField name = new JTextField("", 5);
	JTextField jumin1 = new JTextField("", 6);
	JTextField jumin2 = new JTextField("", 7);
	JLabel result = new JLabel();
	
	JButton check = new JButton("확인");
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public DbTest08Damdang() {
		super("ㅎㅅㅎ");
		
		accDb();
		layInit();
		
		setBounds(200, 200, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void layInit() {
		// 1행
		JLabel lbl1 = new JLabel("이름 : ");
		name = new JTextField("", 5);
		JPanel panel1 = new JPanel(); 
		panel1.add(new JLabel("이름 : "));	
		panel1.add(name);
		add("North",panel1);
		
		// 2행
		JLabel lbl2 = new JLabel("주민번호 : ");
		jumin1 = new JTextField("", 6);
		jumin2 = new JTextField("", 7);
		JPanel panel2 = new JPanel(); 
		panel2.add(new JLabel("주민번호 : "));
		panel2.add(jumin1);
		panel2.add(jumin2);
		panel2.add(check);
		add(panel2);
		
		// 3행
		result = new JLabel("담당직원 정보\n사번\t이름\t부서\t직급\t연봉", JLabel.CENTER);
		JPanel panel3 = new JPanel();
		
		add(result);
		

		
		
		
		check.addActionListener(this);
		
	}
	private void accDb() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			processDb();
		} catch (Exception e) {
			System.out.println("accDb err : " + e);
		}
	}
	private void processDb() {
		try {
			String url="jdbc:mariadb://localhost:3306/test";
			conn = DriverManager.getConnection(url, "root", "123");
									
			
		} catch (Exception e) {
			System.out.println("processDb err : " + e);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new DbTest08Damdang();

	}

}
