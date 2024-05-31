package pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DbTest07Sangpum extends JFrame implements ActionListener {
	
	JTextField txtCode = new JTextField("", 5);
	JTextField txtSang = new JTextField("", 5);
	JTextField txtSu = new JTextField("", 5);
	JTextField txtDan = new JTextField("", 5);
	JButton btnA = new JButton("추가");
	JTextArea txtResult = new JTextArea();
	String sql = "";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public DbTest07Sangpum() {
		super("상품 처리");
		
		accDb();
		layInit();
		
		setBounds(200, 200, 550, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	private void layInit() {
		JPanel panel1 = new JPanel(); 
		panel1.add(new JLabel("코드 : "));	
		panel1.add(txtCode);
		panel1.add(new JLabel("품명 : "));	
		panel1.add(txtSang);
		panel1.add(new JLabel("수량 : "));
		panel1.add(txtSu);
		panel1.add(new JLabel("단가 : "));
		panel1.add(txtDan);
		panel1.add(btnA);
		add("North", panel1);
		
		
		txtResult.setEditable(false); 
		JScrollPane pane = new JScrollPane(txtResult);
		add(pane);
		
		btnA.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String co = txtCode.getText();
			String sa = txtSang.getText();
			String su = txtSu.getText();
			String da = txtDan.getText();
			
			sql = "insert into sangdata values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, co);
			pstmt.setString(2, sa);
			pstmt.setString(3, su);
			pstmt.setString(4, da);
			rs = pstmt.executeQuery();
			
			display();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "이미 있는 상품코드 입니다.");
		}
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
			
			
			display();
			
			
		} catch (Exception e) {
			System.out.println("processDb err : " + e);
		}
	}
	private void display() {
		DecimalFormat df = new DecimalFormat("#,##0");
		try {
		sql = "select * from sangdata";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		int count = 0;
		txtResult.setText("코드\t품명\t수량\t단가\t금액\n");
		while(rs.next()) {
			txtResult.append(rs.getString("code") + "\t" + rs.getString("sang") + "\t" + rs.getString("su") + "\t" + rs.getString("dan") + "\t" + 
			df.format(rs.getInt("su") * rs.getInt("dan")) + "\n");	
			
			count++;
		}
		txtResult.append("건수 : " + count);
			
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new DbTest07Sangpum();

	}

}
