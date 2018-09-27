package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.databases.StudentDao;
import com.login.databases.StudentDaoImpl;
import com.login.model.Student;
import com.login.model.StudentGetSet;

/**
 * Servlet implementation class SearchByFastName
 */
@WebServlet("/SearchByFastName")
public class SearchByFastName extends HttpServlet {
	private StudentDao studentDao;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByFastName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String fastname=request.getParameter("fname");
		out.println("<h1>"+fastname+"</h1>");
		studentDao=new StudentDaoImpl();
		List<Student> students=studentDao.getStudentBySearch(fastname);
				
		
		
//        RequestDispatcher dispatcher=request.getRequestDispatcher("");
//        dispatcher.include(request, response);
		request.setAttribute("listofstudentsearchbyname",students);
		RequestDispatcher rd = request.getRequestDispatcher("/DataRetriveServlet");
		rd.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
