package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    
    int male = 0;
    int malePay = 0;
    int female = 0;
    int femalePay = 0;

    public Test() {
        // 1. Driver file loading
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("로딩 실패 : " + e);
            return;
        }
        // 2. DB Server와 연결
        try {
            String url = "jdbc:mariadb://localhost:3306/test";
            conn = DriverManager.getConnection(url, "root", "123");
        } catch (Exception e) {
            System.out.println("연결 실패 : " + e);
            return;
        }
        // 3. 연결된 DB Server에 SQL 실행
        // 키보드로 부서명을 입력해 해당 부서에 근무하는 직원을 표준출력장치로 출력하시오.
        // 참고 :
        // 1) PreparedStatement를 사용합니다.
        // 2) 연봉 평균은 group by를 사용합니다. 평균은 정수만 출력(소수 이하 버림)
        // 3) 인원수와 연봉은 해당 부서를 대상으로 작업합니다.

        // 스캐너를 통해 부서명 입력 받기
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("부서명: ");
            String buser = sc.next();
            
            String sql = "";
            
            sql = "SELECT jikwon_no as 사번, jikwon_name as 이름, jikwon_jik as 직급, jikwon_gen as 성별, buser_tel as 전화번호, jikwon_pay as 연봉 FROM jikwon "
                    + "INNER JOIN buser ON jikwon.buser_num = buser.buser_no WHERE buser_name = ?";
            
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, buser);
            rs = pstmt.executeQuery();
            
            // Count male and female employees
            while(rs.next()) {
                String jikwon_gen = rs.getString("성별");
                if (jikwon_gen.equals("남자")) {
                    male++;
                } else if (jikwon_gen.equals("여자")) {
                    female++;
                }

                String jikwon_no = rs.getString("사번") + "\t";
                String jikwon_name = rs.getString("이름") + "\t";
                String jikwon_jik = rs.getString("직급") + "\t";
                String jikwon_gen_output = jikwon_gen + "\t";
                System.out.println(jikwon_no + " " + jikwon_name + " " + jikwon_jik + " " + jikwon_gen_output);
            }

            // Print male and female employee counts
            System.out.println("부서에 속한 남자 인원 수: " + male);
            System.out.println("부서에 속한 여자 인원 수: " + female);
            
        } catch (Exception e) {
            System.out.println("에러 발생: " + e);
        }
    }

    public static void main(String[] args) {
        new Test();
    }
}
