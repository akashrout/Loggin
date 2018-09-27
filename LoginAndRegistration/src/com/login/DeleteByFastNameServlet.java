package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.databases.StudentDao;
import com.login.databases.StudentDaoImpl;

/**
 * Servlet implementation class DeleteByFastNameServlet
 */
@WebServlet("/DeleteByFastNameServlet")
public class DeleteByFastNameServlet extends HttpServlet {
	StudentDao studentDao;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteByFastNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		 HttpSession session=request.getSession(false);
		 
		 if (session==null) {
			 out.println("<h1>Please <a href=\"login.jsp\">Login</a> to see your details</h1>");
			
			 RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
				dispatcher.include(request, response); 
				
			
		} else {
			String name=(String) session.getAttribute("name");
		String fastname=request.getParameter("fname");
		studentDao = new StudentDaoImpl();
		
//		if (studentDao.deleteByFastName(fastname)) {
//			out.println("<h1>Success</h1>");
//		} else {
//			out.println("Unsuccessful");
//		}
		String ff = null;
		//out.println("<h1>Success</h1>");
		studentDao.deleteByFastName(fastname);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/DataRetriveServlet");
		dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
}


