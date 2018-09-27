package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.databases.StudentDao;
import com.login.databases.StudentDaoImpl;
import com.login.model.Student;
import com.login.service.StudentBo;
import com.login.service.StudentBoImpl;

/**
 * Servlet implementation class DataInsertServlet
 */
@WebServlet("/DataInsertServlet")
public class DataInsertServlet extends HttpServlet {
	private StudentBo studentBo;
	private StudentDao studentDao;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataInsertServlet() {
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
		String rollno=request.getParameter("rollno");
		String branch=request.getParameter("branch");
		studentBo=new StudentBoImpl();
//		studentBo.insertStudent(new Student(id, fname, lname, rollno, branch));
		studentDao=new StudentDaoImpl();
		if (studentDao.ValidateUserName(fname)) {
			out.println("<h1>New Student Insertion is Succesful</h1>");
			studentBo.insertStudent(new Student(id, fname, lname, rollno, branch));
			RequestDispatcher dispatcher=request.getRequestDispatcher("/DataRetriveServlet");
			dispatcher.include(request, response);
		} else {
			out.println("<h1>User Name is already exist, try another one for Fast Name</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudentdetails.jsp");
			dispatcher.include(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

//		
		doGet(request, response);
	}

}
