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

@WebServlet("/Grade")
public class Grade extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		int no = Integer.parseInt(request.getParameter("no"));
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		
		HttpSession session = request.getSession(true);
		ArrayList<Info> ex = (ArrayList<Info>)session.getAttribute("grade");
		
		if(ex == null) {
			ex = new ArrayList<Info>(); // Goods 객체를 담을 glist 생성
		}
		ex.add(new Info(no, name, kor, eng));	
		session.setAttribute("grade", ex);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p><table width='80%'>");
		out.println("<tr><th>번호</th><th>이름</th><th>국어</th><th>영어</th><th>총점</th></tr>");
		int cnt = 0;
		for(int i = 0; i < ex.size(); i++) {
				Info info = ex.get(i);
				out.println("<tr><td>" + info.getNo() + "</td>");
				out.println("<td>" + info.getName() + "</td>");
				out.println("<td>" + info.getKor() + "</td>");
				out.println("<td>" + info.getEng() + "</td>");
				out.println("<td>" + (info.getEng() + info.getKor()) + "</td></tr>");
				cnt ++;
		}
		// session.removeAttribute("grade");
		out.println("<tr><td colspan='2'>인원수 : " + cnt + "</td></tr>");
		out.println("</table>");
		out.println("<br>[<a href='exam.html'>새로입력</a>]");
		out.println(" [<a href='del'>세션삭제</a>]");
		out.println("</body></html>");
		out.close();
	}

}
