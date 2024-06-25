package pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductList")
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("커피", 5000.0, "ㅇㅅㅇ", new Date()));
		products.add(new Product("과자", 5500.0, "ㅎㅅㅎ", new Date()));
		products.add(new Product("우유", 3500.0, "ㅡㅅㅡ", new Date()));
		products.add(new Product("젤리", 3000.0, "^ㅅ^", new Date()));
		
		request.setAttribute("products", products);
		request.getRequestDispatcher("/pshow.jsp").forward(request, response);
	}

}
