package mvcModelPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCModelClass
 */
@WebServlet("/MVCModelClass")
public class MVCModelClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MVCModelClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = null;
		String param = request.getParameter("page");
		
		if (param.equals("login")) {
			page = "/login.jsp";
		}
		else if (param.equals("signup")) {
			page = "/signup.jsp";
		}
		else if (param.equals("about")) {
			page = "/about.jsp";
		}
		else {
			page = "/notfound.jsp";
		}
		//pass the request and get the response
		getServletContext().getRequestDispatcher(page).forward(request, response);
	}
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
