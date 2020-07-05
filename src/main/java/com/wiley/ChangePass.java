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
 * Servlet implementation class ChangePass
 */
public class ChangePass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		//	HttpSession session=request.getSession(true);
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			 Statement st=con.createStatement();
			 String usrname=request.getParameter("uname");
			 String p1=request.getParameter("pass1");
			 String p2=request.getParameter("pass2");
			 
			 
			 if(p1.contentEquals(p2))
			 {
				 PreparedStatement pst=con.prepareStatement("UPDATE userdetails SET password=? WHERE username=?");
				 pst.setString(1,p1);
				 pst.setString(2,usrname);
				 pst.executeUpdate();
				 
				 PrintWriter pw=response.getWriter();
				 
				 pw.print("Password is changed");
				 RequestDispatcher rd1=request.getRequestDispatcher("/index.jsp");
				 rd1.include(request, response);
				 
			 }
			 
			 
			 
			
				 else
				 {
					 PrintWriter pw=response.getWriter();
					 
					 pw.print("Password not matched");
					 RequestDispatcher rd=request.getRequestDispatcher("/Forgotpass.jsp");
					 rd.include(request,response);
				 }
				 
			 
			 			
			
			
			
			 
		//doGet(request, response);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}

}
		//doGet(request, response);
	


