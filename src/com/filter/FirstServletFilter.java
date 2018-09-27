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
 * Servlet Filter implementation class FirstServletFilter
 */
@WebFilter("/firstServlet")
public class FirstServletFilter implements Filter {

    /**
     * Default constructor. 
     */
    public FirstServletFilter() {
        // TODO Auto-generated constructor stub
    }

	
    public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String mail=request.getParameter("email");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("psw-repeat");
		String regex = "^[a-zA-Z]+$";
		String mailformat="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		String passformat="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		if (!id.matches("[0-9]+")||id.length()<3) {
			out.println("<h1 style=\"color:red;\">Id name should be number and minimum 3 digits</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}else if (!fname.matches(regex)||(fname.equals("")||(fname.length()<4))){
			out.println("<h1 style=\"color:red;\">FNmae cant be empty or less than 4 and should be alphabates </h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
			}else if(lname.equals("")||(lname.length()<4)||(!lname.matches(regex))) {
			out.println("<h1 style=\"color:red;\">LNmae cant be empty or less than 4 and should be alphabates</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}else if(address.equals("")||(address.length()<8)) {
			out.println("<h1 style=\"color:red;\">Address Should be more than 8 character</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}else if(mail.equals("")||(mail.length()<5)||(!mail.matches(mailformat))) {
			out.println("<h1 style=\"color:red;\">mail cant be empty or less than 5 and should be alphabates</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}else if (pass.equals("")||(pass.length()>15)||(pass.length()<8)||(!pass.matches(passformat))) {
			out.println("<h1 style=\"color:red;\">Please enter a Strong password (number,alphabate,special character & within (8-15) )</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
			
		}else if (!pass.equals(cpass)) {
			out.println("<h1 style=\"color:red;\">Password Doesnot match</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}
		else {				
		// pass the request along the filter chain
		chain.doFilter(request, response);
		out.println("<h1 style=\"color:red;\">Filter again</h1>");
	}
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
