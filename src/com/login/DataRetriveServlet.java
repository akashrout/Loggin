package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.model.Student;
import com.login.service.StudentBo;
import com.login.service.StudentBoImpl;

/**
 * Servlet implementation class DataRetriveServlet
 */
@WebServlet("/DataRetriveServlet")
public class DataRetriveServlet extends HttpServlet {
	private StudentBo studentBo;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataRetriveServlet() {
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
//		 List<Student> students = new ArrayList<>();
//		 students =(List<Student>) request.getAttribute("listofstudentsearchbyname");
		 HttpSession session=request.getSession(false);
		 //String uname=session.getAttribute("username").toString();
		 //String pass=session.getAttribute("password").toString();
		 if (session==null) {
			 out.println("<h1>Please <a href=\"login.jsp\">Login</a> to see your details</h1>");
			
			 RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
				dispatcher.include(request, response); 
				
			
		} else {
			out.println(session.getMaxInactiveInterval());
			
			 List<Student> students = new ArrayList<>();
			 students =(List<Student>) request.getAttribute("listofstudentsearchbyname");
			 String name=(String) session.getAttribute("username");
			 session.setAttribute("name", name);
		 if(students==null ) {
		   studentBo=new StudentBoImpl();
		
	       students=studentBo.getAllStudents();
		 }
		 
		 RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
		dispatcher.include(request, response);
//		out.println("<h1>Student Information</h1>");
//		out.print("<button type=\"button\"  onclick=\"window.location.href='addstudentdetails.jsp'\" style=\"background-color:yellow;margin-left:auto;margin-right:auto;display:block;margin-top:auto;margin-bottom:auto\">" + 
//				"   add" + 
//				"</button> ");
//		out.print("<button type=\"button\"  onclick=\"window.location.href='addstudentdetails.jsp'\" style=\"background-color:yellow;margin-left:auto;margin-right:auto;display:block;margin-top:auto;margin-bottom:auto\">" + 
//				"   delette" + 
//				"</button> ");
//		out.print("<button type=\"button\"  onclick=\"window.location.href='addstudentdetails.jsp'\" style=\"background-color:yellow;margin-left:auto;margin-right:auto;display:block;margin-top:auto;margin-bottom:auto\">" + 
//				"   edit" + 
//				"</button> ");
		out.println("<!Doctype html>\r\n" + 
				"<html>\r\n" + 
				"<style>\r\n" + 
				".btn-group button {\r\n" + 
				"    background-color: #4CAF50; /* Green background */\r\n" + 
				"    border: 1px solid green; /* Green border */\r\n" + 
				"    color: white; /* White text */\r\n" + 
				"    padding: 10px 24px; /* Some padding */\r\n" + 
				"    cursor: pointer; /* Pointer/hand icon */\r\n" + 
				"    float: left; /* Float the buttons side by side */\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"/* Clear floats (clearfix hack) */\r\n" + 
				".btn-group:after {\r\n" + 
				"    content: \"\";\r\n" + 
				"    clear: both;\r\n" + 
				"    display: table;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".btn-group button:not(:last-child) {\r\n" + 
				"    border-right: none; /* Prevent double borders */\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"/* Add a background color on hover */\r\n" + 
				".btn-group button:hover {\r\n" + 
				"    background-color: #3e8e41;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				
				"\r\n" + 
				"<div align=\"center\" class=\"btn-group\">\r\n" + 
				"  <button onclick=window.location.href='addstudentdetails.jsp'>Add</button>\r\n" + 
				"  <button onclick=window.location.href='deletebyfname.jsp'>Delete</button>\r\n" + 
				"  <button>Update</button>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
		
		out.println("<h1 align=\"center\"><u>Student Information</u></h1>");
		out.println("<html>\r\n" + 
				"<body>\r\n" + 
				"<form action=\"/LoginAndRegistration/SearchByFastName\" method=\"GET\">\r\n" + 
				"Search By Name: <input type=\"text\" name=\"fname\">\r\n" + 
				"    <input type =\"submit\" value=\"Search\"></form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		out.println("<!DOCTYPE html><html><body>\r\n" + 
				"<form action=\"/LoginAndRegistration/DeleteMultipleServlet\" method=\"GET\">");
		out.println("<table align=\"center\" border=2px cellpadding=10px ><tr><th></th><th>Id</th><th>Fast Name</th><th>Last Name</th><th>Roll Number</th><th>Branch</th><th>Delete</th><th>Edit</th></tr>");
		
		for (Student student : students) {
			
			
			out.println("<tr><td><input type=\"checkbox\" name=\"checkbox\" value=\""+student.getFastName()+"\"></td><td>"+student.getId()+"</td><td>"+student.getFastName()+"</td><td>"+student.getLastName()+"</td><td>"+student.getRollNo()+"</td><td>"+student.getBranch()+"</td><td><a href='DeleteByFastNameServlet?fname="+student.getFastName()+"'>delete</a></td><td><a href='EditServlet1?id="+student.getId()+"'>edit</a></td></tr>");
		}
		out.println("</table>");
			out.println("<input type='submit' value=\"Delete selected\" style='width:100px;margin:0 50%;position:relative;left:-50px;'>");
	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
}

 