package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class del
 */
@WebServlet("/del")
public class del extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session == null) {
			return;
		}
		ArrayList<Info> ex = (ArrayList<Info>)session.getAttribute("grade");
		if(ex == null) {
			return;	
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p><table width='80%'>");
		out.println("<tr><th>번호</th><th>이름</th><th>국어</th><th>영어</th><th>총점</th></tr>");
		int cnt = 0;
		out.println("<tr><td colspan='2'>인원수 : " + cnt + "</td></tr>");
		out.println("</table>");
		out.println("<br>[<a href='exam.html'>새로입력하러 두개재~~</a>]");
		out.println("</body></html>");
		out.close();
	}

}
