package com.wiley;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			HttpSession session=request.getSession(true);
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			 Statement st=con.createStatement();
			 String uname=request.getParameter("uname");
			 String pass=request.getParameter("pass");
			 
			 PreparedStatement pst=con.prepareStatement("SELECT password from UserDetails where username=?");
			 pst.setString(1,uname);
			 ResultSet rs = pst.executeQuery();
			 if(rs.next())
			 {
			 
				 if(rs.getString("password").equals(pass))
				 {
                   PrintWriter pw=response.getWriter();
					 
					 
					 RequestDispatcher rd1=request.getRequestDispatcher("/home.jsp");
					
					 session.setAttribute("name1", uname);
					//session.setAttribute("name2",uname);
					 rd1.include(request, response);
					 
				 }
				 else
				 {
					 PrintWriter pw=response.getWriter();
					 
					 pw.print("Invalid Password");
					 RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
					 rd.include(request, response);
				 }
				 
			 } 
			 			
			
			
			
			 
		//doGet(request, response);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}

}
