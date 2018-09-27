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
import com.login.model.Student;
import com.login.model.StudentGetSet;

/**
 * Servlet implementation class EditServlet2
 */
@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	private StudentDao studentDao;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();
	        HttpSession session=request.getSession(false);
			 
			 if (session==null) {
				 out.println("<h1>Please <a href=\"login.jsp\">Login</a> to edit your details</h1>");
				
				 RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
					dispatcher.include(request, response); 
			 }else {
	        
	        String id=request.getParameter("id");  
	        String fname=request.getParameter("fname");  
	        String lname=request.getParameter("lname");  
	        String rollno=request.getParameter("rollno");
	        String branch=request.getParameter("branch");
	        
	        Student getSet=new Student(id, fname, lname, rollno, branch);
	        getSet.setId(id);
	        getSet.setFastName(fname);
	        getSet.setLastName(lname);
	        getSet.setRollNo(rollno);
	        getSet.setBranch(branch);
	        
	        studentDao=new StudentDaoImpl();
	        int status=studentDao.update(getSet);
	        if (status>0) {
	        	RequestDispatcher dispatcher=request.getRequestDispatcher("/DataRetriveServlet");
	    		dispatcher.forward(request, response);
				
			} else {
				out.println("<h1>Unable to Update</h1>");

			}
			 }
	        
	        
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
