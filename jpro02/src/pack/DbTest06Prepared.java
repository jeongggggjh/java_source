package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// PreparedStatement : 선처리 방식이 가능, sql문에 입력자료 적용시 ? 연산자 가능

public class DbTest06Prepared {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public DbTest06Prepared() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			String url = "jdbc:mariadb://localhost:3306/test";
			conn = DriverManager.getConnection(url, "root", "123");

			String sql = "";
			
			// 자료 추가
			
			/*
			sql = "insert into sangdata values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "10");
			pstmt.setString(2, "신상품");
			pstmt.setInt(3, 12);
			pstmt.setString(4, "5000");
			int re = pstmt.executeUpdate();
			System.out.println("insert 반환 값 : " + re);
			*/
			
			// 자료 수정
			
			/*
			sql = "update sangdata set sang = ?, su = ? where code = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "아메리카노");
			pstmt.setInt(2, 33);
			pstmt.setString(3, "10");
			int re = pstmt.executeUpdate();
			System.out.println("update 반환 값 : " + re);
			*/
			
			// 자료 삭제
			
			sql = "delete from sangdata where code = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "10");
			if(pstmt.executeUpdate() >= 1) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
			
			// 전체 자료 읽기
			sql = "select * from sangdata";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}

			System.out.println();
			// 부분 자료 읽기
			String no = "2"; // 외부에서 받았다고 가정
			// sql = "select * from sangdata where code = " + no; // SQL injection 공격 대상이 됨
			// secure coding guideline에 맞춰서 코딩한다면
			sql = "select * from sangdata where code = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, no); // 첫번째 ?에 no가 대응
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("code") + " " + rs.getString("sang") + " " + rs.getString("su") + " "
						+ rs.getString("dan"));
			}

		} catch (Exception e) {
			System.out.println("DbTest06 err : " + e);
		}
	}

	public static void main(String[] args) {
		new DbTest06Prepared();

	}

}
