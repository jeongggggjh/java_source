package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/ServletEx06Cookie")
public class ServletEx06Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		// 쿠키가 있는 경우 로그인한 상태를 알리고 없다면 로그인 화면 출현
		String id = null;
		String pwd = null;
		
		try {
			Cookie[] cookies = request.getCookies(); // 클라이언트의 모든 쿠키 읽기
			for(int i = 0; i < cookies.length; i++) {
				// 쿠키는 키 이름 : 값 형태로 구성됨
				String name = cookies[i].getName();
				System.out.println("name : " + name);
				
				if(name.equalsIgnoreCase("id")) {
					// 쿠키값 디코딩(암호 해제)
					id = URLDecoder.decode(cookies[i].getValue(), "utf-8");
				}
				if(name.equals("pwd")) {
					// 쿠키값 디코딩(암호 해제)
					pwd = URLDecoder.decode(cookies[i].getValue(), "utf-8");
				}
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(id != null && pwd != null) { // id, pwd가 있는 경우
			out.println(id + "님 쿠키를 통해 로그인 한 상태입니다");
			out.println("</body></html>");
			out.close();
			return;
		}
		
		// id, pwd가 없는 경우
		out.println("<h2>로그인</h2>");
		out.println("<form method='post'>");
		out.println("id : <input type='text' name='id'><br>");
		out.println("pwd : <input type='text' name='pwd'><br>");
		out.println("<input type='submit' value='로그인'><br>");
		out.println("</form>");
		out.println("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		// System.out.println(id + " " + pwd);
		
		if(id.equals("aaa") && pwd.equals("111")) {
			// 쿠키 생성
			try {
				id = URLEncoder.encode(id, "utf-8");
				Cookie idCookie = new Cookie("id", id);
				idCookie.setMaxAge(60 * 60 * 24 * 365); // 쿠키 유효기간
				
				pwd = URLEncoder.encode(pwd, "utf-8");
				Cookie pwdCookie = new Cookie("pwd", pwd);
				pwdCookie.setMaxAge(60 * 60 * 24 * 365); // 쿠키 유효기간
				
				response.addCookie(idCookie);
				response.addCookie(pwdCookie); // 클라이언트 컴에 쿠키를 저장
				
				out.println("로그인 성공 - 쿠키 설정됐다~");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			out.println("로그인 실패");
		}
		
		
		out.println("</body></html>");
		out.close();
	}

}
