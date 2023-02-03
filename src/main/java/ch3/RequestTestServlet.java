package ch3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTestServlet
 */
@WebServlet("/RequestTestServlet")
public class RequestTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //get방식으로 요청이 들어왓을 때 자동으로 실행되는 함수
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html;charset=EUC-KR");
		String method = request.getMethod(); //메소드 정보, 클라이언트 요청 정보의 Get, Post 여부 확인
		String query = request.getQueryString(); //클라이언트 요청 데이터 확인 가능, 어떤 데이터를 가지고 요청한것인지 확인할 수 있음
		String uri = request.getRequestURI(); 
		String url = request.getRequestURL().toString();

		PrintWriter out = response.getWriter();
		out.println("<h1>요청 테스트</h1>");
		out.println("method : "+ method +"<br/>");
		out.println("query: "+query+"<br/>");
		out.println("uri : "+uri+"<br/>");
		out.println("url : "+url+"<br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //post방식으로 요청이 들어왔을 때 자동으로 실행되는 함수
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
