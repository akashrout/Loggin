package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.databases.UserDao;
import com.login.databases.UserDaoImpl;
import com.login.model.User;
import com.login.service.UserBo;
import com.login.service.UserBoImpl;
import com.login.validation.LoginValidation;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserBo userBo;
	private UserDao userDao;
//	private UserDao userDao;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String mail=request.getParameter("email");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("psw-repeat");
		userBo= new UserBoImpl();
		//userBo.createUser(new User(id, fname, lname, address, mail, pass));
		//LoginValidation loginValidation=new LoginValidation();
//		if (loginValidation.verifyFastName(fname)) {
//			
//		} else {
//			out.println("Invalid 1st Name");
//		}
		userDao=new UserDaoImpl();
		if (userDao.validateemailaddress(mail)) {
			out.println("<h1 style=\"color:red;\">Registration Succesful");
			userBo.createUser(new User(id, fname, lname, address, mail, pass));
		}else {
			out.println("<h1 style=\"color:red;\">Email already  exist,try another one</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
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
