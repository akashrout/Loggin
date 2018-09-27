package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.If;

import com.listener.HttpSessionLoginListener;
import com.login.databases.UserDao;
import com.login.databases.UserDaoImpl;
import com.login.model.User;
import com.login.validation.LoginValidation;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		userDao=new UserDaoImpl();
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		session.setMaxInactiveInterval(20);
	//	User user=userDao.validateuser(username, password);
		
//	if (userDao.validateuser(username, password)) {
//		 session.setAttribute("UserContext", username);
//		 out.println("You are logged in");
//		 if (username.hashCode() {
//			
//		} else {
//
//		}
//		
//	}
		
		
		
		
		if (userDao.validateuser(username, password)) {
			//out.println("<h1>Login successful CArry on</h1>");  
			 session=request.getSession();
			session.setAttribute("username", username);
			//session.setAttribute("password", password);
			//session.setMaxInactiveInterval(5);
			int logincount=HttpSessionLoginListener.count;
			out.println("<h1 style=\"color:red;\">The number of users online is:"+logincount+"</h1>");
			
			if (logincount>0) {
				RequestDispatcher dispatcher=request.getRequestDispatcher("/DataRetriveServlet");
				dispatcher.include(request, response);	
				
			} else {
				out.println("<h1 style=\"color:red;\">User already logged in, try again</h1>");
				RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
				dispatcher.include(request, response);

			}
					
		}else {
			out.println("<h1 style=\"color:red;\">Invalid login, try again</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
