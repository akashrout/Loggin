package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class DataInsertFilter
 */
@WebFilter(urlPatterns = { "/DataInsertServlet" }, servletNames = { "DataInsertServlet" })
public class DataInsertFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DataInsertFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String rollno=request.getParameter("rollno");
		String branch=request.getParameter("branch");
		String regex = "^[a-zA-Z]+$";
		if (!id.matches("[0-9]+")||id.length()<3) {
		//	out.println("<h1>Id name should be number and minimum 3 digits");
			out.println("<!DOCTYPE html>\r\n" + 
					"<html><body>\r\n" + 
					"<button onclick=\"myFunction()\">problems</button>\r\n" + 
					"<script>\r\n" + 
					"function myFunction() {\r\n" + 
					"    alert(\"Id name should be number and minimum 3 digits\");\r\n" + 
					"}\r\n" + 
					"</script></body></html>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudentdetails.jsp");
			dispatcher.include(request, response);
		/*else if(fname.equals("")||(fname.length()<4)||(!fname.matches(regex))) {
			out.println("<h1>FNmae cant be empty or less than 4 and should be alfabates");*/
		}else if (!fname.matches(regex)||(fname.equals("")||(fname.length()<4))){
			out.println("<h1>FNmae cant be empty or less than 4 and should be alphabates ");
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudentdetails.jsp");
			dispatcher.include(request, response);
			}else if(lname.equals("")||(lname.length()<4)||(!lname.matches(regex))) {
			out.println("<h1>LNmae cant be empty or less than 4 and should be alphabates");
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudentdetails.jsp");
			dispatcher.include(request, response);
		}else if(rollno.equals("")||(rollno.length()<3)||(!rollno.matches("[0-9]+"))) {
			out.println("<h1>Roll number should be Alphaneumeric");
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudentdetails.jsp");
			dispatcher.include(request, response);
		}else if(branch.equals("")||(branch.length()<3)||(!branch.matches(regex))) {
			out.println("<h1>branch cant be empty or less than 4 and should be alphabates");
			RequestDispatcher dispatcher=request.getRequestDispatcher("addstudentdetails.jsp");
			dispatcher.include(request, response);
		}
		else {
		chain.doFilter(request, response);
		out.println("<h1>HI filter again</h1>"); 
		}
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
