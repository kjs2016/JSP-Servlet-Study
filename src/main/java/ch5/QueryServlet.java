package ch5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryServlet
 */
@WebServlet("/QueryServlet")
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");//인코딩 방식
		response.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Query Test</h1>");
		out.println("name : " + request.getParameter("name")+"<br/>");//파라미터 변수 name에 저장된 값을 얻어내는 메소드
		out.println("password : " + request.getParameter("password")+"<br/>");
		out.println("sex : " + request.getParameter("sex")+"<br/>");
		out.println("관심사항 : ");
		String favors[] = request.getParameterValues("favor");//파라미터 변수에 저장된 모든 값을 얻어내는 메소드, 변수값은 String 배열로 리턴
		for(String favor:favors)
		{
			out.println(favor+",");
		}
		out.println("<br/>");
		out.println("job : " + request.getParameter("job"));
		out.println("comments: " + request.getParameter("comments"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
