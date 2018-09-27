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
 * Servlet implementation class EditServlet1
 */
@WebServlet("/EditServlet1")
public class EditServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDao studentDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet1() {
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
	        out.println("<h1>Update Employee</h1>");  
	        String id=request.getParameter("id");
	        studentDao=new StudentDaoImpl();
	        StudentGetSet e=studentDao.getStudentById(id);
//	        StudentGetSet e=new StudentGetSet();
	        
	        HttpSession session=request.getSession(false);
			 
			 if (session==null) {
				 out.println("<h1>Please <a href=\"login.jsp\">Login</a> to edit your details</h1>");
				
				 RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
					dispatcher.include(request, response); 
			 }else {
	        
	        out.print("<form action='EditServlet2' method='get'>");  
	        out.print("<table>");  
	        out.print("<tr><td>ID</td><td><input type='text' name='id' value='"+e.getId()+"'/></td></tr>");  
	        out.print("<tr><td>FAST Name:</td><td><input type='text' name='fname' value='"+e.getFastName()+"'/></td></tr>");  
	        out.print("<tr><td>LAST NAME:</td><td><input type='text' name='lname' value='"+e.getLastName()+"'/> </td></tr>");  
	        out.print("<tr><td>ROLL NO:</td><td><input type='text' name='rollno' value='"+e.getRollNo()+"'/></td></tr>");
	        out.print("<tr><td>BRANCH:</td><td><input type='text' name='branch' value='"+e.getBranch()+"'/></td></tr>");
	         
	        out.print("</td></tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
			 }
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		
	}

}
