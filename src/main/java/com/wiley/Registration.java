package com.wiley;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
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
		 String fname=request.getParameter("fullname");
		 String uname=request.getParameter("uname");
		 String pass=request.getParameter("pass");
		 String email=request.getParameter("email");
		 PreparedStatement pst=con.prepareStatement("INSERT into UserDetails values(?,?,?,?)");
		 pst.setString(1,fname);
		 pst.setString(2,uname);
		 pst.setString(3,pass);
		 pst.setString(4,email);
		 pst.executeUpdate();
		 
		 PrintWriter pw=response.getWriter();
		 pw.println("Successfully Registered :)");
		 RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
		 rd.include(request,response);
		 st.close();
		 pst.close();
		 con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
		 
		//doGet(request, response);
	}

}
