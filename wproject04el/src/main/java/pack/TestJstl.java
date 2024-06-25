package pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJstl
 */
@WebServlet("/TestJstl")
public class TestJstl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String irum = "정재형";
		request.setAttribute("irum", irum);
		
		Person person = new Person();
		person.setName("래시포드");
		request.setAttribute("person", person);
		
		Student student = new Student();
		student.setAge(22);
		request.setAttribute("student", student);
		
		String[] ani = {"치타, 하이에나, 랩터"};
		request.setAttribute("animal", ani);
		
		String[] foods = {"햄버거", "치킨", "피자"};
		List<Object> list = new ArrayList<Object>();
		list.add(ani);
		list.add(foods);
		request.setAttribute("list", list);
		
		// response.sendRedirect("testjstl.jsp?irum=irum&pserson=person&list=list");
		request.getRequestDispatcher("testjstl.jsp").forward(request, response);
		
	}

}
