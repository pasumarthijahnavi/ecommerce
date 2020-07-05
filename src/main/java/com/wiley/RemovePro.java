package com.wiley;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemovePro
 */
public class RemovePro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemovePro() {
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
			//HttpSession session=request.getSession(true);
			 
		
		    
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		    int ids=Integer.parseInt(request.getParameter("id"));
		    
			
    PreparedStatement ps = con.prepareStatement("DELETE from carttable  where identity=?");
       ps.setInt(1,ids);
		ps.executeUpdate();
		PrintWriter pw=response.getWriter();
		 
		 pw.print("Product removed  successfully from the  cart");
       RequestDispatcher rd = request.getRequestDispatcher("/checkcart.jsp");
      
			
			rd.include(request, response);
			//con.close();
			 
			 
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		//doGet(request, response);
	}

}
